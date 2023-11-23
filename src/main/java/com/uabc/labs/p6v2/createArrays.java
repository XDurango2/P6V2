/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uabc.labs.p6v2;

import java.util.Arrays;
import java.util.Random;
import com.opencsv.CSVWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hector Duran
 */
public class createArrays {
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

    public createArrays() {
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
        findFiles();
        
    }
    
    public int[]getArray(int numArray){
        return switch (numArray) {
            case 1 -> array1;
            case 2 -> array2;
            case 3 -> array3;
            case 4 -> array4;
            case 5 -> array5;
            case 6 -> array6;
            case 7 -> array7;
            case 8 -> array8;
            case 9 -> array9;
            case 10 -> array10;
            default -> null;
        };
    }

    public void create(){
        Random rd = new Random();
        for(int k=0;k<100;k++){
            array1[k]=rd.nextInt(1000);
            
        }
       // System.out.println("array 1:"+Arrays.toString(array1));
        createArrayFiles(array1,1);
        //createArrayFileReverse(array1,1);
        for(int k=0;k<500;k++){
            array2[k]=rd.nextInt(2000);
            
        }
       // System.out.println("array 2:"+Arrays.toString(array2));
        createArrayFiles(array2,2);
        //createArrayFileReverse(array2,2);
        for(int k=0;k<1000;k++){
            array3[k]=rd.nextInt(2000);
            
        }
       // System.out.println("array 3:"+Arrays.toString(array3));
        createArrayFiles(array3,3);
        //createArrayFileReverse(array3,3);

        for(int k=0;k<1500;k++){
            array4[k]=rd.nextInt(2500);
            
        }
        //System.out.println("array 4:"+Arrays.toString(array4));
        createArrayFiles(array4,4);
        //createArrayFileReverse(array4,4);

        for(int k=0;k<2000;k++){
            array5[k]=rd.nextInt(3000);
            
        }
        //System.out.println("array 5:"+Arrays.toString(array5));
        createArrayFiles(array5,5);
        //createArrayFileReverse(array5,5);

        for(int k=0;k<3000;k++){
            array6[k]=rd.nextInt(5000);
            
        }
        //System.out.println("array 6:"+Arrays.toString(array6));
        createArrayFiles(array6,6);
        //createArrayFileReverse(array6,6);

        for(int k=0;k<4000;k++){
            array7[k]=rd.nextInt(6000);
            
        }
        //System.out.println("array 7:"+Arrays.toString(array7));
        createArrayFiles(array7,7);
        //createArrayFileReverse(array7,7);

        for(int k=0;k<5000;k++){
            array8[k]=rd.nextInt(10000);
            
        }
        //System.out.println("array 8:"+Arrays.toString(array8));
        createArrayFiles(array8,8);
        //createArrayFileReverse(array8,8);

        for(int k=0;k<7000;k++){
            array9[k]=rd.nextInt(10000);
            
        }
        //System.out.println("array 9:"+Arrays.toString(array9));
        createArrayFiles(array9,9);
        //createArrayFileReverse(array9,9);


        for(int k=0;k<10000;k++){
            array10[k]=rd.nextInt(20000);
            
        }
        //System.out.println("array 10:"+Arrays.toString(array10));
        createArrayFiles(array10,10);
        //createArrayFileReverse(array10,10);

    }
    
    public void findFiles(){
        boolean fileExists = false;
        for(int k=1;k<=10;k++){
            String files="src\\main\\java\\com\\uabc\\labs\\p6v2\\CSVs\\array"+k+".csv";
            fileExists= new File(files).exists();
            if(fileExists){
                    //System.out.println("array"+k+": archivo CSV encontrado!");
            }else{
                create();
                
            }
        }
    }
    
  
    
    public void createArrayFiles(int[] arrayX,int numeroArray){
        boolean fileExists =false;
        List<String[]>arrayString = new ArrayList<>();
        for(int j=0;j<arrayX.length;j++){
            String[]elemento = new String[]{String.valueOf(j), String.valueOf(arrayX[j])};
            arrayString.add(elemento);
        }
        String files="src\\main\\java\\com\\uabc\\labs\\p6v2\\CSVs\\array"+numeroArray+".csv";
        String[] encabezado={"numero de elemento","elemento"};
        fileExists= new File(files).exists();
        try(CSVWriter writer = new CSVWriter(new FileWriter(files,true))){
            if(!fileExists){
            writer.writeNext(encabezado);
            writer.writeAll(arrayString);
            //System.out.println("archivo CSV creado!");
            }else{
               // System.out.println("el archivo CSV ya existe!");
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public void createArrayFileReverse(int[] arrayX,int numeroArray){
        boolean fileExists =false;
        List<String[]>arrayString = new ArrayList<>();
        for(int j=arrayX.length-1;j!=0;j--){
            String[]elemento = new String[]{String.valueOf(j), String.valueOf(arrayX[j])};
            arrayString.add(elemento);
        }
        String files="src\\main\\java\\com\\uabc\\labs\\p6v2\\CSVs\\array"+numeroArray+"Reverse.csv";
        String[] encabezado={"numero de elemento","elemento"};
        fileExists= new File(files).exists();
        try(CSVWriter writer = new CSVWriter(new FileWriter(files,true))){
            if(!fileExists){
            writer.writeNext(encabezado);
            writer.writeAll(arrayString);
            //System.out.println("archivo CSV creado!");
            }else{
              // System.out.println("el archivo CSV ya existe!");
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public void createFileResults(long[]results,String sortingType){
        boolean fileExists =false;
        List<String[]> resultsString = new ArrayList<>();
         for(int j=1;j<=results.length-1;j++){
            String[]elemento = new String[]{String.valueOf(j), String.valueOf(results[j])};
            resultsString.add(elemento);
        }
         
         String files="src\\main\\java\\com\\uabc\\labs\\p6v2\\CSVs\\"+sortingType+"Results.csv";
        String[] encabezado={"array","tiempo de ejecucion"};
        fileExists= new File(files).exists();
        try(CSVWriter writer = new CSVWriter(new FileWriter(files,true))){
            if(!fileExists){
            writer.writeNext(encabezado);
            writer.writeAll(resultsString);
           // System.out.println("archivo CSV creado!");
            }else{
                //System.out.println("el archivo CSV ya existe!");
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
   


    
}
