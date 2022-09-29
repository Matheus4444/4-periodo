package src;

public class Teste {
	public static double func1(int a, int n) {
		double s = 0;                          //1

		for(int i = 1; i <= n; i++) {          //n+1
			s += i/Math.pow(a, i);             //n
		}
		return s;                              //1
	}										   //Complexidade local = 2n+3 Complexidade Assintótica = n

	public static double func2(int n, int m) {
		double s = 0;                         //1

		for(int i = 1; i <= n; i++) {         //n+1
			for (int j = 1; j <= m; j++) {    //n*(n+1)
				s += i*j;					  //n*n
			}
		}
		return s;                             //1
	}										  //Complexidade local = 2n²+2n+3 Complexidade Assintótica = n²

	public static int func3(int n) {
		for (int i = 2; i < n; i++) {         //n-1
			if (n % i == 0) {				  //n-2
				return 0;                     //1
			}
		}
		return 1;                            //1
	}										 //Complexidade local = 2n-1 Complexidade Assintótica = n

	public static int func4(int[][] A, int n, int m) {
		int s = 0;							 //1	
		int min = 1000000;					 //1
		
		for(int i = 0; i < n; i++) {        //n+1
			for(int j = 0; j < m; j++) {	 //n*(n+1)
				s += A[i][j];				 //n*n
			}
			if (s < min) {					//n
				min = s;					//n
			}								
		}		

		return min;						    //1
	}										//Complexidade local = 2n²+4n+4 Complexidade Assintótica = n²

	public static int func5(int[][] B, int n, int m) {
		int p = 1;						    //1
		int max = 0;						//1

		for(int j = 0; j < m; j++) {		//n+1
			for(int i = 0; i < n; i++) {	//n*(n+1)
				p *= B[i][j];				//n*n
			}								
			if (p > max) {					//n
				max = p;					//n
			}								
		}									

		return max;							//1
	}										//Complexidade local = 2n²+4n+4 Complexidade Assintótica = n²

	public static int func6(int[][] C, int n) {
		int s = 0;							//1

		for (int i = 0; i < n; i++) {		//n+1
			for (int j = i+1; j < n; j++) { //n*(n+1)
				s += C[i][j];				//n*n
			}
		}

		return s;							//1
	}										//Complexidade local = 2n²+2n+3 Complexidade Assintótica = n²
}
