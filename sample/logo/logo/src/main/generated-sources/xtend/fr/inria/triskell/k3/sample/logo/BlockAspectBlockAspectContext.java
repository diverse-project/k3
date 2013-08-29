package fr.inria.triskell.k3.sample.logo;

import fr.inria.triskell.k3.sample.logo.BlockAspectBlockAspectProperties;
import java.util.Map;
import kmLogo.ASM.Block;

@SuppressWarnings("all")
public class BlockAspectBlockAspectContext {
  public final static BlockAspectBlockAspectContext INSTANCE = new BlockAspectBlockAspectContext();
  
  public static BlockAspectBlockAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<Block,BlockAspectBlockAspectProperties> map = new java.util.HashMap<Block, fr.inria.triskell.k3.sample.logo.BlockAspectBlockAspectProperties>();
  
  public Map<Block,BlockAspectBlockAspectProperties> getMap() {
    return map;
  }
}
