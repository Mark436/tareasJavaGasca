import java.util.Scanner;
import java.util.Random;

public class juegoAhorcado{
    public static void print(Object a){
        System.out.println(a);
    }
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        String[] words = {"agua", "aire", "amigo", "amor", "animal", "hambre", "arte", "ajo", "azul", "barco", "bien", "blanco", "boca", "brazo", "cabeza", "calle", "cama", "cara", "carne", "casa", "cielo", "ciudad", "clase", "color", "comida", "corazón", "cuerpo", "día", "diente", "dinero", "dios", "doctor", "dolor", "dulce", "edad", "ejemplo", "energía", "escuela", "espacio", "espanol", "estrella", "familia", "felicidad", "fiesta", "fuego", "fuerza", "gato", "gente", "gobierno", "gracia", "gran", "guerra", "habitación", "hombre", "hora", "idea", "iglesia", "imagen", "información", "izquierda", "jardín", "joven", "juego", "lado", "lengua", "letra", "libertad", "línea", "lluvia", "lugar", "madre", "mano", "mar", "materia", "mes", "mesa", "miedo", "mismo", "momento", "mundo", "música", "nación", "nada", "naturaleza", "niño", "nombre", "número", "ojo", "oro", "país", "palabra", "paz", "pequeño", "persona", "piedra", "pieza", "plata", "poder", "política", "problema", "profesor", "programa", "proyecto", "puerta", "pueblo", "querer", "realidad", "recuerdo", "religión", "respuesta", "revolución", "riqueza", "ropa", "salud", "secreto", "seguridad", "semana", "sentido", "señor", "ser", "sistema", "sol", "sueño", "suerte", "tamaño", "te", "tema", "tiempo", "trabajo", "unidad", "universidad", "valor", "verdad", "vida", "viento", "vino", "y", "yo", "zona"};
        
        Random random = new Random();
        String word = words[random.nextInt(words.length)];
        
        print(word);
        
        String wordUser="";
        for(int i=0;i<word.length();i++)wordUser+="_";
        char[] wordUserArray=wordUser.toCharArray();

        print("Bienvenido a el ahorcado, intenta adivinar la palabra");
        do{
            if(!wordUser.contains("_")){
                print("\nLo lograste, la palabra es: "+word);
                break;
            }
            for(int i=0;i<wordUser.length();i++)System.out.print(" "+wordUser.charAt(i)+" ");
    
            print("\nIngresa una letra para empezar a adivinar");
            char userTry=input.next().charAt(0);
            int charIndex=word.indexOf(userTry);
    
            if(charIndex!=-1){
                print("Muy bien, sí está esa letra en la palabra");
                for(int i=0;i<wordUserArray.length;i++){
                   if(word.charAt(i)==(userTry))wordUserArray[i]=userTry; 
                }
                
                wordUser=new String(wordUserArray);
                continue;
            }
            print("La palabra no contiene esa letra, vuelve a intentar");
        }while(true);

    }
}


public class shift{
    public static void print(Object a){
        System.out.println(a);
    }
}