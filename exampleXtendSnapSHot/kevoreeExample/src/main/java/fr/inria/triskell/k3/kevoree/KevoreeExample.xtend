package fr.inria.triskell.k3.kevoree

import java.awt.BorderLayout
import java.awt.Dimension
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JPanel
import javax.swing.JTextArea
import javax.swing.JTextPane
import org.kevoree.annotation.ComponentType
import org.kevoree.annotation.DictionaryAttribute
import org.kevoree.annotation.DictionaryType
import org.kevoree.annotation.Port
import org.kevoree.annotation.PortType
import org.kevoree.annotation.ProvidedPort
import org.kevoree.annotation.Provides
import org.kevoree.annotation.RequiredPort
import org.kevoree.annotation.Requires
import org.kevoree.annotation.Start
import org.kevoree.annotation.Stop
import org.kevoree.annotation.Update
import org.kevoree.framework.AbstractComponentType
import org.kevoree.framework.MessagePort
import org.kevoree.framework.KevoreeMessage
import java.awt.event.KeyListener
import java.awt.event.KeyAdapter
import java.awt.event.KeyEvent
import javax.swing.JScrollPane
import javax.swing.text.BadLocationException
import javax.swing.text.StyleContext
import javax.swing.text.StyleConstants
import java.awt.Color
import org.kevoree.library.ui.layout.KevoreeLayout

/**
 * @author ffouquet
 */
@Provides(value=@ProvidedPort(name = "showText", type = PortType.MESSAGE))
@Requires(value=
        @RequiredPort(name = "textEntered", type = PortType.MESSAGE, optional = true)
)
@DictionaryType(value=
        @DictionaryAttribute(name = "singleFrame", defaultValue = "true", optional = true)
)
@ComponentType
public class FakeConsole extends AbstractComponentType {

    private MyFrame frame = null;
    private JFrame localFrame = null;



    @Start
    public def void start() {

        frame = new MyFrame(this);
       // frame.setTitle(getName() + "@@@" + getNodeName());
      //  frame.setVisible(true);
        frame.appendSystem("/***** CONSOLE INITIALIZED  ********/ ");
        if(Boolean.valueOf(getDictionary.get("singleFrame") as String)) {
            KevoreeLayout.getInstance().displayTab(frame as JPanel,getName());
        } else {
            localFrame = new JFrame(getName() + "@@@" + getNodeName());
            localFrame.setContentPane(frame);
            localFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            localFrame.pack();
            localFrame.setVisible(true);
        }
    }

	
	@Stop
	    public def void stop() {
        if(Boolean.valueOf(getDictionary().get("singleFrame") as String)) {
            KevoreeLayout.getInstance().releaseTab(getName());
        } else {
            if(localFrame != null) {
                localFrame.dispose();
            }
        }
        frame = null;
        localFrame = null;
    }

    @Update
    public def void update() {
        if(Boolean.valueOf(getDictionary().get("singleFrame") as String)) {
            if(localFrame != null) {
                KevoreeLayout.getInstance().displayTab(frame as JPanel,getName());
                localFrame.dispose();
                localFrame = null;
            }
        } else {
            if(localFrame == null) {
                KevoreeLayout.getInstance().releaseTab(getName());
                localFrame = new JFrame(getName() + "@@@" + getNodeName());
                localFrame.setContentPane(frame);
                localFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                localFrame.pack();
                localFrame.setVisible(true);
            }
        }
    }

    public def void appendSystem(String text) {
        frame.appendSystem(text);
    }

    public def void appendOutgoing(String text) {
        frame.appendOutgoing(text);
        if (isPortBinded("textEntered")) {
            getPortByName("textEntered", typeof(MessagePort)).process(text);
        }
    }

