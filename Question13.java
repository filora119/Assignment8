package Assighment8;

public class Question13 {

	public static void main(String[] args) {

		
		
		System.out.println(waterTax(101));
		
	}
public static double waterTax(double unit) {

	
	double bill=0;
	if(unit<50) {
		return unit*0.6;
		
	}else if(unit>=50) {
		return unit*0.9;
		
	}else if(unit>100) {
		return (unit*90)+(50);
	}else if(unit>150) {
		return (unit*90)+100;

	}
	return bill;
	
	
	
}
}
