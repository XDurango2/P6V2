/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uabc.labs.p6v2;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author us
 */
public class getArrays {
    private int[] array1;
    private int[] array2;
    private int[] array3;
    private int[] array4;
    private int[] array5;
    private int[] array6;
    private int[] array7;
    private int[] array8;
    private int[] array9;
    private int[] array10;
    private int[] array1Reverse;
    private int[] array2Reverse;
    private int[] array3Reverse;
    private int[] array4Reverse;
    private int[] array5Reverse;
    private int[] array6Reverse;
    private int[] array7Reverse;
    private int[] array8Reverse;
    private int[] array9Reverse;
    private int[] array10Reverse;
    private long[] QuickSort1;
    private long[] QuickSort2;
    private long[] QuickSort3;
    private long[] MergeSort1;
    private long[] MergeSort2;
    private long[] MergeSort3;
    private long[] ArraySort1;
    private long[] ArraySort2;
    private long[] ArraySort3;
    private long[] ParallelSort1;
    private long[] ParallelSort2;
    private long[] ParallelSort3;

    public getArrays() {
        this.array1=new int[100];
        this.array2=new int[500];
        this.array3=new int[1000];
        this.array4=new int[1500];
        this.array5=new int[2000];
        this.array6=new int[3000];
        this.array7=new int[4000];
        this.array8=new int[5000];
        this.array9=new int[7000];
        this.array10=new int[10000];
        this.array1Reverse=new int[100];
        this.array2Reverse=new int[500];
        this.array3Reverse=new int[1000];
        this.array4Reverse=new int[1500];
        this.array5Reverse=new int[2000];
        this.array6Reverse=new int[3000];
        this.array7Reverse=new int[4000];
        this.array8Reverse=new int[5000];
        this.array9Reverse=new int[7000];
        this.array10Reverse=new int[10000];
        QuickSort1=new long[10];
        QuickSort2=new long[10];
        QuickSort3=new long[10];
        MergeSort1=new long[10];
        MergeSort2=new long[10];
        MergeSort3=new long[10];
        ArraySort1=new long[10];
        ArraySort2=new long[10];
        ArraySort3=new long[10];
        ParallelSort1=new long[10];
        ParallelSort2=new long[10];
        ParallelSort3=new long[10];
        findFiles();
        findFilesReverse();
        readAllFiles();
        readAllFilesReverse();
        readAllResults();
        
    }
    
    public int[]getArray(int numArray){
        
        int[] newArray;
        switch (numArray) {
           case 1 -> newArray = array1;
           case 2 -> newArray = array2;
           case 3 -> newArray = array3;
           case 4 -> newArray = array4;
           case 5 -> newArray = array5;
           case 6 -> newArray = array6;
           case 7 -> newArray = array7;
           case 8 -> newArray = array8;
           case 9 -> newArray = array9;
           case 10 -> newArray = array10;
           default -> throw new IllegalArgumentException("numero no valido") ;
       };
       return newArray;

   }

    public int[]getArrayReverse(int numArray){
        int[] newArray;
        switch (numArray) {
           case 1 -> newArray = array1Reverse;
           case 2 -> newArray = array2Reverse;
           case 3 -> newArray = array3Reverse;
           case 4 -> newArray = array4Reverse;
           case 5 -> newArray = array5Reverse;
           case 6 -> newArray = array6Reverse;
           case 7 -> newArray = array7Reverse;
           case 8 -> newArray = array8Reverse;
           case 9 -> newArray = array9Reverse;
           case 10 -> newArray = array10Reverse;
           default -> throw new IllegalArgumentException("numero no valido") ;
       };

           return newArray;
   }

    public long[]getResultsArray(String array){
        long[] newArray;
        switch (array) {
           case "QuickSort - caso 1" -> newArray = QuickSort1;
           case "QuickSort - caso 2" -> newArray = QuickSort2;
           case "QuickSort - caso 3" -> newArray = QuickSort3;
           case "mergeSort - caso 1" -> newArray = MergeSort1;
           case "mergeSort - caso 2" -> newArray = MergeSort2;
           case "mergeSort - caso 3" -> newArray = MergeSort3;
           case "Arrays.Sort - caso 1" -> newArray = ArraySort1;
           case "Arrays.Sort - caso 2" -> newArray = ArraySort2;
           case "Arrays.Sort - caso 3" -> newArray = ArraySort3;
           case "parallelSort - caso 1" -> newArray = ParallelSort1;
           case "parallelSort - caso 2" -> newArray = ParallelSort2;
           case "parallelSort - caso 3" -> newArray = ParallelSort3;
           default -> throw new IllegalArgumentException("numero no valido") ;
       };

           return newArray;
   }

    public void findFiles(){
       boolean fileExists = false;
       for(int k=1;k<=10;k++){
           String files="src\\main\\java\\com\\uabc\\labs\\p6v2\\CSVs\\array"+k+".csv";
           fileExists= new File(files).exists();
           if(fileExists){
                   //System.out.println("getArray: array"+k+": archivo CSV encontrado!");
           }
       }
   }

