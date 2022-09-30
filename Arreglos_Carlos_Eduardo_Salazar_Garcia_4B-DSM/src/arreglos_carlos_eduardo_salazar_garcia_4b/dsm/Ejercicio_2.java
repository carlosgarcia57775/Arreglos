/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos_carlos_eduardo_salazar_garcia_4b.dsm;

/**
 *
 * @author carlo
 */
//Se empieza creando una clase llamada como se muestra
public class Ejercicio_2 {
//Creo un metodo main 
public static void main(String[] args) {
//Creo un array y heredo el valor 
int[] numeros=new int[100];
//Declaro las variables necesarias
int suma=0;
double media;
//Recorro el arreglo, asigno números y sumo
for(int i=0;i<numeros.length;i++){
numeros[i]=i+1;
suma+=numeros[i];
}
//Calculo la media y muestro la suma y la meda
System.out.println("La suma es "+suma);
media=(double)suma/numeros.length;
//muestro los resultados de acuerdo a los parametros 
System.out.println("La media es "+media);
}
}
