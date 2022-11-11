package org.ieschabas.unidad3;

public class pruebaPunto {

	public static void main(String[] args) {
		//instanciamos los dos abjetos de la clase Punto
		
		Punto p1= new Punto();
		Punto p2= new Punto();
		
		//instanciamos otro punto con un constructor sobrecargado
		
		Punto p3= new Punto(3,4);
		
		p1.setX(6.0);
		p1.setY(4.0);
		
		p2.setX(2.0);
		p2.setY(1.0);
		
		
		//asignamos valores a p1
		/*p1.x=6.0;
		p1.y=4.0;
		
		p2.x=2.0;
		p2.y=1.0;*/
		
		
		
		System.out.println(p3.getX() + " "+ p3.getY());

	}

}
