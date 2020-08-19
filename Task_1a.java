package task_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

public class Task_1a {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t= parseInt(br.readLine());
        while(t-->0) {
        	String testcase= br.readLine();
        
		int average=Integer.parseInt(testcase,2);
		if(average>1) {
		int num1= average+1;
		int num2= average-1;
		int length1 = (int)(Math.log(num1) / Math.log(2));
		int length2 = (int)(Math.log(num2) / Math.log(2));
		if(length1==length2)
		{
			String number1=Integer.toBinaryString(num1);
			String number2=Integer.toBinaryString(num2);
			System.out.println(number1);
			System.out.println(number2);
		}
		
			
		else {
			System.out.println("-1");
		}
	}
		else
			System.out.println("-1");

}
}
}
