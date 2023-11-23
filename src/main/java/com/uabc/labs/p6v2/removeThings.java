/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uabc.labs.p6v2;

import java.io.File;

/**
 *
 * @author us
 */
public class removeThings {
    public static void deleteArrayFile(int numeroArray) {
        String filePath = "src\\main\\java\\com\\uabc\\labs\\p6v2\\CSVs\\array" + numeroArray + ".csv";
        File fileToDelete = new File(filePath);

        if (fileToDelete.exists()) {
            if (fileToDelete.delete()) {
               // System.out.println("Archivo CSV eliminado con éxito.");
            } else {
                System.err.println("No se pudo eliminar el archivo CSV.");
            }
        } else {
            System.err.println("El archivo CSV no existe en la ubicación especificada.");
        }
    }
    public static void deleteArrayFileReverse(int numeroArray) {
        String filePath="src\\main\\java\\com\\uabc\\labs\\p6v2\\CSVs\\array"+numeroArray+"Reverse.csv";
        File fileToDelete = new File(filePath);

        if (fileToDelete.exists()) {
            if (fileToDelete.delete()) {
               // System.out.println("Archivo CSV eliminado con éxito.");
            } else {
                System.err.println("No se pudo eliminar el archivo CSV.");
            }
        } else {
            System.err.println("El archivo CSV no existe en la ubicación especificada.");
        }
    }
    public static void deleteResultsFile(String sortingType) {
        String filePath="src\\main\\java\\com\\uabc\\labs\\p6v2\\CSVs\\"+sortingType+"Results.csv";
        File fileToDelete = new File(filePath);

        if (fileToDelete.exists()) {
            if (fileToDelete.delete()) {
                //System.out.println("Archivo CSV eliminado con éxito.");
            } else {
                System.err.println("No se pudo eliminar el archivo CSV.");
            }
        } else {
            System.err.println("El archivo CSV no existe en la ubicación especificada.");
        }
    }
}
