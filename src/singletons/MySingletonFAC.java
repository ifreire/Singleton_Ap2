package singletons;

public class MySingletonFAC implements IMySingletonFAC
{
	private static IMySingletonFAC instance;
	private MathController mathController;
	
	public static IMySingletonFAC Instance()
	{
		if (instance == null)
			instance = new MySingletonFAC();
		
		return instance;
	}
	
	public static IMySingletonFAC Instance(int x, int y)
	{
		if (instance == null)
			instance = new MySingletonFAC();
		
		return instance;
	}
	
	private MySingletonFAC()
	{
		this.mathController = new MathController();
	}
	
	public void setXY(float x, float y)
	{
		this.mathController.setXY(x, y);
	}
	
	public void sum()
	{
		this.mathController.sum();
	}
	
	public void sub()
	{
		this.mathController.sub();
	}
	
	public void mult()
	{
		this.mathController.mult();
	}
	
	public void div()
	{
		this.mathController.div();
	}
}