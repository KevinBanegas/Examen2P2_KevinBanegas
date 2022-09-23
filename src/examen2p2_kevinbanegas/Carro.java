package examen2p2_kevinbanegas;

import java.io.Serializable;

public class Carro implements Serializable{
    private String marca;
    private String modelo;
    private int año;
    private String estado;
    private int costo;
    private static final long SerialVersionUID = 110L;

    public Carro(String marca, String modelo, int año, String estado, int costo) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.estado = estado;
        this.costo = costo;
    }

    public Carro() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return marca;
    }
    
    
}
