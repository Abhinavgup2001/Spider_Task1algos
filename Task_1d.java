package task_1;

import java.util.Scanner;

public class Task_1d {
	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
int t= sc.nextInt()	;
while(t-->0) {
		int n=sc.nextInt()	;
int r=sc.nextInt()	;
int x=sc.nextInt()	;
int y=sc.nextInt()	;
int originalrating=r;
int[] match= new int[n];
int[] scn= new int[n];
for(int i=0;i<n;i++) {
	match[i]=sc.nextInt()	;
}
for(int i=0;i<n;i++) {
	scn[i]=sc.nextInt()	;
}

for(int i=0;i<n;i++) {
	if(match[i]==1) {
		
		if(scn[i]==1)
			r=r+x;
		else
			r=r-x;
	}
}
if(r>originalrating)
	System.out.println("promoted");
else if(r<originalrating) {
	System.out.println("demoted");
}
else
	System.out.println("no change");
	
}
	}
	
}
