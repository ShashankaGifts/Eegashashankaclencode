package cleancode;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Interest {
	Scanner scanner = new Scanner(System.in);
	OutputStreamWriter output = new OutputStreamWriter(System.out);
	double finalAmount=0.0;
	double principal;
	double rateOfInterest;
	double timePeriod;
	double no_of_time_interest_applied;
	double PTR=0.0;
	double P=0.0;
	public void inter() throws IOException
	{
		output.write("\n u have choosed Interest caluclator");
		output.flush();
		output.write("\n Please enter the principle amount");
		output.flush();
		principal = scanner.nextDouble();
		output.write("\n Please enter the rate of interest per annum");
		output.flush();
		rateOfInterest=scanner.nextDouble();
		output.write("\n Please enter the time period in years");
		output.flush();
		timePeriod = scanner.nextDouble();
	    output.write("\nWhat you want to compute");
	    output.flush();
	    output.write("\n 1:SimpleInterest");
	    output.flush();
	    output.write("\n 2:CompoundInterest");
	    output.flush();
	int choice=scanner.nextInt();
	switch(choice)
	{
	case 1:
		PTR=(principal*rateOfInterest*timePeriod)/100; //1000*12*1/100=120+1000=1120
		P=principal;
		finalAmount=P+PTR;
		output.write("Total amount with simple interest for Rs." +P+ " at " + rateOfInterest+ "% interest for " +timePeriod + " year(s) is: "+finalAmount);
		output.flush();
		break;
	case 2:
		finalAmount=principal*Math.pow((1+rateOfInterest/100),timePeriod);
		output.write("Compound interest is: "+finalAmount);
		output.flush();
		break;
	default:
		output.write("\n Wrong Choice");
		   output.flush();
	}
	
	
	}
	
	
}
