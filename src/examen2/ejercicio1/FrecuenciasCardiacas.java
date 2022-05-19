/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2.ejercicio1;

/**
 *
 * @author Yair
 */
public class FrecuenciasCardiacas {
    
    private String nombre;
    private String apellido;
    private int dia;
    private String mes;
    private int año;
    private int años;
    private double frecuenciaMaxima;
    private double frecuenciaEsperada;
    private int frecuenciaReposo;

    
    public FrecuenciasCardiacas(String nombre, String apellido, int dia, String mes, int año) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    
    public int calcularEdad(){
        años = 2022 - año;
        return años;
    }
    
    public double frecuenciaMaxima(){
        frecuenciaMaxima = 220 - años;
        return frecuenciaMaxima;
    }
    
    public double frecuenciaEsperada(){
        frecuenciaReposo = 84;
        frecuenciaEsperada = (frecuenciaMaxima - frecuenciaReposo * 0.5);
        return frecuenciaEsperada;
    }
    
}
