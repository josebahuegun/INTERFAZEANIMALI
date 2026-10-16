package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;

public class AnimalDAO {

    public void gehituAnimalia(Animalia animalia, String mota) {

        String sql = "INSERT INTO animales (nombre, tipo, especie, edad, peso, adoptado) "
                + "VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection konexioa = Konexioa.konektatu();
             PreparedStatement sententzia = konexioa.prepareStatement(sql)) {

            sententzia.setString(1, animalia.getIzena());
            sententzia.setString(2, mota);
            sententzia.setString(3, animalia.getEspeziea());
            sententzia.setInt(4, animalia.getAdina());
            sententzia.setDouble(5, animalia.getPisua());
            sententzia.setBoolean(6, animalia.isAdoptatua());

            sententzia.executeUpdate();

            System.out.println("Animalia datu-basean gorde da!");

        } catch (SQLException e) {
            System.out.println("Errorea animalia gordetzean: " + e.getMessage());
        }
    }

    public ArrayList<Animalia> lortuAnimaliak() {

        ArrayList<Animalia> animaliak = new ArrayList<>();

        String sql = "SELECT * FROM animales";

        try (Connection konexioa = Konexioa.konektatu();
             PreparedStatement sententzia = konexioa.prepareStatement(sql);
             ResultSet emaitza = sententzia.executeQuery()) {

            while (emaitza.next()) {

                String izena = emaitza.getString("nombre");
                String mota = emaitza.getString("tipo");
                String espeziea = emaitza.getString("especie");
                int adina = emaitza.getInt("edad");
                double pisua = emaitza.getDouble("peso");
                boolean adoptatua = emaitza.getBoolean("adoptado");

                Animalia animalia = null;

                if (mota.equals("Katua")) {
                    animalia = new Katua(espeziea, adoptatua, adina, pisua, izena);
                } else if (mota.equals("Txakurra")) {
                    animalia = new Txakurra(espeziea, adoptatua, adina, pisua, izena);
                } else if (mota.equals("Untxia")) {
                    animalia = new Untxia(espeziea, adoptatua, adina, pisua, izena);
                }

                if (animalia != null) {
                    animaliak.add(animalia);
                }
            }

        } catch (SQLException e) {
            System.out.println("Errorea animaliak kargatzean: " + e.getMessage());
        }

        return animaliak;
    }

    public void adoptatuAnimalia(String izena) {

        String sql = "UPDATE animales SET adoptado = TRUE WHERE nombre = ?";

        try (Connection konexioa = Konexioa.konektatu();
             PreparedStatement sententzia = konexioa.prepareStatement(sql)) {

            sententzia.setString(1, izena);
            sententzia.executeUpdate();

            System.out.println("Animalia adoptatua izan da!");

        } catch (SQLException e) {
            System.out.println("Errorea adopzioan: " + e.getMessage());
        }
    }

    public void ezabatuAnimalia(String izena) {

        String sql = "DELETE FROM animales WHERE nombre = ?";

        try (Connection konexioa = Konexioa.konektatu();
             PreparedStatement sententzia = konexioa.prepareStatement(sql)) {

            sententzia.setString(1, izena);
            sententzia.executeUpdate();

            System.out.println("Animalia ezabatu da!");

        } catch (SQLException e) {
            System.out.println("Errorea animalia ezabatzean: " + e.getMessage());
        }
    }


}
