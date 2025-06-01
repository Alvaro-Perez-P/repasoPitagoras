package clases;

public class TrianguloRectangulo {

	double a;
	double b;
	double c;
	
	public TrianguloRectangulo() {
		
		this.a=1;
		this.b=1;
		this.c=this.hipotenusa();

	}
	public TrianguloRectangulo(double a, double b) throws IllegalArgumentException {
		
		if (a<=0 || b<=0) {
			throw new IllegalArgumentException("Los valores de los catetos no son validos");
		} else {
			this.a=a;
			this.b=b;
			this.c=this.hipotenusa();
		}
	}
	
	public double area() {
		return ((this.a*this.b)/2);
	}
	
	public double hipotenusa() {
		double resultado=Math.sqrt((Math.pow(this.a, 2)+(Math.pow(this.b, 2))));
		return resultado;
				
}
	
	public double perimetro() {
		return this.a+this.b+this.c;	
	}
	
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	public double getC() {
		return c;
	}
	public void setA(double a) {
		this.a = a;
	}
	public void setB(double b) {
		this.b = b;
	}
	public void setC(double c) {
		this.c = c;
	}
	@Override
	public String toString() {
		String mensaje="triangulo";
		mensaje+="Cateto a: "+this.a;
		mensaje+="Cateto b: "+this.b;
		mensaje+="Hipotenusa c: "+this.c;
		
		return mensaje;
	}
}
