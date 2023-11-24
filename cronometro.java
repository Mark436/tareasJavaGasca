
import java.util.Scanner;


public class Cronometro{
  private static boolean pausa=false;
  private static boolean running=true;
  private static int timePassed=0;
  public static void print(Object a){
    System.out.println(a);
  }
public static void limpiarConsola() {
  System.out.print("\033[H\033[2J");
  System.out.flush();
}
  public static void main(String[] args){
    Thread cronoThread = new Thread(()->{
      Scanner input =new Scanner(System.in);
      while(running){
       int minutos=timePassed/60;
       int segundos=timePassed%60;
       if (minutos>59){
         pausa=true;
         timePassed=0;
         continue;
       }
       if (!pausa){
       limpiarConsola();
       print(minutos+":"+segundos+"\n");
       print("Ingresa una opcion:\n"+                            "Ingresa 1 para detener\n"+
        "Ingresa 2 para reiniciar\n"+
        "Ingresa 3 para cerrar\n"
       );
       timePassed++;
       }
       else{
        limpiarConsola();
        print(minutos+":"+segundos+"\n");
        print("Ingresa una opcion:\n"+ 
         "Ingresa 1 para reanudar\n"+
         "Ingresa 2 para reiniciar\n"+
         "Ingresa 3 para cerrar\n"   );
       }
try {
 Thread.sleep(1000);   
}
catch (InterruptedException e) {print(e);} 
       
    }
input.close();
    });
    Thread inputThread = new Thread(()->{
      Scanner input= new Scanner(System.in);
      while(running){
      int entrada=input.nextInt();
      if(entrada==1){
       pausa=(!pausa);
      }
      if(entrada==2){
        pausa=true;
        timePassed=0;
      }
      if(entrada==3){
       pausa=true; 
       running=false;
      }
      }
      input.close();
    });
   cronoThread.start();
   inputThread.start();
  }

}
