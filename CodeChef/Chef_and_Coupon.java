/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner sc=new Scanner(System.in);
	
		if(sc.hasNextInt()){
		int T=0;
		T=sc.nextInt();
		
		while(T>0){
		    
		    int sum=0;
		    int sum1=0;
		    int[] arr1=new int[3];
		    int[] arr2=new int[3];
		   
		    int D=0;
		    int C=0;
		    D=sc.nextInt();
		    C=sc.nextInt();
		    
		    for(int i=0;i<3;i++){
		        if(sc.hasNextInt()){
		        arr1[i]=sc.nextInt();
		        sum+=arr1[i];
		        }
		        
		    }
		    for(int i=0;i<3;i++){
		        if(sc.hasNextInt()){
		        arr2[i]=sc.nextInt();
		        sum1+=arr2[i];
		        }
		    }
		    
		    int withCoupon=0;
		    int withoutCoupon=0;
		    if(sum>=150 && sum1>=150){
		       withCoupon=sum+sum1+C;
		       withoutCoupon=sum+sum1+(2*D);
		    }
		    else if((sum>=150 && sum1<150) || (sum<150 && sum1>=150)){
		        withCoupon=sum+sum1+C+D;
		        withoutCoupon=sum+sum1+(2*D);
		    }
		    else{
		        withCoupon=sum+sum1+(2*D);
		        withoutCoupon=sum+sum1+(2*D);
		    }
		   
		    if(withCoupon<withoutCoupon){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		    
		  T--;  
		}
		}
		
	}
}
