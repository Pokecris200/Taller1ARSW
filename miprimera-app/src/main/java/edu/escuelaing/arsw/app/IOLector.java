package edu.escuelaing.arsw.app;
import java.io.File;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class IOLector 
{
    public static void main( String[] args ) throws Exception
    {
        File file = new File(args[0]);
        Scanner scanner = new Scanner(file);

        int length = 0;
        while(scanner.hasNextLine()) 
        {
        	length++;
        }
        System.out.println( length );
    }
}
