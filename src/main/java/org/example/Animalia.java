package org.example;

public abstract class Animalia {

    private String espeziea;
    private boolean adoptatua = false;
    private int  adina;
    private double pisua;
    private String izena;


    public Animalia(String espeziea, boolean adoptatua, int adina, double pisua, String izena) {
        this.espeziea = espeziea;
        this.adoptatua = adoptatua;
        this.adina = adina;
        this.pisua = pisua;
        this.izena = izena;
    }

    public String getEspeziea() {
        return espeziea;
    }

    public void setEspeziea(String espeziea) {
        this.espeziea = espeziea;
    }

    public boolean isAdoptatua() {
        return adoptatua;
    }

    public void setAdoptatua(boolean adoptatua) {
        this.adoptatua = adoptatua;
    }

    public int getAdina() {
        return adina;
    }

    public void setAdina(int adina) {
        this.adina = adina;
    }

    public double getPisua() {
        return pisua;
    }

    public void setPisua(double pisua) {
        this.pisua = pisua;
    }

    public String getIzena() {
        return izena;
    }

    public void setIzena(String izena) {
        this.izena = izena;
    }

    @Override
    public String toString() {
        return ("Adoptatua: " + adoptatua + " Adina: " + adina + " Pisua: " + pisua + " Izena: " + izena);
    }


    public abstract void eginSoinua();
}

