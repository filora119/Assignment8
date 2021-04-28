package Assighment8;

public class Question8 {

	public static void main(String[] args) {

		
		 int count=8;
         int pre1=0,pre2=1;
         System.out.println("Fibonoci series of " + count +" numbers");
         
         
         for(int i=1;i<count;i++){
       	 
       	  
       		  System.out.print(pre2 + " ");
       		  
      //On each iterstion ,we are assigning second number to the first number 
      //and assigning the sum of last two numbers to the second number

      int sumOfPreTwo=pre1+pre2;
      pre1=pre2;
      pre2=sumOfPreTwo;
		
		
		
	}
	}
}
