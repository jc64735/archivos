/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Archivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    String ruta ="‪C:\\Users\\acer\\Documents\\NetBeansProjects\\archivos\\archivo.txt"    ;
    /*try {
          Scanner entrada= new Scanner (new FileReader(ruta));
          
          while (entrada.hasNextLine()){
            System.out.println(entrada.nextLine());
          } 
    
    } catch(FileNotFoundException ex){
        System.err.println (ex.getMessage());
    
        
    }*/
    try {
        Files.write(Paths.get(ruta),
                "\nNueva linea" .getBytes(),
                StandardOpenOption.APPEND);
    } catch (IOException e){
         System.err.println(e.getMessage());
     }
    }
} 
        
        
    

