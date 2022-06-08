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
    	System.out.println( args[0] );
    	String path = args[0];
    	path.replace( "\","\\");
        File file = new File( path );
        Scanner scan = new Scanner(file);

        int length = 0;
        while(scan.hasNextLine()) 
        {
        	scan.nextLine();
        	length++;
        }
        System.out.println( length );
    }
}
