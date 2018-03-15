package singletons.controllers;

import singletons.interfaces.IControllersFAC;

public class ControllersFAC implements IControllersFAC
{
	private static IControllersFAC instance;
	private MathController mathController;
	
	public static IControllersFAC Instance()
	{
		if (instance == null)
			instance = new ControllersFAC();
		
		return instance;
	}
	
	public static IControllersFAC Instance(int x, int y)
	{
		if (instance == null)
			instance = new ControllersFAC(x, y);
		
		return instance;
	}
	
	private ControllersFAC()
	{
		this.mathController = new MathController();
	}
	
	private ControllersFAC(int x, int y)
	{
		this.mathController = new MathController(x, y);
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