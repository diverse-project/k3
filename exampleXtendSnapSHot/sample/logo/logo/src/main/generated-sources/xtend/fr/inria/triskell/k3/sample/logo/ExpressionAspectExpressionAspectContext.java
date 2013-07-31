package fr.inria.triskell.k3.sample.logo;

import fr.inria.triskell.k3.sample.logo.ExpressionAspectExpressionAspectProperties;
import java.util.Map;
import kmLogo.ASM.Expression;

@SuppressWarnings("all")
public class ExpressionAspectExpressionAspectContext {
  public final static ExpressionAspectExpressionAspectContext INSTANCE = new ExpressionAspectExpressionAspectContext();
  
  public static ExpressionAspectExpressionAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<Expression,ExpressionAspectExpressionAspectProperties> map = new java.util.HashMap<Expression, fr.inria.triskell.k3.sample.logo.ExpressionAspectExpressionAspectProperties>();
  
  public Map<Expression,ExpressionAspectExpressionAspectProperties> getMap() {
    return map;
  }
}
