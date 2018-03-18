import java.util.Scanner;

class Synth {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Input factor value:");
		double f1 = input.nextDouble();

		System.out.println("Input number of coefficients (3-8):");
		int coef = input.nextInt();
		
		//Find number of coefficients to determine setup for synthetic division
		if (coef == 3){
			System.out.println("Enter first coefficient:");
			double c1 = input.nextDouble();

			System.out.println("Enter second coefficient:");
			double c2 = input.nextDouble();

			System.out.println("Enter third coefficient:");
			double c3 = input.nextDouble();

			/* cx doubles represent original coefficients
			px doubles represent placeholders
			ax doubles represent answers
			*/

			double p1 = c1*f1;
			double p2 = (c2+p1)*f1;
			double p3 = (c3+p2)*f1;
			double a1 = c1;
			double a2 = c2+p1;

			if (p3 == 0){
				System.out.println("New coefficients are: "+a1+"; "+a2);
			} else{
				System.out.println("Remainder found. Please solve by hand.");
			}
		} else if (coef == 4){
			System.out.println("Enter first coefficient:");
			double c1 = input.nextDouble();

			System.out.println("Enter second coefficient:");
			double c2 = input.nextDouble();

			System.out.println("Enter third coefficient:");
			double c3 = input.nextDouble();

			System.out.println("Enter fourth coefficient:");
			double c4 = input.nextDouble();

			/* cx doubles represent original coefficients
			px doubles represent placeholders
			ax doubles represent answers
			*/

			double p1 = c1*f1;
			double p2 = (c2+p1)*f1;
			double p3 = (c3+p2)*f1;
			double p4 = c4+p3;
			double a1 = c1;
			double a2 = c2+p1;
			double a3 = c3+p2;

			if (p4 == 0){
				System.out.println("New coefficients are: "+a1+"; "+a2+"; "+a3);
			} else{
				System.out.println("Remainder found. Please solve by hand.");
			}
		} else if (coef == 5){
			System.out.println("Enter first coefficient:");
			double c1 = input.nextDouble();

			System.out.println("Enter second coefficient:");
			double c2 = input.nextDouble();

			System.out.println("Enter third coefficient:");
			double c3 = input.nextDouble();

			System.out.println("Enter fourth coefficient:");
			double c4 = input.nextDouble();

			System.out.println("Enter fifth coefficient:");
			double c5 = input.nextDouble();

			/* cx doubles represent original coefficients
			px doubles represent placeholders
			ax doubles represent answers
			*/

			double p1 = c1*f1;
			double p2 = (c2+p1)*f1;
			double p3 = (c3+p2)*f1;
			double p4 = (c4+p3)*f1;
			double p5 = (c5+p4)*f1;
			double a1 = c1;
			double a2 = c2+p1;
			double a3 = c3+p2;
			double a4 = c4+p3;

			if (p5 == 0){
				System.out.println("New coefficients are: "+a1+"; "+a2+"; "+a3+"; "+a4);
			} else{
				System.out.println("Remainder found. Please solve by hand.");
			}
		} else if (coef == 6){
			System.out.println("Enter first coefficient:");
			double c1 = input.nextDouble();

			System.out.println("Enter second coefficient:");
			double c2 = input.nextDouble();

			System.out.println("Enter third coefficient:");
			double c3 = input.nextDouble();

			System.out.println("Enter fourth coefficient:");
			double c4 = input.nextDouble();

			System.out.println("Enter fifth coefficient:");
			double c5 = input.nextDouble();

			System.out.println("Enter sixth coefficient:");
			double c6 = input.nextDouble();

			/* cx doubles represent original coefficients
			px doubles represent placeholders
			ax doubles represent answers
			*/

			double p1 = c1*f1;
			double p2 = (c2+p1)*f1;
			double p3 = (c3+p2)*f1;
			double p4 = (c4+p3)*f1;
			double p5 = (c5+p4)*f1;
			double p6 = (c6+p5)*f1;
			double a1 = c1;
			double a2 = c2+p1;
			double a3 = c3+p2;
			double a4 = c4+p3;
			double a5 = c5+p4;

			if (p5 == 0){
				System.out.println("New coefficients are: "+a1+"; "+a2+"; "+a3+"; "+a4+"; "+a5);
			} else{
				System.out.println("Remainder found. Please solve by hand.");
			}
		} else if (coef == 7){
			System.out.println("Enter first coefficient:");
			double c1 = input.nextDouble();

			System.out.println("Enter second coefficient:");
			double c2 = input.nextDouble();

			System.out.println("Enter third coefficient:");
			double c3 = input.nextDouble();

			System.out.println("Enter fourth coefficient:");
			double c4 = input.nextDouble();

			System.out.println("Enter fifth coefficient:");
			double c5 = input.nextDouble();

			System.out.println("Enter sixth coefficient:");
			double c6 = input.nextDouble();

			System.out.println("Enter seventh coefficient:");
			double c7 = input.nextDouble();

			/* cx doubles represent original coefficients
			px doubles represent placeholders
			ax doubles represent answers
			*/

			double p1 = c1*f1;
			double p2 = (c2+p1)*f1;
			double p3 = (c3+p2)*f1;
			double p4 = (c4+p3)*f1;
			double p5 = (c5+p4)*f1;
			double p6 = (c6+p5)*f1;
			double p7 = (c7+p6)*f1;
			double a1 = c1;
			double a2 = c2+p1;
			double a3 = c3+p2;
			double a4 = c4+p3;
			double a5 = c5+p4;
			double a6 = c6+p5;

			if (p5 == 0){
				System.out.println("New coefficients are: "+a1+"; "+a2+"; "+a3+"; "+a4+"; "+a5+"; "+a6);
			} else{
				System.out.println("Remainder found. Please solve by hand.");
			}
		} else if (coef == 8){
			System.out.println("Enter first coefficient:");
			double c1 = input.nextDouble();

			System.out.println("Enter second coefficient:");
			double c2 = input.nextDouble();

			System.out.println("Enter third coefficient:");
			double c3 = input.nextDouble();

			System.out.println("Enter fourth coefficient:");
			double c4 = input.nextDouble();

			System.out.println("Enter fifth coefficient:");
			double c5 = input.nextDouble();

			System.out.println("Enter sixth coefficient:");
			double c6 = input.nextDouble();

			System.out.println("Enter seventh coefficient:");
			double c7 = input.nextDouble();

			System.out.println("Enter eighth coeffecient:");
			double c8 = input.nextDouble();

			/* cx doubles represent original coefficients
			px doubles represent placeholders
			ax doubles represent answers
			*/

			double p1 = c1*f1;
			double p2 = (c2+p1)*f1;
			double p3 = (c3+p2)*f1;
			double p4 = (c4+p3)*f1;
			double p5 = (c5+p4)*f1;
			double p6 = (c6+p5)*f1;
			double p7 = (c7+p6)*f1;
			double p8 = (c8+p7)*f1;
			double a1 = c1;
			double a2 = c2+p1;
			double a3 = c3+p2;
			double a4 = c4+p3;
			double a5 = c5+p4;
			double a6 = c6+p5;
			double a7 = c7+p6;

			if (p5 == 0){
				System.out.println("New coefficients are: "+a1+"; "+a2+"; "+a3+"; "+a4+"; "+a5+"; "+a6+"; "+a7);
			} else{
				System.out.println("Remainder found. Please solve by hand.");
			}
		} else{
			System.out.println("Error. Please input a value 3-8.");
		}
	}
}







