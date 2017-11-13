package main;

import singletons.*;

public class Main
{
	public static void main(String[] args)
	{
		System.out.println("sing001: ");
		MySingleton sing001 = MySingleton.Instance();
		sing001.sum();
		System.out.println("");
		System.out.println("");
		
		System.out.println("sing002: ");
		MySingleton sing002 = MySingleton.Instance();
		sing002.sub();
		sing002.setXY(100, 3);
		System.out.println("");
		System.out.println("");
		
		System.out.println("sing003: ");
		MySingleton sing003 = MySingleton.Instance();
		sing003.mult();
		System.out.println("");
		System.out.println("");
		
		System.out.println("sing004: ");
		MySingleton sing004 = MySingleton.Instance();
		sing004.div();
		sing004.setXY(20, 30);
		System.out.println("");
		System.out.println("");
		
		System.out.println("sing005: ");
		MySingleton sing005 = MySingleton.Instance();
		sing005.sum();
		
		MathController mc = new MathController();
	}
}