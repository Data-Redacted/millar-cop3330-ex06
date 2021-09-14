package org.example;

import java.util.Date;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        Date dt = new Date();
        int rear = 1900+dt.getYear();

        System.out.println( "What's your age?" );
        int age = scan.nextInt();

        System.out.println( "When do you want to retire?" );
        int ret = scan.nextInt();

        System.out.println( "You can retire in " + (ret-age) + " years." );
        System.out.println( "It is " + rear + " you can retire in " + (ret+rear) );

    }
}
