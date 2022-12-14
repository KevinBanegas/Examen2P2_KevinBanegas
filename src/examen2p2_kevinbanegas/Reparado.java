package examen2p2_kevinbanegas;

import java.io.Serializable;

public class Reparado implements Serializable{
    private Empleado e;
    private int cargo;
    private String exito;
    
    private static final long SerialVersionUID=169L;

    public Reparado(Empleado e, int cargo, String exito) {
        this.e = e;
        this.cargo = cargo;
        this.exito = exito;
    }

    public Reparado() {
    }
    
    
    public Empleado getE() {
        return e;
    }

    public void setE(Empleado e) {
        this.e = e;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    public String getExito() {
        return exito;
    }

    public void setExito(String exito) {
        this.exito = exito;
    }

    @Override
    public String toString() {
        return "Reparado{" + "e=" + e + ", cargo=" + cargo + ", exito=" + exito + '}';
    }
}
