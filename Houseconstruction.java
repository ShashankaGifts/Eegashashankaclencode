package cleancode;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Houseconstruction {
		
			Scanner scanner = new Scanner(System.in);
			OutputStreamWriter output = new OutputStreamWriter(System.out);
			int totalarea;
			int totalcost;
			public void House() throws IOException
			{
		       output.write("enter the area of the house");
		       output.flush();
				totalarea=scanner.nextInt();
				output.write("enter one of the below material from 1-4");
				   output.flush();
				output.write("\n1.Standard Material");
				   output.flush();
				output.write("\n2.Above Standard Material");
				   output.flush();
				output.write("\n3.High Standard Material");
				   output.flush();
				output.write("\n4.High Standard and fully automated home");
				   output.flush();
				int choice=scanner.nextInt();
				switch(choice)
				{

				case 1:
					totalcost=totalarea*1200;
					output.write("Total cost of Standard material house is: "+totalcost);
					output.flush();
					break;
				case 2:
					totalcost=totalarea*1500;
					output.write("Total cost of Above Standard material house is: "+totalcost);
					output.flush();
					break;
				case 3:
					totalcost=totalarea*1800;
					output.write("Total cost of High Standard material house is "+totalcost);
					   output.flush();
					break;
				case 4:
					totalcost=totalarea*2500;
					output.write("Total cost of High Standard material house and fully automated house is: "+totalcost);
					   output.flush();
					break;
				default:
					output.write("invalid choice");
					   output.flush();
				}
			}
			
}