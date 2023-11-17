package exercisis;

import java.util.Scanner;

public class CircleArea {
    static final float PI = 3.14159f;
    public static void main(String[] args) {
        float radio, area;
        Scanner consola = new Scanner(System.in);
                
        System.out.print("Introduce el radio del circulo: ");
        radio = consola.nextFloat();
        
        area = PI*radio*radio;
        
        System.out.print("El area del circulo es: "+area);
    }
}