    public void findFilesReverse(){
       boolean fileExists = false;
       for(int k=1;k<=10;k++){
           String files="src\\main\\java\\com\\uabc\\labs\\p6v2\\CSVs\\array"+k+"Reverse.csv";
           fileExists= new File(files).exists();
           if(fileExists){
                   //System.out.println("getArray: array"+k+": archivo CSV encontrado!");
           }
       }
   }

    public void readAllFiles(){
         for(int k =1; k<=10;k++){
             readArrayFile(k);
         }
     }
      
    public void readAllFilesReverse(){
       for(int k=1; k<=10;k++){
           findFilesReverse();
           readArrayFileReverse(k);
       }
   }
    
    public void readAllResults(){
        String[] types = {"QuickSort - caso 1","QuickSort - caso 2","QuickSort - caso 3","mergeSort - caso 1",
        "mergeSort - caso 2","mergeSort - caso 3","Arrays.Sort - caso 1",
        "Arrays.Sort - caso 2","Arrays.Sort - caso 3","parallelSort - caso 1","parallelSort - caso 2",
        "parallelSort - caso 3"};
        for(int k=0;k<types.length;k++){
        readResultsFile(types[k]);
        }
    }
    
     public void removeAllFiles(){
         for(int k =1; k<=10;k++){
             removeThings.deleteArrayFile(k);
         }
     }
      
    public void removeAllFilesReverse(){
       for(int k =1; k<=10;k++){
           removeThings.deleteArrayFileReverse(k);
       }
   }
    
    public void removeAllResults(){
        String[] types = {"QuickSort - caso 1","QuickSort - caso 2","QuickSort - caso 3","mergeSort - caso 1",
        "mergeSort - caso 2","mergeSort - caso 3","Arrays.Sort - caso 1",
        "Arrays.Sort - caso 2","Arrays.Sort - caso 3","parallelSort - caso 1","parallelSort - caso 2",
        "parallelSort - caso 3"};
        for(int k=0;k<types.length;k++){
        removeThings.deleteResultsFile(types[k]);
        }
    }
    
    public void removeAll(){
        removeAllFiles();
        removeAllFilesReverse();
        removeAllResults();
    }
    
    public void readArrayFile(int numeroArray){
        int k=0;
        int[] array = getArray(numeroArray);
        boolean isFirst = true;
        boolean fileExists =false;
        List<String[]>arrayString;

        String files="src\\main\\java\\com\\uabc\\labs\\p6v2\\CSVs\\array"+numeroArray+".csv";
        fileExists= new File(files).exists();
        try(CSVReader reader = new CSVReader(new FileReader(files))){
            if(fileExists){
           arrayString=reader.readAll();
            //System.out.println("archivo CSV encontrado!");
            for(String[]line:arrayString){
                if(isFirst){
                    isFirst=false;
                    continue;
                }
                array[k]=Integer.parseInt(line[1]);
                k++;
            }
            }else{
                System.out.println("el archivo CSV no encontrado!");
            }
        }catch(IOException | NumberFormatException e){
            e.printStackTrace();
        } catch (CsvException ex) {
            Logger.getLogger(getArrays.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void readArrayFileReverse(int numeroArray){
        int k=0;
        int[] array = getArrayReverse(numeroArray);
        boolean isFirst = true;
        boolean fileExists =false;
        List<String[]>arrayString;

        String files="src\\main\\java\\com\\uabc\\labs\\p6v2\\CSVs\\array"+numeroArray+"Reverse.csv";
        fileExists= new File(files).exists();
        try(CSVReader reader = new CSVReader(new FileReader(files))){
            if(fileExists){
           arrayString=reader.readAll();
           // System.out.println("archivo CSV encontrado!");
            for(String[]line:arrayString){
                if(isFirst){
                    isFirst=false;
                    continue;
                }
                array[k]=Integer.parseInt(line[1]);
                k++;
            }
            }else{
                System.out.println("el archivo CSV no encontrado!");
            }
        }catch(IOException | NumberFormatException e){
            e.printStackTrace();
        } catch (CsvException ex) {
            Logger.getLogger(getArrays.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void readResultsFile(String sortingType){
    int k=0;
    long[] array = getResultsArray(sortingType);
    boolean isFirst = true;
    boolean fileExists =false;
    List<String[]>arrayString;

    String files="src\\main\\java\\com\\uabc\\labs\\p6v2\\CSVs\\"+sortingType+"Results.csv";
    fileExists= new File(files).exists();
    try(CSVReader reader = new CSVReader(new FileReader(files))){
        if(fileExists){
       arrayString=reader.readAll();
       // System.out.println("archivo CSV encontrado!");
        for(String[]line:arrayString){
            if(isFirst){
                isFirst=false;
                continue;
            }
            array[k]=Long.parseLong(line[1]);
            k++;
        }
        }else{
            System.out.println("el archivo CSV no encontrado!");
        }
    }catch(IOException | NumberFormatException e){
        e.printStackTrace();
    }   catch (CsvException ex) {
            Logger.getLogger(getArrays.class.getName()).log(Level.SEVERE, null, ex);
        }

}
    
    
}
