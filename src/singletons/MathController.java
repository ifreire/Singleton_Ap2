package singletons;

class MathController
{
	private float x, y;
	
	MathController()
	{
		this.x = 5;
		this.y = 2;
	}
	
	void setXY(float x, float y)
	{
		this.x = x;
		this.y = y;
		
		System.out.println(String.format("X: %f -- Y: %f", x, y));
	}
	
	void sum()
	{
		System.out.println(this.x + this.y);
	}
	
	void sub()
	{
		System.out.println(this.x - this.y);
	}
	void mult()
	{
		System.out.println(this.x * this.y);
	}
	
	void div()
	{
		System.out.println(this.x / this.y);
	}
}