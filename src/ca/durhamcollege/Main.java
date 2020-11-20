/**
 * Name: Andre Agrippa
 * Date: 11/20/2020
 * File: Main.java
 * Purpose: Lesson 10 OOP3200
 */
package ca.durhamcollege;
import java.util.Scanner;

public class Main {

    public Main()
    {
        Scanner keyboard = new Scanner(System.in);
        String prompt = "";

        Vector2D point1 = new Vector2D();
        System.out.print("Enter the first point (x, y): ");

        prompt = keyboard.nextLine();
        var values = prompt.split(",");
        point1.Set(Float.parseFloat(values[0]), Float.parseFloat(values[1]));


        System.out.println("\n--------------------------------------------------------------" );
        System.out.println("You Entered " + point1.toString() + " for the first point" );
        System.out.println("--------------------------------------------------------------\n" );
        Vector2D point2 =  new Vector2D();
        System.out.print("Enter the second point (x, y): ");

        prompt = keyboard.nextLine();
        values = prompt.split(",");
        point2.Set(Float.parseFloat(values[0]), Float.parseFloat(values[1]));

        System.out.println("\n--------------------------------------------------------------" );
        System.out.println("You Entered " + point2.toString() + " for the second point" );
        System.out.println("--------------------------------------------------------------\n" );

        System.out.printf("Magnitude of first point is: %.3f \n", point1.getMagnitude());
        System.out.printf("Magnitude of second point is: %.3f \n",point2.getMagnitude());
        System.out.printf("Distance between first point and second point is: %.3f \n", Vector2D.distance(point1, point2));
        System.out.println("--------------------------------------------------------------\n" );
    }

    public static void main(String[] args) {
	new Main();
    }
}
