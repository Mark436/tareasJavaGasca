import java.util.Scanner;

class excentar{
    public static void print(Object a){
        System.out.println(a);
    }
    public static void estudiantes(Scanner input){
        double[][] calificaciones=new double[4][4];
        double mayorCalificacion=-1;
        double menorCalificacion=11;
        int alumnoMayorCalificacion=-1;
        int alumnoMenorCalificacion=-1;
        int alumnoMayorPromedio=0;
        int alumnoMenorPromedio=0;
        for(int i=1;i<5;i++){
            int alumno=i-1;
            double calificacion;
            for(int o=1;o<4;o++){
                do{
                    print("Ingresa la calificacion "+o+" del "+i+"° de los estudiantes");
                    calificacion=input.nextDouble();
                    if(calificacion>10||calificacion<0){
                        print("Calificacion invalida, debe ser un valor entre 0 y 10");
                        continue;
                    }
                    break;
                }while(true);

                int semestre=o-1;
                calificaciones[alumno][semestre]=calificacion;
                calificaciones[alumno][3]+=calificacion/3;
                
                if(calificacion>mayorCalificacion){
                    mayorCalificacion=calificacion;
                    alumnoMayorCalificacion=alumno;
                }
                if(calificacion<menorCalificacion){
                    menorCalificacion=calificacion;
                    alumnoMenorCalificacion=alumno;
                }
            }
            if(calificaciones[alumnoMayorPromedio][3]<calificaciones[alumno][3])alumnoMayorPromedio=alumno;

            if(calificaciones[alumno][3]<calificaciones[alumnoMenorPromedio][3])alumnoMenorPromedio=alumno;
        }
        print("El alumno con el mejor promedio es el "+(alumnoMayorPromedio+1)+"° con un promedio de: "+calificaciones[alumnoMayorPromedio][3]);
        print("El alumno con la mayor calificacion es el "+(alumnoMayorCalificacion+1)+"° con la calificacion de: "+mayorCalificacion);
        print("El alumno con la menor calificacion es el "+(alumnoMenorCalificacion+1)+"° con la calificacion de: "+menorCalificacion);
    }
    public static void tablaHash(Scanner input){
        int[][] tabla=new int[10][10];
        int[] freeIndexes=new int[10];
        do{
            print("Presiona 1 para ingresar un valor, 0 para mostrar la tabla y 2 para salir");
            int accion=input.nextInt();

            if (accion==0){
                for(int i=0;i<10;i++){
                    System.out.print("|"+i);
                    for(int o=0;o<7;o++){
                        System.out.print("|"+tabla[i][o]);
                        if(o==6)System.out.print("|\n");
                    }
                }
                continue;
            }

            if(accion==1){
                print("Ingresa el valor que quieres ingresar");
                int valor=input.nextInt();
                if(valor<10){
                    tabla[0][freeIndexes[0]]=valor;
                    freeIndexes[0]++;
                    continue;
                }
                if(valor<20){
                    tabla[1][freeIndexes[1]]=valor;
                    freeIndexes[1]++;
                    continue;
                }
                if(valor<30){
                    tabla[2][freeIndexes[2]]=valor;
                    freeIndexes[2]++;
                    continue;
                }
                if(valor<40){

                    tabla[3][freeIndexes[3]]=valor;
                    freeIndexes[3]++;
                    continue;
                }
                if(valor<50){
                    tabla[4][freeIndexes[4]]=valor;
                    freeIndexes[4]++;
                    continue;
                }
                if(valor<60){
                    tabla[5][freeIndexes[5]]=valor;
                    freeIndexes[5]++;
                    continue;
                }
                if(valor<70){

                    tabla[6][freeIndexes[6]]=valor;
                    freeIndexes[6]++;
                    continue;
                }
                if(valor<80){

                    tabla[7][freeIndexes[7]]=valor;
                    freeIndexes[7]++;
                    continue;
                }
                if(valor<90){
                    tabla[8][freeIndexes[8]]=valor;
                    freeIndexes[8]++;
                    continue;
                }
                if(valor<100){
                    tabla[9][freeIndexes[9]]=valor;
                    freeIndexes[9]++;
                    continue;
                }
                continue;
            }

            if(accion==2)break;
        }while(true);
    }
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        tablaHash(input);
        input.close();
    }
}