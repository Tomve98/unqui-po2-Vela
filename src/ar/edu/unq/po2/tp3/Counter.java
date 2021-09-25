package ar.edu.unq.po2.tp3;

public class Counter {
	public static void main (String args[]) {
	String a = "abc";
	String s = a;
	String t;

	System.out.println(a.substring(1,3).equals("bc"));
	
	}
} 


///4

//s.length() = devuelve 3
//t.length() = da error porque la variable t no esta inicializada
//1+a= 1abc
//a.toUpperCase() = ABC
//"Libertad".indexOf("r") = 4
//"Universidad".lastIndexOf("i") = 7
//"Quilmes".substring(2,4) = il
//(a.length()+a).startsWith("a") = false
//s==a = true
//a.substring(1,3).equals("bc") = true


///5
//Los tipos de datos primitivos son aquellos que no necesitan ser declarados y se almacenan como un valor literal
//int es un tipo de dato primitivo de Java que hace referencia a un numero entero, en cambio Integer es una clase o un metodo el cual puede o no contener un int
//Si se define un int, su valor predeterminado es 0. Si se define un Integer su valor es null
// 