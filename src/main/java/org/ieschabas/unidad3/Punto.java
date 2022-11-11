package org.ieschabas.unidad3;

public class Punto {
	// creamos los campos
	private double x;
	private double y;

	public Punto() {
	}


	// constructor sobrecargado


	/* public Punto(double x, double y) {
	  this.x = x; 
	  this.y = y; 
	  }*/

	
//es lo mismo que el anterior
	
	public Punto(double ordenada, double abcisa) {
		x = ordenada;
		y = abcisa;
	}
	
	//getters y setters de la clase
	
	public double getX() {
		return x;
	}
	
	
	public void setX(double x) {
		this.x=x;
	}
	
	
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y=y;
	}

}
