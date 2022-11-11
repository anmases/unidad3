package org.ieschabas.unidad3;

import java.util.Scanner;

public class PruebaAlumno {
    /**
     * Método principal
     *
     * @param args
     */
    public static void main(String[] args) {

        try (Scanner lector = new Scanner(System.in)) {
            int num;
            Alumno alumno1 = new Alumno();
            Alumno alumno2 = new Alumno();
            do {
                System.out.println("------------MENU------------\n 1.Añadir alumno\n 2.Modificar alumno\n 3.Eliminar alumno\n 4.Imprimir datos del alumno\n 5.Calcular nota media selectividad\n 6.Salir");
                num = lector.nextInt();
                switch (num) {
                    case 1:
                        System.out.println("introduzca los datos de un alumno:");

                        //nos devolverá el objeto alumno1 con los datos
                        alumno1 = crearAlumno(alumno1, lector);
                        //nos devolverá el objeto alumno2 con los datos

                        System.out.println("introduza los datos de otro alumno:");
                        alumno2 = crearAlumno(alumno2, lector);

                        alumno1.imprimir();
                        alumno2.imprimir();
                        break;
                    case 2:
                        System.out.println("introduce el NIA del alumno");
                        String opcionNia = lector.next();
                        if (alumno1.getNia().equalsIgnoreCase(opcionNia)) {
                            alumno1.imprimir();

                            alumno1 = modificarAlumno(alumno1, lector);
                        } else if (alumno2.getNia().equalsIgnoreCase(opcionNia)) {
                            alumno2.imprimir();

                            alumno2 = modificarAlumno(alumno2, lector);

                        } else {
                            System.out.println("El alumno no existe");
                        }
                        break;
                    case 3:
                        System.out.println("introduce el NIA del alumno");
                        opcionNia = lector.next();
                        if (alumno1.getNia().equalsIgnoreCase(opcionNia)) {
                            alumno1.imprimir();
                        } else if (alumno2.getNia().equalsIgnoreCase(opcionNia)) {
                            alumno2.imprimir();
                        } else {
                            System.out.println("el alumno introducido no existe");
                        }
                        System.out.println("¿desea realmente eliminar el alumno? Esta acción será irreversible [Si, No]");
                        String borrador = lector.next();
                        if (borrador.equalsIgnoreCase("si")) {
                            if (alumno1.getNia().equalsIgnoreCase(opcionNia)) {
                                alumno1 = borrarAlumno(alumno1);
                                System.out.println("alumno borrado correctamente");
                            } else if (alumno2.getNia().equalsIgnoreCase(opcionNia)) {
                                alumno2 = borrarAlumno(alumno2);
                                System.out.println("alumno borrado correctamente");
                            } else {
                                System.out.println("El alumno introducido no existe");
                            }

                        } else if (borrador.equalsIgnoreCase("no")) {
                            System.out.println("operación cancelada");
                        }


                        break;
                    case 4:
                        System.out.println("introduce el NIA del alumno");
                        opcionNia = lector.next();
                        if (alumno1 != null) {
                            if (alumno1.getNia().equalsIgnoreCase(opcionNia)) {
                                alumno1.imprimir();
                            }
                        } else {
                            System.out.println("error: el alumno no existe");
                        }
                        if (alumno2 != null) {
                            if (alumno2.getNia().equalsIgnoreCase(opcionNia)) {
                                alumno2.imprimir();
                            }
                        } else {
                            System.out.println("error: el alumno no existe");
                        }
                        break;
                    case 5:
                        float media;
                        try {
                            media = (alumno1.getNotaSelectividad() + alumno2.getNotaSelectividad()) / 2.0f;
                            System.out.println("La nota media es\t" + media);
                        } catch (NullPointerException error) {
                            System.out.println("Error: no se puede hacer la media");
                        }

                        break;
                    case 6:
                        System.out.println("hasta luego!");
                        break;
                    default:
                        System.out.println("la opción introducida no es correcta");
                }
            }
            while (num < 6);
        } catch (
                Exception e) {
            System.out.println("Error: el valor introducido no es valido");
        }
    }


