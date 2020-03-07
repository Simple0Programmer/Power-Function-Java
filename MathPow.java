import java.util.Scanner;

public class MathPow {
	
	public static double pow(double base, double exp) {
		double result = 1;
		if(exp < 0) {
			for(int i = (int) exp; i != 0;i++) {
				result = result * (1/base);
			}
		}else {
			for(int i = 0; i < exp;i++) {
				result = result * base;
			}
		}
		return result;
	}
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		double value = -1;
		double exp = -1;
		double result = 0;
		double result2 = 0;
		while(true) {
			if(value == 0 && exp == 0) {
				break;
			}
			System.out.print("Enter number: ");
			value = input.nextDouble();
			System.out.print("Enter exp: ");
			exp = input.nextDouble();
			result = MathPow.pow(value, exp);
			result2 = Math.pow(value, exp);//using Math library
			System.out.println("Result: " + result);
			System.out.println("Result: " + result2);
		}
		
		input.close();
		
	}
}
