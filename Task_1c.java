package task_1;

import java.util.Scanner;

public class Task_1c {
	static int t,temp1,temp2;
	static int ans[]= new int[6];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,8,7,16,9,43};
		
		
		/** query1 **/
		System.out.println("1 2");
		System.out.flush();
		Scanner sc= new Scanner(System.in);
		t=sc.nextInt();
		
		for(int i=0;i<6;i++) {
			for(int j=i+1;j<6;j++) {
				if(arr[i]*arr[j]==t) {
					 temp1=arr[i];
					 temp2=arr[j];
					break;
				}
			}
		}
		/** query2 **/
		System.out.println("2 3");
		System.out.flush();
		 t=sc.nextInt();		

		 for(int i=0;i<6;i++) {
				for(int j=i+1;j<6;j++) {
					if(arr[i]*arr[j]==t) {
						if(arr[i]==temp1) {
							/** The common 2nd number **/
							ans[1]=temp1;
						/** The number left from 1st query must be the first number **/	
						ans[0]=temp2;
						/** The other number for this query must be 3rd **/
						ans[2]=arr[j];
						break;
						}
						else if(arr[i]==temp2){
							/** The common 2nd number **/
					ans[1]=temp2;
					/** The number left from 1st query must be the first number **/
					ans[0]=temp1;
					/** The other number for this query must be 3rd **/
					ans[1]=arr[j];
					break;
						}
						/** If arr[i]!= any of temp1 and temp2 **/
					else {
						/** arr[j] must be the common 2nd element **/
						ans[1]=arr[j];
						ans[2]=arr[i];
						if(arr[j]==temp1)
							ans[0]=temp2;
						else
							ans[0]=temp1;
		
						break;
					}
				}
			}
	}
		 
		 /** query3 **/
			System.out.println("4 5");
			System.out.flush();
			
			t=sc.nextInt();
			
			for(int i=0;i<6;i++) {
				for(int j=i+1;j<6;j++) {
					if(arr[i]*arr[j]==t) {
						 temp1=arr[i];
						 temp2=arr[j];
						break;
					}
				}
			}
			/** query4 **/
			System.out.println("5 6");
			System.out.flush();
			 t=sc.nextInt();		

			 for(int i=0;i<6;i++) {
					for(int j=i+1;j<6;j++) {
						if(arr[i]*arr[j]==t) {
							if(arr[i]==temp1) {
								/** The common 5th number **/
								ans[4]=temp1;
							/** The number left from 3rd query must be 4th number **/	
							ans[3]=temp2;
							/** The other number for this query must be 6th **/
							ans[5]=arr[j];
							break;
							}
							else if(arr[i]==temp2){
								/** The common 5th number **/
						ans[1]=temp2;
						/** The number left from 3rd query must be the 4th number **/
						ans[0]=temp1;
						/** The other number for this query must be 6th **/
						ans[1]=arr[j];
						break;
							}
							/** If arr[i]!= any of temp1 and temp2 **/
						else {
							/** arr[j] must be the common 5th element **/
							ans[4]=arr[j];
							ans[5]=arr[i];
							if(arr[j]==temp1)
								ans[3]=temp2;
							else
								ans[3]=temp1;
			
							break;
						}
					}
				}
		}
			 for(int i=0;i<6;i++) {
System.out.println(ans[i]);

	}
}
}