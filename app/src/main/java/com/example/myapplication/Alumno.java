package com.example.myapplication;

public class Alumno {

    //Declaramos las Variables.
    String nombre, apellido;
    int edad, noControl;

    //Creamos el Contructor, asi como tambien con los parametros de los atributos.
    public Alumno(String nombre, String apellido, int edad, int noControl){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.noControl=noControl;
    }

    //Finalmente Creamos un Metodo que Imprima los Atributos.
    public String ImprimirVariables(){
        String guardar="Nombre: " + nombre + "\n" +
                "Apellido: " + apellido + "\n" +
                "Edad: " + edad + "\n" +
                "No.Control: " + noControl;
        return guardar;
    }
}