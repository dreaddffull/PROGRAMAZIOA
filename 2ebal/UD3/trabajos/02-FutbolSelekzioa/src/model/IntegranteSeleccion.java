package model;

public class IntegranteSeleccion{

protected int id;
protected String nombre;
private String apellidos;
private int edad;

public IntegranteSeleccion(int id, String nombre, String apellidos, int edad){
    this.edad = edad;
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.id = id;
}

public int getId() {
    return id; 
}

public void setId(int id) {
    this.id = id;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getApellidos() {
    return apellidos;
}

public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
}

public int getEdad() {
    return edad;
}

public void setEdad(int edad) {
    this.edad = edad;
}

public void concentrarse(){
    System.out.println("Concentrarse");
}

public void viajar(){
    System.out.println("viajar");
}
}