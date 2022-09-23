package examen2p2_kevinbanegas;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

public class Hilo extends Thread {

    private int costo;
    private JProgressBar pBar;
    private JLabel l;
    private Carro c;

    public Hilo(int costo, JProgressBar pBar, JLabel l, Carro c) {
        this.costo = costo;
        this.pBar = pBar;
        this.pBar.setMaximum(this.costo / 1000);
        this.l = l;
        this.c = c;
        System.out.println(pBar.getMaximum());
    }

    public Hilo() {
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public JProgressBar getpBar() {
        return pBar;
    }

    public void setpBar(JProgressBar pBar) {
        this.pBar = pBar;
    }

    public JLabel getL() {
        return l;
    }

    public void setL(JLabel l) {
        this.l = l;
    }

    public Carro getC() {
        return c;
    }

    public void setC(Carro c) {
        this.c = c;
    }

    
    @Override
    public void run() {
        try {
            for (int i = 0; i <= pBar.getMaximum(); i++) {
                pBar.setValue(i);
                System.out.println(i);
                Thread.sleep(1000);
                if (pBar.getValue() == pBar.getMaximum()) {
                    pBar.setValue(0);
                    l.setText("El Carro esta en "+c.getEstado());
                }
            }

        } catch (Exception ex) {

        }
    }
}
