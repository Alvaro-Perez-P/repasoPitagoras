package app;

import clases.TrianguloRectangulo;

public class Principal {

	public static void main(String[] args) {

		
		//ej1
		TrianguloRectangulo t2= new TrianguloRectangulo(2, 4);
		
		
		//ej2 triangulo por defecto
		TrianguloRectangulo t1=new TrianguloRectangulo();
		
		//ej3 
		double area =t1.area();
		double perimetro= t1.perimetro();
		
		double area1 =t2.area();
		double perimetro1= t2.perimetro();
		
	}

	
}
