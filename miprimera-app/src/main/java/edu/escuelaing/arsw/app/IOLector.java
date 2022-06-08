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
    	System.out.println( args[1] );
        File file = new File( args[1] );
        Scanner scan = new Scanner(file);
        
        int length = 0;
        if (args[0].toUpperCase().equals("PHY"))
        {
        	while(scan.hasNextLine()) 
            {
            	scan.nextLine();
            	length++;
            }
        }
        else if(args[0].toUpperCase().equals("LOC"))
        {
        	while(scan.hasNextLine()) 
            {
            	String line = scan.nextLine().strip();
            	Boolean condition = line.contains("/*") || line.contains("//") || line.contains("*/") || line.equals("");
            	if(condition)
            	{
            		length++;
            	}
            }
        }
        System.out.println( length );
    }
}
