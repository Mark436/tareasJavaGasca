import java.util.Scanner;
public class tarea3(){
public static void print(Object a) {
  System.out.println(a);
}
public static int getFreeIndex(Int[] array) {
  int freeIndex=-1;
  for(int i=0;i<array.length;i++){
    if(array[i]==-1){
      freeIndex=i;
      break;
    }
  }
  return freeIndex;
}
public static void paresImpares(){
  Scanner input=new Scanner(System.in);
  int[] pares=new int[10];
  int[] impares=new int[10];

  do{
    print("Ingresa:\n 0 para salir\n1 para agregar un numero"+
        "\n2 para mostrar la informacion");
    int opcion=input.nextInt();input.nextLine();
    if(opcion==0){
      break;
    }
    if(opcion==2){
      String pareString="";
      Strint impareString="";
      for(int i=0;i<pares.length;i++)
        if(pares[i]!=-1)
          pareString+=pares[i]+(i==pares.length-1?"":",");
      for(int i=0;i<impares.length;i++)
        if(impares[i]!=-1)
          impareString+=impares[i]+(i==impares.length-1?"":",");
      continue;
    }
    
    int paresI=getFreeIndex(pares);
    int imparesI=getFreeIndex(impares);
    if(paresI<0&&imparesI<0){
      print("Ya no puedes ingresar mas numeros");
continue;
    }
    print("Ingresa el numero que deseas agregar");
    int entrada=input.nextInt();input.nextLine();
    
    if(entrada<0){
      print("Debe ser un numero positivo");
      continue;
    }

    if(entrada%2==0){
      if(paresI<0){
        print("Ya son muchos pares\nDebes ingresar un numero impar");
        continue;
      }
      pares[paresI]=entrada
     continue;
    }
    
    if(imparesI<0){
      print("Ya son muchos impares\nDebes ingresar un numero par");
      continue;
    }
    impares[imparesI]=entrada;
  }while(true);
}
public static void main(String[] args) {
  paresImpares();
}
}
