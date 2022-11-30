/*
Escribe un programa que muestre por pantalla 10 palabras en inglés junto a su 
correspondiente traducción al castellano. Las palabras deben estar distribuidas 
en dos columnas y alineadas a la izquierda.

computer      computadora
student       alumno
cat           gato
dog           perro
machine       maquina
bock          libro

*/
package ejercicio3;

public class Ejercicio3 {

    public static void main(String[] args) {
        System.out.printf("%-10s %s\n","computer","ordenador");
        System.out.printf("%-10s %s\n","student","alumno");
        System.out.printf("%-10s %s\n","cat","gato");
        System.out.printf("%-10s %s\n","dog","perro");
        System.out.printf("%-10s %s\n","machine","maquina");
        System.out.printf("%-10s %s\n","bock","libro");
    }    
}
/*
%-10s %s   :  computer(10espacio a su derecha)ordenador
\n   : da un salto de linea despues de cada printf
*/
