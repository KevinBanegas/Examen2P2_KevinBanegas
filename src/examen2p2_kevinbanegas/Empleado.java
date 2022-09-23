package examen2p2_kevinbanegas;

import java.io.Serializable;


public class Empleado implements Serializable{
    private String nombre;
    private int edad;
    private int id;
    private int carrosRep;
    private int porcentaje;
    //private 
    
    private static final long SerialVersionUID = 111L;

    public Empleado(String nombre, int edad, int id, int carrosRep) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
        this.carrosRep = carrosRep;
        if(carrosRep<=5){
            porcentaje = 30;
        }else if(carrosRep<=15 && carrosRep>=6){
            porcentaje = 22;
        }else if(carrosRep>=16 && carrosRep<30){
            porcentaje = 13;
        }else if(carrosRep>=30){
            porcentaje = 7;
        }
        porcentaje = carrosRep;
    }

    public Empleado() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setCarrosExito(int id) {
        this.id = id;
    }

    public int getCarrosRep() {
        return carrosRep;
    }

    public void setCarrosRep(int carrosRep) {
        this.carrosRep = carrosRep;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    
    @Override
    public String toString() {
        return nombre;
    }
    
    
    
    
}
