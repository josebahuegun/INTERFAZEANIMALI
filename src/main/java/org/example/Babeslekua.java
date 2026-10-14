package org.example;

import java.util.ArrayList;

public class Babeslekua {

    private ArrayList<Animalia> animaliak;

    public Babeslekua() {
        animaliak = new ArrayList<>();
    }

    public void gehituAnimalia(Animalia animalia) {
        animaliak.add(animalia);
    }
    public Animalia bilatuAnimalia(String izena) {
        for (Animalia animalia : animaliak) {
            if (animalia.getIzena().equals(izena)) {
                return animalia;
            }
        }

        return null;
    }
    public boolean ezabatuAnimalia(String izena) {
        Animalia animalia = bilatuAnimalia(izena);

        if (animalia != null){
            animaliak.remove(animalia);
            return true;
        }

        return false;
    }

    public boolean adoptatuAnimalia (String izena) {

        Animalia animalia = bilatuAnimalia(izena);

        if (animalia != null && !animalia.isAdoptatua()) {
            animalia.setAdoptatua(true);
            return true;
        }

        return  false;
    }

    public void erakutsiAnimaliak() {
        for (Animalia animalia : animaliak) {
            System.out.println(animalia);
        }
    }
    public ArrayList<Animalia> getAnimaliak() {
        return animaliak;
    }

    public void eginSoinuak(){
        for (Animalia animalia : animaliak) {
            animalia.eginSoinua();
        }
    }
}
