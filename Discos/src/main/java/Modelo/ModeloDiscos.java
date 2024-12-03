/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author holberton
 */
public class ModeloDiscos {
    String nombreAlb, nombreArt;
    String[] listaCanc;
    private static ArrayList<ModeloDiscos> listaCDs = new ArrayList<>();
    
    public ModeloDiscos(String nombreAlb, String nombreArt, String[] listaCanc) {
        this.nombreAlb = nombreAlb;
        this.nombreArt = nombreArt;
        this.listaCanc = listaCanc;
    }
    public ModeloDiscos(){
        this.nombreAlb = "";
        this.nombreArt = "";
        this.listaCanc = new String[0];
    }

    public String getNombreAlb() {
        return nombreAlb;
    }

    public void setNombreAlb(String nombreAlb) {
        this.nombreAlb = nombreAlb;
    }

    public String getNombreArt() {
        return nombreArt;
    }

    public void setNombreArt(String nombreArt) {
        this.nombreArt = nombreArt;
    }

    public String[] getListaCanc() {
        return listaCanc;
    }

    public void setListaCanc(String[] listaCanc) {
        this.listaCanc = listaCanc;
    }
    public static void agregarCD(ModeloDiscos cd) {
        listaCDs.add(cd);
    }

    // Método estático para obtener la lista de todos los CDs
    public static ArrayList<ModeloDiscos> getListaCDs() {
        return listaCDs;
    }

    // Método estático para mostrar todos los CDs (esto es útil para pruebas)
    public static void mostrarCDs() {
        for (ModeloDiscos cd : listaCDs) {
            System.out.println("Álbum: " + cd.getNombreAlb() + " | Artista: " + cd.getNombreArt());
            System.out.print("Canciones: ");
            for (String cancion : cd.getListaCanc()) {
                System.out.print(cancion + " ");
            }
            System.out.println();
        }
    }
}
    

