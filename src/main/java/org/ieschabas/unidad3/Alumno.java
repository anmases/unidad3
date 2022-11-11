package org.ieschabas.unidad3;

public class Alumno {
    private String nombre;
    private String apellidos;
    private String nacimiento;
    private String nia;
    private String grupo;
    private char horario;
    private float notaSelectividad;

    public Alumno() {
    }

    public Alumno(String nombre, String apellidos, String nacimiento, String nia, String grupo, char horario, float notaSelectividad) {
        nombre = this.nombre;
        apellidos = this.apellidos;
        nacimiento = this.nacimiento;
        nia = this.nia;
        grupo = this.grupo;
        horario = this.horario;
        notaSelectividad = this.notaSelectividad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void setNia(String nia) {
        this.nia = nia;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public void setHorario(char horario) {
        this.horario = horario;
    }

    public void setNotaSelectividad(float notaSelectividad) {
        this.notaSelectividad = notaSelectividad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public String getNia() {
        return nia;
    }

    public char getHorario() {
        return horario;
    }

    public String getGrupo() {
        return grupo;
    }

    public float getNotaSelectividad() {
        return notaSelectividad;
    }

    public void imprimir() {
        System.out.println("---------------DATOS ALUMNO----------");
        System.out.println("Nombre:\t\t\t\t" + this.nombre);
        System.out.println("Apellidos:\t\t\t" + this.apellidos);
        System.out.println("Fecha de nacimiento:\t" + this.nacimiento);
        System.out.println("NIA:\t\t\t\t\t" + this.nia);
        System.out.println("grupo:\t\t\t\t\t" + this.grupo);
        System.out.println("Horario:\t\t\t\t\t" + this.horario);
        System.out.println("nota de selectividad: \t\t" + this.notaSelectividad);
    }
}
