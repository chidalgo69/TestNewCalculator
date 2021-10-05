
package CalculadoraCodigoLimpio;
import java.util.Scanner;

public class Calculadora {
    
    public static void main(String[] args) {
        
        
        Scanner leer = new Scanner(System.in);
        
        //Nombramiento de variables
        
        int elegirOpcion = 0;
        int divisoresExactos = 0;
        int numero1 = 0;
        int numero2 = 0;
        int indice = 0;
        double resultado = 0;
        double numeroInverso = 0;
        double residuo = 0;
        
        
        //Usamos un DO para iniciar el menu de selección        
        do {
        
        System.out.println("\n");
        System.out.println ("SELECCIONE UN NUMERO DE OPERACION A REALIZAR");
        System.out.println("\n");
        System.out.println ("1.SUMA");
        System.out.println ("2.RESTA");
        System.out.println ("3.MULTIPLICACION");
        System.out.println ("4.DIVISION");
        System.out.println ("5.PRIMO");
        System.out.println ("6.PALINDROMO");
        System.out.println ("7.SALIR");
        elegirOpcion = leer.nextInt();
        
        //Condicional IF para para solitar uno o dos numeros segun la opción elegida
        
        if(elegirOpcion < 5){
            
            System.out.print("Inserte primer número: ");
            numero1 = leer.nextInt();
            System.out.print("Inserte segundo número: ");
            numero2 = leer.nextInt();

        }    if(elegirOpcion == 5 || elegirOpcion == 6 ){
            
            System.out.print("Inserte un número: ");
            numero1 = leer.nextInt();
        }     
        
        //Funcion SWITCH para ejecutar opciones del menu
        
            switch (elegirOpcion){ 
        
        case 1: //Suma
            
	elegirOpcion = 1;
	resultado = numero1 + numero2;
	System.out.println("El resultado es: " +resultado);
	break;
	
	case 2: //Resta
            
	elegirOpcion = 2;
	resultado = numero1 - numero2;
	System.out.println("El resultado es: " +resultado);
	break;

	case 3: //Multiplicacion
            
	elegirOpcion = 3;
	resultado = numero1 * numero2;
	System.out.println("El resultado es: " +resultado);
	break;

	case 4: //Division
            
	elegirOpcion = 4;
	resultado = numero1 / numero2;
	System.out.println("El resultado es: " +resultado);
	break;

	case 5: //Primo
            
	elegirOpcion = 5; 
	for (indice=1; indice<= numero1; indice++){
            if ((numero1 % indice) == 0){
            divisoresExactos = divisoresExactos + 1;
             } 
            }
            if (divisoresExactos <= 2){
            System.out.println("El numero es Primo");
            }else{
            System.out.println("El numero no es Primo ");
            }
	break;      
     
	case 6: //Polindromo
            
	elegirOpcion = 6;
        while (numero1 < 10);

        //le damos la vuelta al número
        resultado = numero1;
        while (resultado!=0){
            residuo = resultado % 10;
            numeroInverso = numeroInverso * 10 + residuo;
            resultado = resultado / 10;
        }

         if(numero1 == numeroInverso){
            System.out.println("Es Palindromo");
        }else{
            System.out.println("No es Palindromo");

          } break;
         } 
        } while(elegirOpcion != 7);// Opcion de Salida
        System.out.println("A ELEGIDO SALIR DEL PROGRAMA");
        
        
    }
    
}


