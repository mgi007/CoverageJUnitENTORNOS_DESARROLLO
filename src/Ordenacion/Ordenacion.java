package Ordenacion;

public class Ordenacion {
	
	public Ordenacion() {
		
	}
	
	public static String ordenar3(int num1, int num2, int num3) {
		int max=0;
		int min=0;
		int med=0;
		
		if(num1==num2 && num2==num3) {
			max = num1;
			med = num2;
			min = num3;
			
		} else {
		// Comprobamos cual es el mayor de los tres números
				if(num1>=num2 && num1>=num3) {
					max = num1;
				} else if (num2>=num1 && num2>=num3) {
					max = num2;
				} else {
					max = num3;
				}
				
				// Comprobamos cual es el menor de los tres números
				if(num1<=num2 && num1<=num3) {
					min = num1;
				} else if (num2<=num1 && num2<=num3) {
					min = num2;
				} else {
					min = num3;
				}
			
				// Por descarte deducimos el número que estara
				if(num1==max) {
					if(num1==num2 || num3==min) {
						med = num2;
					} else  {
						med = num3;
					}
				} else if(num2==max) {
					if(num2==num1 || num3 == min) {
						med = num1;
					} else {
						med = num3;
					}
				} else {
					if(num3==num1 || num2==min) {
						med = num1;
					} else {
						med = num2;
					}
				}
				/*
				if((num1==max && num2==min) || (num2==max && num1==min)) {
					med = num3;
				} else if ((num1==max && num3==min) || (num3==max && num1==min)) {
					med = num2;
					
				} else if((num2==max && num3==min) || (num3==max && num2==min)) {
					med = num2;
				}
				*/
		}
				
		return new String (max + ", " + med  + ", " + min);	
	}
}