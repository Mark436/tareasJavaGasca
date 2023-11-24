
package com.mycompany.tarea2;

import java.util.Scanner;

//Arreglos
public class tarea2{
    public static void print(Object a){
        System.out.println(a);
    }
    public static void clear(){  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  
    public static void mujeresHombres(){
        Scanner input;
        input=new Scanner(System.in);
        String[] personas=new String[10];
        for(int i=0;i<10;i++){
          if(i<5)print("Ingresa el nombre de la mujer");
          else print("Ingresa el nombre del hombre");
          personas[i]=input.nextLine();
        }
        boolean isMan=false;
        print("las personas son:\n");
        for(int i=0;i<10;i++){
            if (isMan){
                if((i+5<10))print("H"+personas[i+5]);
                else print("H"+personas[i+(9-i)]);
                isMan=false;
                continue;
            }
            print("M"+personas[i]);
            isMan=true;
        }
        input.close();
    }
    public static void guardarCalificaciones(){
        Scanner input;
        input=new Scanner(System.in);
        double[] calificacionesAprobatorias=new double[10];
        int fakeI=0;
        double promedio=0;
        print(calificacionesAprobatorias[0]);
        do{
            clear();
            print("Ingresa la califiacion\n");
            double currentCalif=input.nextInt();
            if(7<=currentCalif&&10>=currentCalif){
                calificacionesAprobatorias[fakeI]=currentCalif;
                fakeI++;
                promedio+=currentCalif/10;
                continue;
            }
        }while(fakeI<10);
        print("El promedio de las calificaciones aprobatorias fue:\n"+
        promedio+
        "\nSi quieres ver que calificaciones fueron aprobatorias ingresa 1\n");
        int mostrar=input.nextInt();
        if(mostrar==1){
            for (int i=0;i<10;i++){
                print("\nCalificacion "+(i+1)+": "
                +calificacionesAprobatorias[i]);
            }
        }

        input.close();
    }

    public static void arreglosEn0(){
        int[] array= new int[12];
        for(int i:array){
            print(i);
        }
        print(array[0]);
    }
    public static boolean isFull(String[] arreglo){
        boolean isFull=true;
        for(String a:arreglo){
            if(a==null)isFull=false;
        }
        return isFull;
    }
    public static int buscar(String[] arreglo,String searchValue){
        int indexOfSearchVal=-1;
        for(int currentI=0;currentI<arreglo.length;currentI++){
          if(arreglo[currentI]!=null)
            if(arreglo[currentI].equals(searchValue))break;
        }
        return indexOfSearchVal;
    }
    public static int getFreeIndex(String[] array){
        int a;
        for(a=0;a<array.length;a++)if(array[a]==null)break;
        return a;
    }
    public static void arreglo20(){
        Scanner input;
        input=new Scanner(System.in);
        String[] nombres=new String[20];
        int o=0;
        do{
        print("que deseas hacer?");
        print("1)insertar");
        print("2)buscar");
        print("3)modificar");
        print("4)borrar\n");
        print("5)salir\n");
        int command=input.nextInt();input.nextLine();
        
        if(command==1){
            if(isFull(nombres)){
                print("Ya no se pueden añadir más nombres");
                continue;
            }
            print("Ingresa el nombre que quieres agregar");
            String toAdd=input.nextLine();
            nombres[o]=toAdd;
            o=getFreeIndex(nombres);
            continue;
        }
        if(command==2){
            String nombreString="";
            for(int i=0;i<nombres.length;i++)if(nombres[i]!=null)nombreString+=i+":"+nombres[i]+"\n";
            if(nombreString.length()==0){
                print("No hay nombres por el momento\n");
                continue;
            } 
            print("Ingresa el nombre que quieres buscar\n");
            String searchValue=input.nextLine();
            int index=buscar(nombres,searchValue);
            boolean exists=0<index;
            
            if(exists){
                print(searchValue+" se encuentra en el indice "+index);
                continue;
            }
            print("No se encontró "+searchValue);
            continue;
        }
        if(command==3){
            String nombreString="";
            for(int i=0;i<nombres.length;i++)if(nombres[i]!=null)nombreString+=i+":"+nombres[i]+"\n";
            if(nombreString.length()==0){
                print("No hay nombres por el momento\n");
                continue;
            } 
            
            print("Los nombres son los siguientes");
            print("Los nombres son:\n"+nombreString);
            print("\nIngresa la casilla del nombre que quieres cambiar\n");

            int eraseIndex=input.nextInt();input.nextLine();
            
            print("Ingresa el nombre que le quieres poner");
            String newValue=input.nextLine();
            if(nombres[eraseIndex]==null){print("No se encontró "+nombres[eraseIndex]);continue;}

            nombres[eraseIndex]=newValue;
            print("Se modificó exitosamente a "+newValue);
            continue;
        }
        if(command==4){
            String nombreString="";
            for(int i=0;i<nombres.length;i++)if(nombres[i]!=null)nombreString+=i+":"+nombres[i]+"\n";
            if(nombreString.length()==0){
                print("No hay nombres por el momento\n");
                continue;
            } 
            
            print("Los nombres son los siguientes");
            print("Los nombres son:\n"+nombreString);
            print("\nIngresa el nombre que quieres borrar\n");
            String searchValue=input.nextLine();

            int index=buscar(nombres,searchValue);
            boolean exists=false;
            
            if(nombres[index].equals(searchValue))exists=true;
            if(exists){
                nombres[index]=null;
                print("Se borró exitosamente a "+searchValue);
                o=getFreeIndex(nombres);
                continue;
            }
            print("No se encontró "+searchValue);
            continue;
        }
        if(command==5){
            print("Saliendo...");
            break;
        }
        }while(true);

    }


    public static void main(String[]args){
        arreglo20();
    }
}
