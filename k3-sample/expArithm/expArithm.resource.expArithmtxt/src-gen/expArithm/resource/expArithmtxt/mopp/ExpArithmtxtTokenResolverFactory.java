/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package expArithm.resource.expArithmtxt.mopp;

/**
 * The ExpArithmtxtTokenResolverFactory class provides access to all generated
 * token resolvers. By giving the name of a defined token, the corresponding
 * resolve can be obtained. Despite the fact that this class is called
 * TokenResolverFactory is does NOT create new token resolvers whenever a client
 * calls methods to obtain a resolver. Rather, this class maintains a map of all
 * resolvers and creates each resolver at most once.
 */
public class ExpArithmtxtTokenResolverFactory implements expArithm.resource.expArithmtxt.IExpArithmtxtTokenResolverFactory {
	
	private java.util.Map<String, expArithm.resource.expArithmtxt.IExpArithmtxtTokenResolver> tokenName2TokenResolver;
	private java.util.Map<String, expArithm.resource.expArithmtxt.IExpArithmtxtTokenResolver> featureName2CollectInTokenResolver;
	private static expArithm.resource.expArithmtxt.IExpArithmtxtTokenResolver defaultResolver = new expArithm.resource.expArithmtxt.analysis.ExpArithmtxtDefaultTokenResolver();
	
	public ExpArithmtxtTokenResolverFactory() {
		tokenName2TokenResolver = new java.util.LinkedHashMap<String, expArithm.resource.expArithmtxt.IExpArithmtxtTokenResolver>();
		featureName2CollectInTokenResolver = new java.util.LinkedHashMap<String, expArithm.resource.expArithmtxt.IExpArithmtxtTokenResolver>();
		registerTokenResolver("VALUE", new expArithm.resource.expArithmtxt.analysis.ExpArithmtxtVALUETokenResolver());
	}
	
	public expArithm.resource.expArithmtxt.IExpArithmtxtTokenResolver createTokenResolver(String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public expArithm.resource.expArithmtxt.IExpArithmtxtTokenResolver createCollectInTokenResolver(String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(String tokenName, expArithm.resource.expArithmtxt.IExpArithmtxtTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(String featureName, expArithm.resource.expArithmtxt.IExpArithmtxtTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected expArithm.resource.expArithmtxt.IExpArithmtxtTokenResolver deRegisterTokenResolver(String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private expArithm.resource.expArithmtxt.IExpArithmtxtTokenResolver internalCreateResolver(java.util.Map<String, expArithm.resource.expArithmtxt.IExpArithmtxtTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(java.util.Map<String, expArithm.resource.expArithmtxt.IExpArithmtxtTokenResolver> resolverMap, String key, expArithm.resource.expArithmtxt.IExpArithmtxtTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
