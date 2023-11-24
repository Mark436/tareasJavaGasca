
package com.mycompany.algo;
import java.util.Scanner;
public class ALGO {
  public static void print(Object a){
      System.out.println(a);
  }
  public static void limpiarConsola() {  
  System.out.print("\033[H\033[2J");  
  System.out.flush();  
  }  
//ejericios if
  public static void menorDeTresNumeros() {
        int numeroMenor;
        Scanner input;
    input = new Scanner(System.in);
    print("Ingrese el primer numero");
        int numero1 = input.nextInt();
    print("Ingrese el segundo numero");
        int numero2 = input.nextInt();
    print("Ingrese el tercer numero");
        int numero3 = input.nextInt();

    if (numero1 == numero2 && numero2 == numero3) {
      print("Los numeros son iguales");
      input.close();
      return;
    }
    if (numero1 > numero2) {
      numeroMenor = numero2;
      if (numero2 > numero3) {
        numeroMenor = numero3;
      }
      if (numero2 > numero3) {
        numeroMenor = numero3;
        if (numero3 > numero1) {
          numeroMenor = numero1;
        }
      }
      if (numero3 > numero2) {
        numeroMenor = numero2;

        if (numero2 > numero1) {
          numeroMenor = numero3;
        }
      }
    }
    print("El numero menor es: " + numeroMenor);
    
    input.close();
  }
  public static void menorDeDosNumeros() {
      Scanner input;
    input = new Scanner(System.in);
    print("Ingrese el primer numero");
      int num1 = input.nextInt();
    print("Ingrese el segundo numero");
      int num2 = input.nextInt();

    if (num1 < num2) {
      print("El número menor es: " + num1);
    } else {
      print("El número menor es: " + num2);
    }
    input.close();
  }
  public static void mayorDeDosNumeros() {
      Scanner input;
    input = new Scanner(System.in);
    print("Ingrese el primer numero");
      int num1 = input.nextInt();
    print("Ingrese el segundo numero");
      int num2 = input.nextInt();

    if (num1 > num2) {
      print("El número mayor es: " + num1);
    } else {
      print("El número mayor es: " + num2);
    }
    input.close();
  }
  public static void mayorDeEdad() {
      Scanner input;
    input = new Scanner(System.in);
    print("Ingrese su edad");
      int age = input.nextInt();

    if (age < 18) {
      print("Eres menor de edad");

    } else {
      print("Eres mayor de edad");
    }
    input.close();
  }
  public static void mayorA100() {
      Scanner input;
    input = new Scanner(System.in);
    print("Ingrese el numero");
      int num = input.nextInt();
    if (num < 100) {
      print("El numero es menor a 100");
    } else if (num == 100) {
      print("El numero es 100");
    } else {
      print("El numero es menor a 100");
    }
    input.close();
  }
  public static void calificacionAprobatoria() {
        Scanner input;
    input = new Scanner(System.in);
    print("Ingrese la calificacion");
        float calificacion = input.nextFloat();

    if (calificacion < 70) {
      print(calificacion + " no es una calificacion aprobatoria");
    }
    print(calificacion + " si es una calificacion aprobatoria");
    input.close();
  }
  public static void operacionElegida() {
        Scanner input;
    input = new Scanner(System.in);
        int operacion;
        float num1, num2;

    do {
      print("Ingresa el primer numero que quieres usar");
      num1 = input.nextFloat();
      print("Ingresa el segundo numero que quieres usar");
      num2 = input.nextFloat();

      print("Que operacion quieres aplicar?");
      print("1:Suma");
      print("2:Resta");
      print("3:División");
      print("4:Multiplicación");
      operacion = input.nextInt();

      if (operacion == 1) {
        print("El resultado de sumar " + num1 + " y " + num2 + " es: " + (num1 + num2));
      }

      else if (operacion == 2) {
        print("El resultado de restar " + num1 + " y " + num2 + " es: " + (num1 - num2));
      }

      else if (operacion == 3) {
        if (num2 == 0) {
          print("No se puede dividir entre 0");
          operacion = 0;
          continue;
        }
        print("El resultado de dividir " + num1 + " entre " + num2 + " es: " + (num1 / num2));
      }
      else if (operacion == 4) {
        print("El resultado de multiplicar " + num1 + " y " + num2 + " es: " + (num1 * num2));
      }
      else {
        print("Esa operación no existe, vuelve a intentarlo.");
      }

    } while (!(operacion >= 1 && operacion <= 4));
    input.close();
  }
  public static void identificarTriangulos() {
      Scanner input;
    input = new Scanner(System.in);
      String triangulo;
    print("Ingrese el primer lado");
      int lado1 = input.nextInt();
    print("Ingrese el segundo lado");
      int lado2 = input.nextInt();
    print("Ingrese el tercer numero");
      int lado3 = input.nextInt();
    if (lado1 == lado2 && lado2 == lado3) {
      triangulo = "equilatero";
    }
    else if (lado1 == lado2 && lado1 != lado3 || lado2 == lado3 && lado1 != lado2) {
      triangulo = "isóceles";
    }
    else {
      triangulo = "escaleno";
    }
    print("El triangulo es: " + triangulo);
  }

//ejercicios for
  public static void promedio5Numeros() {
      Scanner input;
    input = new Scanner(System.in);
    float result=0;
    float entrada;
    for (int i = 1; i < 6; i++) {
      print("Ingrese el numero " + i + "°");
      entrada = input.nextFloat();

      result += (entrada / 5);
    }

    print("El promedio total es de: " + result);

    input.close();
  }
  public static void imprimirTabla2() {
      Scanner input;
    input = new Scanner(System.in);
    for (int i = 1; i < 11;i++) {
      print("2 * " + "i" + "=" + 2 * i);
    }

    input.close();

  }
  public static void mostrarNombre10Veces() {
      Scanner input;
    input = new Scanner(System.in);
    print("Ingresa tu nombre");
      String nombre = input.nextLine();
    for (int i = 0; i < 10; i++) {
      print(nombre);
    }

    input.close();

  }
  public static void cuentaRegresiva() {
      Scanner input;
    input = new Scanner(System.in);
    print("Ingresa el número para empezar la cuenta regresiva: ");
      int limit = input.nextInt();
    for (int i = limit; 0 < i; i--) {
      print(i);
    }
    input.close();

  }
  public static void interesesInversion() {
      Scanner input;
    input = new Scanner(System.in);

    print("Ingresa la cantidad a invertir");
      float cantidadInvertida = input.nextFloat();

    print("Ingresa el interés anual de 1 a 100");
      float interes = input.nextFloat() / 100;

    print("Ingresa la cantidad de años a invertir");
      int years = input.nextInt();

    for (int i = 0; i < years; i++) {
      cantidadInvertida += cantidadInvertida * interes;
    }
    print("Tu inversión acabará valiendo " + cantidadInvertida);

    input.close();
  }
  public static void elFamosoAsteriscoTower() {
      Scanner input;
    input = new Scanner(System.in);
      String output = "*";
    for (int i = 0; i < 6; i++) {
      print(output);
      output += "*";
    }
    input.close();
  }
  public static void parImpar() {
      Scanner input;
    input = new Scanner(System.in);
      String output = "";
    for (int i = 1; i < 6; i++) {
      print("Ingrese el numero " + i + "°");
       int entrada = input.nextInt();

      if (entrada % 2 == 0) {
        output += entrada + " es par\n";
      }
      else {
        output += entrada + " es impar\n";
      }
    }
    print(output);
    input.close();
  }
  public static void imprimirTablas() {
      Scanner input;
    input = new Scanner(System.in);
    for (int i = 1; i < 11; i++) {
      print("\nTabla del " + i + "\n");

      for (int o = 1; o < 11; o++) {
        print(i + " * " + o + "=" + (i * o));
      }
    }

    input.close();
  }
  public static void numerosImparesHasta(){
      Scanner input;
    input = new Scanner(System.in);
    print("Ingresa el número hasta el que quieres saber los impares");
    float limit=input.nextFloat();
    String output="Los números impares entre 0 y "+limit+"son:\n";
    for (int i=1;i<=limit;i++){
      if (i%2!=0){
       output+=i+"\n"; 
      }
    }
    print(output);
    input.close();
  }
  public static void mayorMenorPromedio(){
      Scanner input;
    input = new Scanner(System.in);
    print("Cuántos números vas a utilizar?");
    int cantidadNumeros=input.nextInt();
    float menor=0;
    float mayor=0;
    float promedio=0;
    for (int i=1;i<=cantidadNumeros;i++){
      print("Ingresa el "+i+"° "+"de los números");
      float number=input.nextFloat();

      if(i==1){menor=number;}

      if(menor>number){
        menor=number;
      }else if(mayor<number){
        mayor=number;
      }
      promedio+=(number/cantidadNumeros);
    }
    print("El mayor de los números es: "+mayor+" el menor es: "+menor+" y el promedio de todos los números ingresados es: "+promedio);
    input.close();
  }
  public static void verificarContrasena5veces(){
      Scanner input;
    input = new Scanner(System.in);
    print("Ingresa la contraseña a evaluar");
    String password=input.nextLine();
    int aciertos=0;
    for (int i=0;i<5;i++){
      print("Ingresa la contraseña: ");
      String test=input.nextLine();
      if (test.equals(password)){
        aciertos++;
      }
    }
    if(aciertos>1){
      print("Acertó "+aciertos+" veces");
      
    }else if(aciertos==1){
      print("Acertó 1 vez");
    }else{
      print("Falló todas las veces");
    }
    input.close();
  }
  public static void elForLOKO(){
      Scanner input;
    input = new Scanner(System.in);
    for(int i=0;i>77;i+=7){
      print(i);
    }
    for(int i=20;2!=i;i-=2){
      print(i);
    }
    for(int i=2;i<=50;i+=3){
      print(i);
    }
    for(int i=44;i!=0;i-=11){
      print(i);
    }
    input.close();
  }
//ejercicios do-while
  public static void xToExit(){
    Scanner input;
    input = new Scanner(System.in);
    String command="";
    do {
     print("Escribe X para salir");
     command=input.nextLine();
    }
    while (command!="X");
    input.close();
  }
  public static void areaHipotenusaTriangulos(){
   Scanner input;
   input = new Scanner(System.in);
   int salir=0;
   String resultados="Los resultados son:";
   do{
    print("Ingresa el primer cateto");
    float catetoA=input.nextFloat();
    print("Ingresa el segundo cateto");
    double catetoB=input.nextFloat();
    
    double hipotenusa=Math.sqrt((catetoA*catetoA)+(catetoB*catetoB));
    double area=catetoA*catetoB/2;
    resultados+="\nEl triangulo con el los catetos:\n"+
    "A:"+catetoA+
    "\nB:"+catetoB+
    "\nCuenta con el area:"+area+
    "Y la hipotenusa:"+hipotenusa;
    
    print("Si no quieres calcular otro triangulo presiona y deseas ver los resultados 1;si solo quieres ver los resultados y seguir calculando, presiona 2");
   salir=input.nextInt();
   
   if(salir==2){
    print(resultados);
   }
   }
   while(1!=salir);
   
   input.close();
  }
  public static void letraCapturada10Veces(){
   Scanner input;
   input = new Scanner(System.in);
   int a=0;int b=0;int c=0;int d=0;
   Boolean done=9<a||9<b||9<c||9<d;
   String masUsada="";
   do{
    print("Ingresa una letra");
    String in = input.nextLine();
    if (in.equals("a")){
     if (a==9){
      masUsada="a";
     }
     a++;
    }
    else if(in.equals("b")){
     if (b==9){
      masUsada="b";
     }
      b++;
    }
    else if(in.equals("c")){
     if (c==9){
      masUsada="c";
     }
      c++;
    }
    else if(in.equals("d")){
     if (d==9){
      masUsada="d";
     }
      d++;
    }

   }
   while(!done);
   print("La letra más usada fue "+masUsada);
   input.close();
  }
  public static void promedioNnumeros(){
   Scanner input;
   input = new Scanner(System.in);
   Boolean ready=false;
   float resultado=0;
   int cantidad=0;
   print("Ingresa el numero");
   int in=input.nextInt();
   resultado+=in;
   do{
    print("Ingresa el siguiente numero");
    in=input.nextInt();
    cantidad++;
    resultado+=in;
   }
   while(!ready);
   resultado/=cantidad;
   
   print("El promedio de los "+cantidad+
   "numero"+(cantidad>1?"s":"")+" que ingresaste es:"+resultado);
   
   input.close();
  }
  public static void contadorSlots(){
   Scanner input;
   input =new Scanner(System.in);
   print("numeros del 1 al 100");
   for(int i=0;i<2;i++){
    for(int e=0;e<=9;e++){
     for(int o=0;o<=9;o++){
      print(i+""+e+""+o);
     }
    }
   }
   input.close();
  }
  /* public static void cronometro(){
   Scanner input;
   input =new Scanner(System.in);
   int hours,minutes,seconds=0;
   Boolean stop=true;
   do {
     limpiarConsola();
     seconds++;
     if (60==seconds){
      seconds=0;
      minutes++;
     }
     if (60==minutes&&seconds==60){
      minutes=0;
      hours++;
     }
     if (60==hours&&minutes==60&&seconds==60){
      //stop
     }
     print(hours+";"+minutes+":"+seconds);
    }while(!stop);

   input.close();
  }
 */  public static void saberCalificacion(){
   Scanner input=new Scanner(System.in);
   print("Ingresa tu calificación");
   int calificacion=input.nextInt();
   String result;
   switch (calificacion){
    case 10:
     result="a";
    break;
    case 9:
    result="b";
    break;
    case 8:
    result="c";
    break;
    case 7:
    result="d";
    break;
    case 6:
    result="e";
    break;
    default:
    result="f";
    break;
   }
   print("Su calificación es: "+result);
   input.close();
  }
  public static void mesPorNumero(){
   Scanner input=new Scanner(System.in);
   print("Ingresa el número del mes");
   int entrada=input.nextInt();
   String mes;
   switch (entrada) {
    case 12:
    mes="Diciembre";
    break;
    case 11:
    mes="Noviembre";
    break;
    case 10:
    mes="Octubre";
    break;
    case 9:
    mes="Septiembre";
    break;
    case 8:
    mes="Agosto";
    break;
    case 7:
    mes="Julio";
    break;
    case 6:
    mes="Junio";
    break; 
    case 5:
    mes="Mayo";
    break;
    case 4:
    mes="Abril";
    break;
    case 3:
    mes="Marzo";
    break;
    case 2:
    mes="Febrero";
    break;
    case 1:
    mes="Enero";
    break;
    default:
    print("Mes no reconocido");
    return;
    break;
   }
   print("El mes es:"+mes);
   input.close();
  }
  public static void mesDiasNumero(){
   Scanner input=new Scanner(System.in);
   print("Ingresa el número del mes");
   int entrada=input.nextInt();
   String mes;
   int dias=31;
   switch (entrada) {
    case 12:
    mes="Diciembre";
    break;
    case 11:
    mes="Noviembre";
    dias=30;
    break;
    case 10:
    mes="Octubre";
    break;
    case 9:
    mes="Septiembre";
    dias=30;
    break;
    case 8:
    mes="Agosto";
    break;
    case 7:
    mes="Julio";
    break;
    case 6:
    mes="Junio";
    dias=30;
    break; 
    case 5:
    mes="Mayo";
    break;
    case 4:
    mes="Abril";
    dias=30;
    break;
    case 3:
    mes="Marzo";
    break;
    case 2:
    mes="Febrero";
    dias=28;
    break;
    case 1:
    mes="Enero";
    break;
    default:
    print("Mes no reconocido");
    return;
    break;
   }
   print("El número que ingresó corresponde al mes: "+mes+" y éste cuenta con "+dias+" días");
   
   input.close();
  }
//opciones de ejercicios
  public static void ejerciciosIf() {
      Scanner input;
    input = new Scanner(System.in);
    int ejercicio;
    do {
      print("1:Calcular el menor de 3 números");
      print("2:Calcular el menor de 2 números");
      print("3:Calcular el mayor de 2 números");
      print("4:Saber si es mayor de edad");
      print("5:Saber si un número es mayor a 100");
      print("6:Saber si una calificación es aprobatoria");
      print("7:Calculadora simple");
      print("8:Identificar un triángulo");
      ejercicio = input.nextInt();

      switch (ejercicio) {
        case 1:
          menorDeTresNumeros();
          break;
        case 2:
          menorDeDosNumeros();
          break;
        case 3:
          mayorDeDosNumeros();
          break;
        case 4:
          mayorDeEdad();
          break;
        case 5:
          mayorA100();
          break;
        case 6:
          calificacionAprobatoria();
          break;
        case 7:
          operacionElegida();
          break;
        case 8:
          identificarTriangulos();
          break;

      }
    }
    while (!(ejercicio >= 1 && ejercicio <= 8));
    input.close();
  }
  public static void ejerciciosFor() {
      Scanner input;
    input = new Scanner(System.in);
    int ejercicio;
    do {
      print("1:Calcular el promedio de 5 números");
      print("2:Imprimir la tabla del 2");
      print("3:Mostrar 10 veces tu nombre");
      print("4:Cuenta regresiva");
      print("5:Calcular los intereses de una inversión");
      print("6:Piramide de asteríscos");
      print("7:Diferenciar si 6 numeros son par o impar");
      print("8:Imprimir las tablas");
      print("9:Numeros impares hasta un número positivo");
      print("10:Calcular el menor, el mayor y el promedio de una cantidad x de números");
      print("11:Verificar contraseña 5 veces");
      print("12:Ejercicios random con for");
      ejercicio = input.nextInt();

      switch (ejercicio) {
        case 1:
          promedio5Numeros();
          break;
        case 2:
          imprimirTabla2();
          break;
        case 3:
          mostrarNombre10Veces();
          break;
        case 4:
          cuentaRegresiva();
          break;
        case 5:
          interesesInversion();
          break;
        case 6:
          elFamosoAsteriscoTower();
          break;
        case 7:
          parImpar();
          break;
        case 8:
          imprimirTablas();
          break;
        case 9:
          numerosImparesHasta();
          break;
        case 10:
          mayorMenorPromedio();
          break;
        case 11:
          verificarContrasena5veces();
          break;
        case 12:
          elForLOKO();
          break;

      }
    }
    while (!(ejercicio >= 1 && ejercicio <= 12));
    input.close();
  }
  public static void ejerciciosDoWhile() {
    Scanner input;
    input = new Scanner(System.in);
    int ejercicio;
    do {
      print("1:Mientras no escribas X no sales");
      print("2:Calcular el area e hipotenusa de triángulos");
      print("3:Cuántas veces capturó la letra a,b,c o d");
      print("4:promedio de n numeros");
      //este se hace con 3 slots como si fuera un reloj 000 001 010 100...
      print("5:Contar hasta 100 pero sin usar un contador del 1 al 100");
      //que se puede pausar, inicar y resetear
      print("6:Cronómetro");
      ejercicio = input.nextInt();

      switch (ejercicio) {
        case 1:
          xToExit();
          break;
        case 2:
          areaHipotenusaTriangulos();
          break;
        case 3:
          letraCapturada10Veces();
          break;
        case 4:
          promedioNnumeros();
          break;
        case 5:
          contadorSlots();
          break;
        case 6:
          //cronometro();
          break;
      }
    }
    while (!(ejercicio >= 1 && ejercicio <= 6));
    input.close();
  }
public static void ejerciciosSwitch() {
    Scanner input;
    input = new Scanner(System.in);
    int ejercicio;
    do {
      print("1:Mientras no escribas X no sales");
      print("2:Calcular el area e hipotenusa de triángulos");
      print("3:Cuántas veces capturó la letra a,b,c o d");
      print("4:promedio de n numeros");
      //este se hace con 3 slots como si fuera un reloj 000 001 010 100...
      print("5:Contar hasta 100 pero sin usar un contador del 1 al 100");
      //que se puede pausar, inicar y resetear
      print("6:Cronómetro");
      ejercicio = input.nextInt();

      switch (ejercicio) {
        case 1:
          saberCalificacion();
          break;
        case 2:
          mesPorNumero();
          break;
        case 3:
          mesDiasNumero();
          break;
        case 4:
          promedioNnumeros();
          break;
        case 5:
          contadorSlots();
          break;
        case 6:
          //cronometro();
          break;
      }
    }
    while (!(ejercicio >= 1 && ejercicio <= 3));
    input.close();
  }

  

  public static void main(String[] args) {
      Scanner input;
    input = new Scanner(System.in);
      int programa;
    do {
      print("1:Ejercicios if");
      print("2:Ejercicios for");
      print("3:Ejercicios Do-While");
      print("4:Ejercicios switch");

      programa = input.nextInt();
      switch (programa) {
        case 1:
          ejerciciosIf();
          break;
        case 2:
          ejerciciosFor();
          break;
        case 3:
          ejerciciosDoWhile();
          break;
        case 4:
          ejerciciosSwitch();
          break;
      }
    }
    while (!(programa >= 1 && programa <= 2));
    input.close();
  }
}




// ((...num)=>{
//  let menor=num[0];
//  for (const number of num)menor=menor<number?menor:number;
//  console.log(`El numero menor es:{menor}`);
// })(1,2,4,5,6,7,0);
