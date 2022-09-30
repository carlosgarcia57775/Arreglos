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
public class Ejercicio_5 {
//Creo mi metodo main
public static void main(String[] args) {
//restamos La posicion mayor (Z, añadiendole 1) a la posicion menor
char abecedario[]=new char[91-65];
//creamos el abecedario
for(int i=65, indice=0;i<91;i++, indice++){
abecedario[indice]=(char)i;
}
//Creo mi objeto y asigno su valor
Scanner sn=new Scanner(System.in);
//Pedimos un numero, que serán posiciones del array
System.out.println("inserte un numero entre 0 y "+(abecedario.length-1)+". -1 para acabar");
//Creo mi variable
int num=sn.nextInt();
//Creo mi cadena
String cadena="";
//Creo mi ciclo
while(num!=-1){
//Comprobamos que el número es correcto
if(num>=0 && num<abecedario.length){
cadena+=abecedario[num];
//Muestro lo siguiente
System.out.println("inserte un numero entre 0 y "+(abecedario.length-1)+". -1 para acabar");
//De lo contrario
}else{
//Muesro que no es valiodo
System.out.println("Numero no valido inserte un numero entre 0 y "+(abecedario.length-1)+". -1 para acabar");
}
num=sn.nextInt(); //lo pedimos de nuevo
}
//Resultado final
System.out.println("La cadena resultante es "+cadena);
}
}
