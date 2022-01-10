/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto1;




import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Injah
 */
public class Reto1 {
private static Scanner lector = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion;
        int placa=0;
        String raza;
        String color;
        String proposito;
        int salir=0;
       // Scanner lector = new Scanner(System.in);
        Map<Integer, String[]> vaca = new HashMap<Integer, String[]>();
        while(salir==0){
        System.out.println("Normandia");
        System.out.println("Estimado usuario por favor seleccione una opción.");
        System.out.println("\n1. Registrar semoviente.");
        System.out.println("2. Consultar semoviente.");
        System.out.println("3. Eliminar semoviente.");
        System.out.println("4. Listar semovientes.");
        System.out.println("5. Salir.\n");
        try{
        opcion=lector.nextInt();
        }
        catch(Exception e)   {
            lector.next();
            opcion=0;
        }

        switch(opcion){
            
            case 1:
                String cadena[]=new String[3];
                while(true){
                System.out.println("Ingrese el número de placa del semoviente: "); 
                try{placa=lector.nextInt();
                    if(placa>0){break;}
                    else{System.out.println("Ingreso incorrecto"); }}
                catch(Exception f){ 
                    System.out.println("Ingreso incorrecto");
                    lector.next();
                    placa=0;}}
                if(vaca.containsKey(placa)==true){
                    System.out.println("\nNormandia");
                    System.out.println("¡Semoviente ya existe!\n\n\n");
                    break;
                }
                else{
                    System.out.println("Ingrese la raza del semoviente: "); 
                    raza=lector.next();
                    System.out.println("Ingrese el color del semoviente: "); 
                    color=lector.next();
                    cadena[0]=raza;
                    cadena[1]=color; 
                    while(true){
                    System.out.println("Ingrese el propósito del semoviente (Carne ó Leche): ");  
                    try{proposito=lector.next(); }
                    catch(Exception g){
                        lector.next();
                        proposito="";}
                    if((proposito.equals("Carne"))||(proposito.equals("carne"))||(proposito.equals("CARNE"))){
                        cadena[2]="Carne";
                        vaca.put(placa,cadena);
                        System.out.println("\nNormandia");
                        System.out.println("¡Semoviente registrado!\n\n\n");
                        break;}
                    else if (proposito.equals("Leche")||(proposito.equals("leche"))||(proposito.equals("LECHE"))){
                        cadena[2]="Leche";
                        vaca.put(placa,cadena);
                        System.out.println("\nNormandia");
                        System.out.println("¡Semoviente registrado!\n\n\n");
                        break;}
                    }
                }
            break;
            case 2: 
                while(true){
                System.out.println("Ingrese el número de placa del semoviente: "); 
                try{placa=lector.nextInt();
                    if(placa>0){break;}
                    else{System.out.println("Ingreso incorrecto"); }}
                catch(Exception f){ 
                    System.out.println("Ingreso incorrecto");
                    lector.next();
                    placa=0;}}
                if(vaca.containsKey(placa)==true){
                    System.out.println("\nNormandia");
                    System.out.println("Los datos son: \n");
                    String cad[]=vaca.get(placa);
                    System.out.println("Placa: "+placa);
                    System.out.println("Raza: "+cad[0]);
                    System.out.println("Color: "+cad[1]);
                    System.out.println("Propósito: "+cad[2]+"\n\n\n");
                    break;
                }
                else{System.out.println("\nNormandia");
                     System.out.println("¡Semoviente no existe!\n\n\n");
                    
                }
            break;
            case 3:
                  while(true){
                System.out.println("Ingrese el número de placa del semoviente: "); 
                try{placa=lector.nextInt();
                    if(placa>0){break;}
                    else{System.out.println("Ingreso incorrecto"); }}
                catch(Exception f){ 
                    System.out.println("Ingreso incorrecto");
                    lector.next();
                    placa=0;}}
                if(vaca.containsKey(placa)==true){
                    vaca.remove(placa);
                    System.out.println("\nNormandia");
                    System.out.println("¡Semoviente eliminado!\n\n\n");
                    break;
                }
                else{System.out.println("\nNormandia");
                     System.out.println("¡Semoviente no existe!\n\n\n");
                    
                }
            break;
            case 4: 
                Iterator it=vaca.keySet().iterator();
                int cont=0;
                while(it.hasNext()){
                    Object key = it.next();
                    String c[]=vaca.get(key);
                    cont=cont+1;
                    System.out.println("\nSemoviente "+cont+":\n");
                    System.out.println("Placa: "+key);
                    System.out.println("Raza: "+c[0]);
                    System.out.println("Color: "+c[1]);
                    System.out.println("Propósito: "+c[2]+"\n");
                }
                System.out.println("\n\n");
            break;
            case 5:   
                System.out.println("\nNormandia");
                System.out.println("¡Muchas gracias por usar nuestro sistema!\n");
                salir=1;
            break;
            
            default: System.out.println("\nIngrese un número entre (1-5)\n"); 
        }
        }
    }
    
}
