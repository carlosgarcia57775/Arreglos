/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos_carlos_eduardo_salazar_garcia_4b.dsm;

/**
 *
 * @author carlo
 */
//Importo lo siguiente
import java.util.Scanner;
//Creo mi clase
public class Ejercicio_4 {
//Creo mi metodo main
public static void main(String[] args) {
//Asigno valor a mi variable
Scanner sn=new Scanner(System.in);

//Pedimos una longitud
System.out.println("Inserte una longitud");
//Creo una variable
int longitud=sn.nextInt();

//creo un array con esa longitud
int numeros[]=new int[longitud];

//recorro el arreglo y uso la funcion para crear un aleatorio
for(int i=0;i<numeros.length;i++){
numeros[i]=generaNumeroAleatorio(0,10);
//Muestro el mensaje con lo siguiente 
System.out.println("En la posicion "+i+" esta el valor: "+numeros[i]);
}

}

//Crea un numero aleatorio, entre un minimo y un maximo
public static int generaNumeroAleatorio(int minimo, int maximo){
//Retorno los valores especificados
return (int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));

}

}
