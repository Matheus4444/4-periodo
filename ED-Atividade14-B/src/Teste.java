public class Teste {
	
	public static void main(String[] args) {
		int n = 4;

		System.out.println(somatorio(n));
	}

	public static int somatorio(int n){
		if(n == 1){
			return 1;
		}else{
			return somatorio(n-1) + n;
		}
	}
}
