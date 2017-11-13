package main;

import singletons.*;

public class Main
{
	public static void main(String[] args)
	{
		MySingleton sing001 = MySingleton.Instance();
		System.out.println("sing001: ");
		sing001.sum();
		System.out.println("");
		System.out.println("");
		
		
		MySingleton sing002 = MySingleton.Instance();
		System.out.println("sing002: ");
		sing002.sub();
		sing002.setXY(100, 3);
		System.out.println("");
		System.out.println("");
		
		
		MySingleton sing003 = MySingleton.Instance();
		System.out.println("sing003: ");
		sing003.mult();
		System.out.println("");
		System.out.println("");
		
		
		MySingleton sing004 = MySingleton.Instance();
		System.out.println("sing004: ");
		sing004.div();
		sing004.setXY(20, 30);
		System.out.println("");
		System.out.println("");
		
		
		MySingleton sing005 = MySingleton.Instance();
		System.out.println("sing005: ");
		sing005.sum();
		
		
		MathController mc = new MathController();
	}
}