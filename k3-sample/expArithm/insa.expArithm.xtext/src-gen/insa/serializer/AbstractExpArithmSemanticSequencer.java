package insa.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import expArithm.Division;
import expArithm.ExpArithmPackage;
import expArithm.ExpressionArithm;
import expArithm.Moins;
import expArithm.Mult;
import expArithm.Plus;
import expArithm.Valeur;
import insa.services.ExpArithmGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public abstract class AbstractExpArithmSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ExpArithmGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ExpArithmPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ExpArithmPackage.DIVISION:
				if(context == grammarAccess.getDivisionRule() ||
				   context == grammarAccess.getEltExpRule()) {
					sequence_Division(context, (Division) semanticObject); 
					return; 
				}
				else break;
			case ExpArithmPackage.EXPRESSION_ARITHM:
				if(context == grammarAccess.getExpressionArithmRule()) {
					sequence_ExpressionArithm(context, (ExpressionArithm) semanticObject); 
					return; 
				}
				else break;
			case ExpArithmPackage.MOINS:
				if(context == grammarAccess.getEltExpRule() ||
				   context == grammarAccess.getMoinsRule()) {
					sequence_Moins(context, (Moins) semanticObject); 
					return; 
				}
				else break;
			case ExpArithmPackage.MULT:
				if(context == grammarAccess.getEltExpRule() ||
				   context == grammarAccess.getMultRule()) {
					sequence_Mult(context, (Mult) semanticObject); 
					return; 
				}
				else break;
			case ExpArithmPackage.PLUS:
				if(context == grammarAccess.getEltExpRule() ||
				   context == grammarAccess.getPlusRule()) {
					sequence_Plus(context, (Plus) semanticObject); 
					return; 
				}
				else break;
			case ExpArithmPackage.VALEUR:
				if(context == grammarAccess.getEltExpRule() ||
				   context == grammarAccess.getValeurRule()) {
					sequence_Valeur(context, (Valeur) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (EltGauche=EltExp eltDroit=EltExp)
	 */
	protected void sequence_Division(EObject context, Division semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpArithmPackage.Literals.OPERATEUR_BINAIRE__ELT_GAUCHE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpArithmPackage.Literals.OPERATEUR_BINAIRE__ELT_GAUCHE));
			if(transientValues.isValueTransient(semanticObject, ExpArithmPackage.Literals.OPERATEUR_BINAIRE__ELT_DROIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpArithmPackage.Literals.OPERATEUR_BINAIRE__ELT_DROIT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDivisionAccess().getEltGaucheEltExpParserRuleCall_1_0(), semanticObject.getEltGauche());
		feeder.accept(grammarAccess.getDivisionAccess().getEltDroitEltExpParserRuleCall_2_0(), semanticObject.getEltDroit());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     racine=EltExp?
	 */
	protected void sequence_ExpressionArithm(EObject context, ExpressionArithm semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (EltGauche=EltExp eltDroit=EltExp)
	 */
	protected void sequence_Moins(EObject context, Moins semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpArithmPackage.Literals.OPERATEUR_BINAIRE__ELT_GAUCHE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpArithmPackage.Literals.OPERATEUR_BINAIRE__ELT_GAUCHE));
			if(transientValues.isValueTransient(semanticObject, ExpArithmPackage.Literals.OPERATEUR_BINAIRE__ELT_DROIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpArithmPackage.Literals.OPERATEUR_BINAIRE__ELT_DROIT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMoinsAccess().getEltGaucheEltExpParserRuleCall_1_0(), semanticObject.getEltGauche());
		feeder.accept(grammarAccess.getMoinsAccess().getEltDroitEltExpParserRuleCall_2_0(), semanticObject.getEltDroit());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (EltGauche=EltExp eltDroit=EltExp)
	 */
	protected void sequence_Mult(EObject context, Mult semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpArithmPackage.Literals.OPERATEUR_BINAIRE__ELT_GAUCHE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpArithmPackage.Literals.OPERATEUR_BINAIRE__ELT_GAUCHE));
			if(transientValues.isValueTransient(semanticObject, ExpArithmPackage.Literals.OPERATEUR_BINAIRE__ELT_DROIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpArithmPackage.Literals.OPERATEUR_BINAIRE__ELT_DROIT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMultAccess().getEltGaucheEltExpParserRuleCall_1_0(), semanticObject.getEltGauche());
		feeder.accept(grammarAccess.getMultAccess().getEltDroitEltExpParserRuleCall_2_0(), semanticObject.getEltDroit());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (EltGauche=EltExp eltDroit=EltExp)
	 */
	protected void sequence_Plus(EObject context, Plus semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpArithmPackage.Literals.OPERATEUR_BINAIRE__ELT_GAUCHE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpArithmPackage.Literals.OPERATEUR_BINAIRE__ELT_GAUCHE));
			if(transientValues.isValueTransient(semanticObject, ExpArithmPackage.Literals.OPERATEUR_BINAIRE__ELT_DROIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpArithmPackage.Literals.OPERATEUR_BINAIRE__ELT_DROIT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPlusAccess().getEltGaucheEltExpParserRuleCall_1_0(), semanticObject.getEltGauche());
		feeder.accept(grammarAccess.getPlusAccess().getEltDroitEltExpParserRuleCall_2_0(), semanticObject.getEltDroit());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     valeur=DOUBLE
	 */
	protected void sequence_Valeur(EObject context, Valeur semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpArithmPackage.Literals.VALEUR__VALEUR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpArithmPackage.Literals.VALEUR__VALEUR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getValeurAccess().getValeurDOUBLETerminalRuleCall_0(), semanticObject.getValeur());
		feeder.finish();
	}
}
