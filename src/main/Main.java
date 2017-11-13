package main;

import singletons.*;

public class Main
{
	public static void main(String[] args)
	{
		MySingletonFAC.Instance().sum();
		MySingletonFAC.Instance().sub();
		MySingletonFAC.Instance().mult();
		MySingletonFAC.Instance().div();
		
		MySingletonFAC.Instance().setXY(10, 5);
		
		MySingletonFAC.Instance().sum();
		MySingletonFAC.Instance().sub();
		MySingletonFAC.Instance().mult();
		MySingletonFAC.Instance().div();
		
		IMySingletonFAC sing001 = MySingletonFAC.Instance();
		
		sing001.sum();
		sing001.sub();
		sing001.mult();
		sing001.div();
		
		System.out.print((8 + 8 + 9 + 8.5 + 9 + 10 + 9.5 + 9)/8);
		
		
//		IMySingletonFAC sing001 = MySingletonFAC.Instance();
//		System.out.println("sing001: ");
//		sing001.sum();
//		System.out.println("");
//		System.out.println("");
//		
//		
//		IMySingletonFAC sing002 = MySingletonFAC.Instance();
//		System.out.println("sing002: ");
//		sing002.sub();
//		sing002.setXY(100, 3);
//		System.out.println("");
//		System.out.println("");
//		
//		
//		IMySingletonFAC sing003 = MySingletonFAC.Instance();
//		System.out.println("sing003: ");
//		sing003.mult();
//		System.out.println("");
//		System.out.println("");
//		
//		
//		IMySingletonFAC sing004 = MySingletonFAC.Instance();
//		System.out.println("sing004: ");
//		sing004.div();
//		sing004.setXY(20, 30);
//		System.out.println("");
//		System.out.println("");
//		
//		
//		IMySingletonFAC sing005 = MySingletonFAC.Instance();
//		System.out.println("sing005: ");
//		sing005.sum();
//		
//		
//		//MathController mc = new MathController();
	}
}