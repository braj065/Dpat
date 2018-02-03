package structureHybrid.OPDecoProxyBuild.DecoBasePlatform.Decorator;

public enum DecoratorType {
	DECOONE, DECOTWO;
	
	public String toString(){
		switch(this){
		case DECOONE:
			return "One";
		case DECOTWO:
			return "Two";
			default:
				return "";
		}
	}

}
