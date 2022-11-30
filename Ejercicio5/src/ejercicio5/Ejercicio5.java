/*
Ejercicio 5: Modifica el programa anterior añadiendo colores. 
Puedes mostrar cada asignatura de un color diferente.
*/
package ejercicio5;

public class Ejercicio5 {

    public static void main(String[] args) {
        //Definiremos los colores como variables, segun el estandar ANSI
        String rojo = "\033[0;31m";
        String verde = "\033[0;32m";
        String naranja = "\033[0;33m";
        String azul = "\033[0;34m";
        String morado = "\033[0;35m";
        String celeste = "\033[0;36m";
        
        System.out.println("");
        System.out.println(rojo+"Lunes\tMartes\tMiercol\tJueves\tViernes");
        System.out.println("=====\t======\t======\t======\t=======");    //Cantidad de = de acuerdo a las letras de los dias
        System.out.println(verde+"Progr\tProgr\tProgr\tProgr\tProgr");
        System.out.println(naranja+"Design\tDesign\tDesign\tDesign\tDesign");
        System.out.println(azul+"BDat\tBDat\tBDat\tBDat\tBDat");
        System.out.println(morado+"Tecno\tTecno\tTecno\tTecno\tTecno");
        System.out.println(celeste+"Segur\tSegur\tSegur\tSegur\tSegur");
        System.out.println("");
    }
}
    

