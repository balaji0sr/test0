package com.learning;

public class Dog {
	String name ;
	public static void main (String[]args)
	{
	Dog dogl = new Dog();
	
	dogl.name = "Bart" ;dogl.bark() ;
	Dog[] myDogs = new Dog[3];
 myDogs[0] = new Dog() ;
 myDogs[1] = new Dog() ;
 myDogs[2] = dogl  ;
	myDogs[0].name = "max";
	myDogs[1].name = "tax"	;
	System.out .print( "!ast dog's name is ");
	System.out.println (myDogs [2] . name ) ;
	int x = 0;
	while(x < myDogs.length)
	{
	myDogs[x].bark() ;
	x = x + 1;
	}
}

public void bark() 
{
System.out.println(name + " says Ruff !");
}
}
