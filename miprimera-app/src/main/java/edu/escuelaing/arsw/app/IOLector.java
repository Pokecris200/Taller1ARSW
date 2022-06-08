package edu.escuelaing.arsw.app;
import java.io.File;
import java.util.Scanner;

/**
 * Class that reads a File and count the physical lines or the Lines of code of a File
 *
 */
public class IOLector 
{
	/**
	 * Principal method that reads the File and evaluate the number of physical or code lines
	 * @param args - the list with the type of lecture and the path of the file
	 * */
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
