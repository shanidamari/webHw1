package webHw1;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner; 

public class part4 {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		System.out.println("Please enter number between 1 to 50");
		int min=1, max=50,i;
		double p1,p2=0,flag=0;
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		i=Integer.valueOf(s);
		while(i>max || i<min)
		{
			System.out.println("The number "+ i+ " is not between 1 to 50");
			System.out.println("Please enter again");
			i= scan.nextInt();
		}
		scan.close();
		
		PrintWriter writer = new PrintWriter("Hw1Part4.html", "UTF-8");
		writer.println("<!DOCTYPE html>\n<html>\n<head> ");
		writer.println("<title>Hw1part4</title>\n</head>");
		writer.print("<body style=\"background: linear-gradient(to right");
		p1=100.00/i;
		while(flag<100)
		{
			writer.print(",blue "+ p2+ "%,");
			p2+=p1;
			writer.print("blue "+ p2+ "%");
			flag+=p1;
			if(flag>=100)
				break;
			writer.print(",red "+ p2+ "%,");
			p2+=p1;
			writer.print("red "+ p2+ "%");
			flag+=p1;
			if(flag>=100)
				break;
			writer.print(",green "+ p2+ "%,");
			p2+=p1;
			writer.print("green "+ p2+ "%");
			flag+=p1;
			
		}
		writer.print(")"+";"+"\"");
		writer.println(">\n</body>\n</html>");
		writer.close();
	}

}
