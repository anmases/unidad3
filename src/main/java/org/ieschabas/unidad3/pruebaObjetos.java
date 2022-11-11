package org.ieschabas.unidad3;

public class pruebaObjetos {
    public static void main(String[] args) {
        Alumno alu1; //son null por defecto
        Alumno alu4;
        Alumno alu5;
        Alumno delegado;

        alu1 = new Alumno();
        delegado = alu1;
        alu1.setNombre("Juan");

        alu4 = new Alumno();
        alu4.setNombre("Clara");

        alu5 = new Alumno();
        alu5.setNombre("Juan");

        if (alu1 == delegado) {
            System.out.println("estos objetos son iguales");
        } else {
            System.out.println("estos objetos no son iguales");
        }
        if (alu1 == alu5) {
            System.out.println("estos objetos son iguales");
        } else {
            System.out.println("estos objetos no son iguales");
        }
        if (alu5 == alu4) {
            System.out.println("estos objetos son iguales");
        } else {
            System.out.println("estos objetos no son iguales");
        }
        if (alu5 == alu1) {
            System.out.println("estos objetos son iguales");
        } else {
            System.out.println("estos objetos no son iguales");
        }
    }
}
