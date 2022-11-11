package org.ieschabas.unidad3;

public class perroApp {
    public static void main(String[] args) {
       perro perro1 = new perro();
       perro1.setRaza("pequinés");
       System.out.println("La raza del perro es\t" + perro1.getRaza());
       perro1.setColorOjos("marrón");
       System.out.println("su color de ojos es\t" + perro1.getColorOjos());
       perro1.setColorPelaje("blanco");
       System.out.println("su color de pelo es\t" + perro1.getColorOjos());
       perro1.setSexo("hembra");
       System.out.println("su sexo es\t" + perro1.getSexo());
    }
}
