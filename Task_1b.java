package task_1;

import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Task_1b {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t= parseInt(br.readLine());
		while(t-->0) {
			String name= br.readLine();

			int n= name.length();
			if(n==0)
				System.out.println("Invalid String");
			else {
			int j=0;
			
			int degree=degreeOfString(name,n,j);
			System.out.println(degree);
		}
		

	}
	}

	
	 static int degreeOfString(String test, int m,int k) {
		if(m==1)
			return k;
		else {
			String firstPart=test.substring(0,(m/2) );
			String secondPart=test.substring(m/2, m);
			
			int out= firstPart.compareTo(secondPart);
			if(out==0) {
				k++;
			return	degreeOfString(firstPart,firstPart.length(),k);
			}
			else {
		
				return k;
			}
				
		
	}
		
	}

}
