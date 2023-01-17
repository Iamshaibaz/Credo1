package assignment;

public class Fibonacci {

	public static void main(String[] args) {

     int a =0,b=1,c;              //3 variable
     System.out.print(a+" "+b);   //give gap between first two
     for(int i =1;i<=10;i++)      //for loop
     {
    	 c=a+b;                   //c=a+b;
    	 System.out.print(" "+ c);//print c
    	                          //change value a =b and b=c; 
    	 a=b;
    	 b=c;
     }
   }

}
