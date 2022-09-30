/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos_carlos_eduardo_salazar_garcia_4b.dsm;

/**
 *
 * @author carlo
 */

//Empiezo importando lo siguiente 
import java.util.Scanner;
//Creo mi clase 
public class Ejercicio_3 {
//Creo mi metodo main
public static void main(String[] args) {
//Le asigno un valor a la variable
Scanner sn=new Scanner(System.in);

//Pido una longitud
System.out.println("Inserte una longitud");
//Creo mi variable y otorgo el valor 
int longitud=sn.nextInt();

//Creo el arreglo con esa longitud
int numeros[]=new int[longitud];

//Creo mi variable 
int num;

//Recorro el array
for(int i=0;i<numeros.length;i++){
//Muestro mi mensaje
System.out.println("Inserte un número en la posicion "+i);

do{
//pido el numero en una posicion especifica
num=sn.nextInt();

//Creo mi condicion con mi inicio y fin
if(!(num>=0 && num<=10)){
//muestro el mensaje 
System.out.println("Error. Solo números del 0 al 10. "
+ "Inserte un número en la posicion "+i);
}
//creo mi ciclo 
}while(!(num>=0 && num<=10));

//asigno, ya que sé que el número es correcto
numeros[i]=num;

}

//Esta parte es opcional para que se vea lo que hemos insertado
System.out.println("Estos son los números elegidos por el usuario");
//Creo mi condicion y autoincremento
for(int i=0;i<numeros.length;i++){
//muestro lo mi argumento
System.out.println(numeros[i]);
}

}

}
