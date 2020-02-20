package cleancode;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Assignment3 {
	
	private static Scanner scanner;

	public static void main(String args[]) throws IOException
	{
		scanner = new Scanner(System.in);
    	OutputStreamWriter output = new OutputStreamWriter(System.out);
    	Interest interest1=new Interest();
    	Houseconstruction houseConstruction = new Houseconstruction();
        int choice;
    	char choice1=0;
		do
    	{
    		output.write("-----Menu-----\n");
    		output.flush();
    		output.write("1.Interest Calculator\n");
    		output.flush();
    		output.write("2.Total Construction Cost\n");
    		output.flush();
    		output.write(" Enter your choice:\n");
    		choice=scanner.nextInt();
    		
    		switch(choice)
    		{
    		case 1:
    			interest1.inter();
    			break;
    		case 2:
    			houseConstruction.House();
    			break;
    		default:
    			output.write("\n Wrong Choice");
			   output.flush();
    		}
    		output.write("\n Do you want to continue ");
    		output.flush();
    		output.write("\nif no press n");
    		output.flush();
    		output.write("\nif yes press any character other than n");
    		output.flush();
    		scanner.nextLine();
    		choice1= scanner.next().charAt(0);
    	}while(choice1!='n');
    	
	}

	

	
}