package singletons;

public class MySingleton
{
	private static MySingleton instance;
	private MathController mathController;
	
	public static MySingleton Instance()
	{
		if (instance == null)
			instance = new MySingleton();
		
		return instance;
	}
	
	private MySingleton()
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