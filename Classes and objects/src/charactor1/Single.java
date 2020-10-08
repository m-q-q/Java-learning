package charactor1;

public class Single {
	private Single(){
	}
	
	private static Single instance = new Single();
		public static Single getInstance()
		{
			return instance;
		}
}
/*
public class Single{
	private Single(){
	}
	private static Single instance;
	public Static single getInstance()
	{
		if(null == instance)
		{
			instance = new single();
		}
		return instance;
	}
}
*/
