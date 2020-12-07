
public class SumAverageRunningInt {

	public static void main(String[] args) {
		
		System.out.println("1. For loop");
		int sumf = 0;
		double averagef;
		int lowerboundf = 1;
		int upperboundf = 100;
		
		for (int number = lowerboundf; number <= upperboundf; number++) {
			sumf += number; 
		}
		averagef = (sumf/100);
		System.out.println("The sum of 1 to 100 is " + sumf);
		System.out.println("The average is " + averagef);
		System.out.println();
		
		
		System.out.println("2. While-Do loop");
		int sumw = 0;
		double averagew;
		int lowerboundw = 1;
		int upperboundw = 100;
		int numberw = lowerboundw;
		while(numberw <= upperboundw) {
			sumw += numberw;
			numberw++;
 		}
		averagew = (sumw/100);
		System.out.println("The sum of 1 to 100 is " + sumw);
		System.out.println("The average is " + averagew);
		System.out.println();
		
		
		System.out.println("3. Do-While loop");
		int sumdw = 0;
		double averagedw;
		int lowerbounddw = 1;
		int upperbounddw = 100;
		int numberdw = lowerbounddw;
		do {
			sumdw += numberdw;
			numberdw++;
 		}while(numberdw <= upperbounddw);
		averagedw = (sumdw/100);
		System.out.println("The sum of 1 to 100 is " + sumdw);
		System.out.println("The average is " + averagedw);

	}

}
