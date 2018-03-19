import java.util.Scanner;

/*Synthetic division calculator.
Returns new coefficients after original coefficeint input and factor value.
Remainder return in development. Inaccurate remainder results are posible.
*/
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
			r1 is the remainer result
			fx variables are factors
			*/

			double p1 = c1*f1;
			double p2 = (c2+p1)*f1;
			double r1 = c3+p2;
			double a1 = c1;
			double a2 = c2+p1;
			double f2 = Math.abs(f1);

			if (r1 == 0){
				System.out.println("New coefficients are: "+a1+"; "+a2);
			} else{
				/*Determine the if constant is poitive or negative in (x+c)
				Remainders are printed in (r/(x+c)) format
				*/
				if (f1 > 0){
					System.out.println(a1+"x+"+a2+"+("+r1+"/(x-"+f2+"))");
				} else{
					System.out.println(a1+"x+"+a2+"+("+r1+"/(x+"+f2+"))");
				}
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
			r1 is the remainer result
			fx variables are factors
			*/

			double p1 = c1*f1;
			double p2 = (c2+p1)*f1;
			double p3 = (c3+p2)*f1;
			double r1 = c4+p3;
			double a1 = c1;
			double a2 = c2+p1;
			double a3 = c3+p2;
			double f2 = Math.abs(f1);

			if (r1 == 0){
				System.out.println("New coefficients are: "+a1+"; "+a2+"; "+a3);
			} else{
				/*Determine the if constant is poitive or negative in (x+c)
				Remainders are printed in (r/(x+c)) format
				*/
				if (f1 > 0){
					System.out.println(a1+"x^2+"+a2+"x+"+a3+"+("+r1+"/(x-"+f2+"))");
				} else{
					System.out.println(a1+"x^2+"+a2+"x+"+a3+"+("+r1+"/(x+"+f2+"))");
				}
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
			r1 is the remainer result
			fx variables are factors
			*/

			double p1 = c1*f1;
			double p2 = (c2+p1)*f1;
			double p3 = (c3+p2)*f1;
			double p4 = (c4+p3)*f1;
			double r1 = c5+p4;
			double a1 = c1;
			double a2 = c2+p1;
			double a3 = c3+p2;
			double a4 = c4+p3;
			double f2 = Math.abs(f1);

			if (r1 == 0){
				System.out.println("New coefficients are: "+a1+"; "+a2+"; "+a3+"; "+a4);
			} else{
				/*Determine the if constant is poitive or negative in (x+c)
				Remainders are printed in (r/(x+c)) format
				*/
				if (f1 > 0){
					System.out.println(a1+"x^3+"+a2+"x^2+"+a3+"x+"+a4+"+("+r1+"/(x-"+f2+"))");
				} else{
					System.out.println(a1+"x^3+"+a2+"x^2+"+a3+"x+"+a4+"+("+r1+"/(x+"+f2+"))");
				}
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
			r1 is the remainer result
			fx variables are factors
			*/

			double p1 = c1*f1;
			double p2 = (c2+p1)*f1;
			double p3 = (c3+p2)*f1;
			double p4 = (c4+p3)*f1;
			double p5 = (c5+p4)*f1;
			double r1 = c6+p5;
			double a1 = c1;
			double a2 = c2+p1;
			double a3 = c3+p2;
			double a4 = c4+p3;
			double a5 = c5+p4;
			double f2 = Math.abs(f1);

			if (r1 == 0){
				System.out.println("New coefficients are: "+a1+"; "+a2+"; "+a3+"; "+a4+"; "+a5);
			} else{
				/*Determine the if constant is poitive or negative in (x+c)
				Remainders are printed in (r/(x+c)) format
				*/
				if (f1 > 0){
					System.out.println(a1+"x^4+"+a2+"x^3+"+a3+"x^2+"+a4+"x+"+a5+"+("+r1+"/(x-"+f2+"))");
				} else{
					System.out.println(a1+"x^4+"+a2+"x^3+"+a3+"x^2+"+a4+"x+"+a5+"+("+r1+"/(x+"+f2+"))");
				}
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
			r1 is the remainer result
			fx variables are factors
			*/

			double p1 = c1*f1;
			double p2 = (c2+p1)*f1;
			double p3 = (c3+p2)*f1;
			double p4 = (c4+p3)*f1;
			double p5 = (c5+p4)*f1;
			double p6 = (c6+p5)*f1;
			double r1 = (c7+p6);
			double a1 = c1;
			double a2 = c2+p1;
			double a3 = c3+p2;
			double a4 = c4+p3;
			double a5 = c5+p4;
			double a6 = c6+p5;
			double f2 = Math.abs(f1);

			if (r1 == 0){
				System.out.println("New coefficients are: "+a1+"; "+a2+"; "+a3+"; "+a4+"; "+a5+"; "+a6);
			} else{
				/*Determine the if constant is poitive or negative in (x+c)
				Remainders are printed in (r/(x+c)) format
				*/
				if (f1 > 0){
					System.out.println(a1+"x^5+"+a2+"x^4+"+a3+"x^3+"+a4+"x^2+"+a5+"x+"+a6+"+("+r1+"/(x-"+f2+"))");
				} else{
					System.out.println(a1+"x^5+"+a2+"x^4+"+a3+"x^3+"+a4+"x^2+"+a5+"x+"+a6+"+("+r1+"/(x+"+f2+"))");
				}
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
			r1 is the remainer result
			fx variables are factors
			*/

			double p1 = c1*f1;
			double p2 = (c2+p1)*f1;
			double p3 = (c3+p2)*f1;
			double p4 = (c4+p3)*f1;
			double p5 = (c5+p4)*f1;
			double p6 = (c6+p5)*f1;
			double p7 = (c7+p6)*f1;
			double r1 = (c8+p7);
			double a1 = c1;
			double a2 = c2+p1;
			double a3 = c3+p2;
			double a4 = c4+p3;
			double a5 = c5+p4;
			double a6 = c6+p5;
			double a7 = c7+p6;
			double f2 = Math.abs(f1);

			if (r1 == 0){
				System.out.println("New coefficients are: "+a1+"; "+a2+"; "+a3+"; "+a4+"; "+a5+"; "+a6+"; "+a7);
			} else{
				/*Determine the if constant is poitive or negative in (x+c)
				Remainders are printed in (r/(x+c)) format
				*/
				if (f1 > 0){
					System.out.println(a1+"x^6+"+a2+"x^5+"+a3+"x^4+"+a4+"x^3+"+a5+"x^2+"+a6+"x+"+a7+"+("+r1+"/(x-"+f2+"))");
				} else{
					System.out.println(a1+"x^6+"+a2+"x^5+"+a3+"x^4+"+a4+"x^3+"+a5+"x^2+"+a6+"x+"+a7+"+("+r1+"/(x+"+f2+"))");
				}
			}
		} else{
			System.out.println("Error. Please input a value 3-8.");
		}
	}
}