    @Port(name = "showText")
    public def void appendIncoming(Object text) {
        if (text != null) {
            if (text instanceof KevoreeMessage) {
                var KevoreeMessage kmsg =  text as KevoreeMessage;
                frame.appendIncomming("->");
                for (String key : kmsg.getKeys()) {
                    frame.appendIncomming(key + "=" + kmsg.getValue(key));
                }
            } else {
                frame.appendIncomming("->" + text.toString());
            }
        }
    }

   


}

	class MyActionListener implements ActionListener{
		private JTextArea inputTextField;
		private FakeConsole console;


		public new (JTextArea inputTextField, FakeConsole console){
			this.inputTextField= inputTextField
			this.console = console
		}
		@Override
		public override def void actionPerformed(ActionEvent e) {
                    if (inputTextField.getText().length() > 1) {
                        console.appendOutgoing(inputTextField.getText());
                    }
	}
	
	}

	class MyKeyListener extends KeyAdapter{
                
                private JTextArea inputTextField;
		private FakeConsole console;


		public new (JTextArea inputTextField, FakeConsole console){
			this.inputTextField= inputTextField
			this.console = console
		}
		 public  override def   void keyReleased(KeyEvent e) {
                    if (e.getKeyCode() == KeyEvent.VK_ENTER ) {
                        if (e.isControlDown()) {
                            inputTextField.append("\n");
                        } else {
                            if (inputTextField.getText().length() > 1) {
                                console.appendOutgoing(inputTextField.getText());
                            }
                            inputTextField.setText("");
                        }
                    }
                }

	}

  public class MyFrame extends JPanel {
		private FakeConsole console;
        private JTextPane screen;
        private JTextArea inputTextField;
        private JButton send;
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 600;

        public new(FakeConsole console) {
        	this.console=console;
            setPreferredSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT));
            setLayout(new BorderLayout());
            send = new JButton("Send");
            send.addActionListener(new MyActionListener(inputTextField,console));

            screen = new JTextPane();
            screen.setFocusable(false);
            screen.setEditable(false);
            var doc = screen.getStyledDocument();
            var def1 = StyleContext.getDefaultStyleContext().
                    getStyle(StyleContext.DEFAULT_STYLE);
            var system = doc.addStyle("system", def1);
            StyleConstants.setForeground(system, Color.GRAY);

            var incoming = doc.addStyle("incoming", def1);
            StyleConstants.setForeground(incoming, Color.BLUE);

            var outgoing = doc.addStyle("outgoing", def1);
            StyleConstants.setForeground(outgoing, Color.GREEN);


            val INITIAL_MESSAGE = "Type your text here";
            inputTextField = new JTextArea();
            inputTextField.setText(INITIAL_MESSAGE);
            inputTextField.setFocusable(true);
            inputTextField.setRequestFocusEnabled(true);
            inputTextField.requestFocus();
            inputTextField.setCaretPosition(0);
            inputTextField.setSelectionStart(0);
            inputTextField.setSelectionEnd(INITIAL_MESSAGE.length());

            inputTextField.addKeyListener(new MyKeyListener(inputTextField,console));

            var bottomPanel = new JPanel();
            bottomPanel.setLayout(new BorderLayout());
            bottomPanel.add(inputTextField, BorderLayout.CENTER);
            bottomPanel.add(send, BorderLayout.EAST);

            add(new JScrollPane(screen), BorderLayout.CENTER);
            add(bottomPanel, BorderLayout.SOUTH);
            setVisible(true);
        }

        public def void appendSystem(String text) {
            try {
                var doc = screen.getStyledDocument();
                doc.insertString(doc.getLength(), formatForPrint(text), doc.getStyle("system"));
            } catch (BadLocationException ex) {
                ex.printStackTrace();
            }
        }

        public def void appendIncomming(String text) {
            try {
                var doc = screen.getStyledDocument();
                doc.insertString(doc.getLength(), formatForPrint(text), doc.getStyle("incoming"));
                screen.setCaretPosition(doc.getLength());
            } catch (BadLocationException ex) {
                ex.printStackTrace();
            }
        }

        public def void appendOutgoing(String text) {
            try {
                var doc = screen.getStyledDocument();
                doc.insertString(doc.getLength(), ">" + formatForPrint(text), doc.getStyle("outgoing"));
            } catch (BadLocationException ex) {
             ex.printStackTrace();
            }
        }

        private def String formatForPrint(String text) {
            if (text.endsWith("\n")) return  text
            else return text + "\n";
        }
    }
