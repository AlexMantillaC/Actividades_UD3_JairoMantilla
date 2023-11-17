package exercisis;

import java.util.Scanner;

public class FormattedDate {

    public static void main(String[] args) {
        /*Crea un programa anomenat FormattedDate amb una classe amb el mateix nom dins. 
        Elprograma demanarà a l'usuari que introduïsca el dia, el mes i l'any del seu naixement 
        (totsels valors són sencers). Llavors, es traurà per pantalla la data de naixement amb 
        el següentformat d/m/a. Per exemple, si l'usuari tecleja dia=7,mes=11, any=1990, 
        el programa traurà7/11/1990.*/
        Scanner consola = new Scanner(System.in);
        
        System.out.println("Introduce tu dia de nacimiento: ");
        int dia = consola.nextInt();
        
        System.out.println("Introduce tu mes de nacimiento: ");
        int mes = consola.nextInt();
        
        System.out.println("Introduce tu año de nacimiento: ");
        int año = consola.nextInt();
        
        consola.close();
        
        System.out.println(dia+"/"+mes+"/"+año+"/");
    }
    
}
