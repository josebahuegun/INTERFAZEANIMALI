package org.example;

public class Katua extends Animalia {
    public Katua(String espeziea, boolean adoptatua, int adina, double pisua, String izena) {
        super(espeziea, adoptatua, adina, pisua, izena);
    }
    public void eginSoinua() {
        System.out.println("Miauuu!");
    }
}
