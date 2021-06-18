/**When this program is ran, it prints some prices
 * @author (Fikri San Koktas)
 * @version (24 October 2020)*/
 
import java.awt.Point;
import java.util.Scanner;
import java.util.Random;
import java.lang.Object;

public class KFS_RandomPrice_Main
{
    public static void main(String [] args)
    {
       
        double price1 = 0 + (Math.random()*9.99);
        double price2 = 5 + (Math.random()*9.99);
        double price3 = 10 + (Math.random()*9.95);

        System.out.println("Price 1: " + String.format("%.2f", price1)); 
        System.out.println("Price 2: " + String.format("%.2f", price2));
        System.out.println("Price 3: " + String.format("%.2f", price3));
    }
}
