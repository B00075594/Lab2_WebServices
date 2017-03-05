package lab2WebServices;

import javax.jws.WebService;

@WebService
public class MinProj {
	public void constuctor(){
		
	}
	
	public int number(int a, int b, int c){
		int smallest;
		if(a<b && a<c){
			smallest = a;
		}
		else if(b<a && b<c){
			smallest = b;
		}
		else
			smallest = c;
		
		return smallest;
	}
	
	public double hypot(double height, double base){
		
		double hypotenuse =  Math.sqrt(Math.pow(height, 2) + Math.pow(base, 2));
		return hypotenuse;
	}

}

