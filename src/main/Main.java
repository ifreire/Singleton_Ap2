package main;

import singletons.controllers.ControllersFAC;
import singletons.interfaces.IControllersFAC;

public class Main
{
	public static void main(String[] args)
	{
		ControllersFAC.Instance().sum();
		ControllersFAC.Instance().sub();
		ControllersFAC.Instance().mult();
		ControllersFAC.Instance().div();
		
		ControllersFAC.Instance().setXY(10, 5);
		
		ControllersFAC.Instance().sum();
		ControllersFAC.Instance().sub();
		ControllersFAC.Instance().mult();
		ControllersFAC.Instance().div();
		
		IControllersFAC sing001 = ControllersFAC.Instance();
		
		sing001.sum();
		sing001.sub();
		sing001.mult();
		sing001.div();
		
		
		IControllersFAC sing002 = ControllersFAC.Instance();
		System.out.println("sing002: ");
		sing002.sub();
		sing002.setXY(100, 3);
		System.out.println("");
		System.out.println("");
		
		
		IControllersFAC sing003 = ControllersFAC.Instance();
		System.out.println("sing003: ");
		sing003.mult();
		System.out.println("");
		System.out.println("");
		
		
		IControllersFAC sing004 = ControllersFAC.Instance();
		System.out.println("sing004: ");
		sing004.div();
		sing004.setXY(20, 30);
		System.out.println("");
		System.out.println("");
		
		
		IControllersFAC sing005 = ControllersFAC.Instance();
		System.out.println("sing005: ");
		sing005.sum();
	}
}