    /**
     * método para borrar valores de los atributos del alumno
     *
     * @param alumno
     * @return devuelve un objeto tipo alumno
     */
    private static Alumno borrarAlumno(Alumno alumno) {
        return null;
    }

    /**
     * Método para modificar datos del alumno
     *
     * @param alumno
     * @param lector
     * @return Devuelve un objeto de tipo alumno nulo
     */
    private static Alumno modificarAlumno(Alumno alumno, Scanner lector) {
        System.out.println("¿Qué dato desea modificar? [Nombre|Apellidos|Fecha de nacimiento|NIA|Grupo|Horario");
        String dato = lector.next();
        if (dato.equalsIgnoreCase("Nombre")) {
            System.out.println("introduzca el nuevo nombre:");
            alumno.setNombre(lector.next().toUpperCase());
            alumno.imprimir();
            System.out.println("el cambio se ha realizado correctamente");
        } else if (dato.equalsIgnoreCase("Apellidos")) {
            System.out.println("introduzca los nuevos Apellidos:");
            alumno.setApellidos(lector.next().toUpperCase());
            alumno.imprimir();
            System.out.println("el cambio se ha realizado correctamente");
        } else if (dato.equalsIgnoreCase("Fecha de nacimiento")) {
            System.out.println("introduzca la nueva fecha de nacimiento:");
            alumno.setNacimiento(lector.next().toUpperCase());
            alumno.imprimir();
            System.out.println("el cambio se ha realizado correctamente");
        } else if (dato.equalsIgnoreCase("NIA")) {
            System.out.println("introduzca El nuevo NIA:");
            alumno.setNia(lector.next().toUpperCase());
            alumno.imprimir();
            System.out.println("el cambio se ha realizado correctamente");
        } else if (dato.equalsIgnoreCase("Grupo")) {
            System.out.println("introduzca El nuevo Grupo:");
            alumno.setGrupo(lector.next().toUpperCase());
            alumno.imprimir();
            System.out.println("el cambio se ha realizado correctamente");
        } else if (dato.equalsIgnoreCase("Horario")) {
            System.out.println("introduzca El nuevo horario:");
            alumno.setHorario(lector.next().toUpperCase().charAt(0));
            alumno.imprimir();
            System.out.println("el cambio se ha realizado correctamente");
        } else if (dato.equalsIgnoreCase("Nota Media")) {
            System.out.println("introduzca la nueva nota media:");
            alumno.setNotaSelectividad(lector.nextFloat());
            alumno.imprimir();
            System.out.println("el cambio se ha realizado correctamente");
        } else {
            System.out.println("la opción es incorrecta");
        }
        return alumno;
    }

    /**
     * El método crea un objeto alumno solicitando los datos al usuario.
     *
     * @param alumno
     * @param lector
     * @return devuelve un objeto tipo alumno
     */
    private static Alumno crearAlumno(Alumno alumno, Scanner lector) {
        System.out.println("introduce el nombre del alumno:");
        alumno.setNombre(lector.next().toUpperCase());
        lector.nextLine();
        System.out.println("introduce los apellidos del alumno:");
        alumno.setApellidos(lector.nextLine().toUpperCase());
        lector.nextLine();
        System.out.println("introduce el NIA del alumno:");
        alumno.setNia(lector.next());
        lector.nextLine();
        System.out.println("introduce la fecha de nacimiento del alumno:");
        alumno.setNacimiento(lector.next());
        lector.nextLine();
        System.out.println("introduce el grupo del alumno:");
        alumno.setGrupo(lector.next().toUpperCase());
        lector.nextLine();
        System.out.println("introduce el horario del alumno:");
        alumno.setHorario(lector.next().toUpperCase().charAt(0));
        System.out.println("introduzca la nota de selectividad del alumno:");
        alumno.setNotaSelectividad(lector.nextFloat());
        return alumno;
    }
}
