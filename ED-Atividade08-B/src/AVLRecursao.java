import java.util.Scanner;

public class AVLRecursao {
	public static void main(String[] args) {
		int h;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Insira H: ");
		h = scanner.nextInt();
		System.out.println(valorMinimoNos(h));
	}

	public static int valorMinimoNos(int h) {
		if (h > 1) {
			return 1 + valorMinimoNos(h-1) + valorMinimoNos(h-2);
		}else if (h == 1) {
			return 1;
		}else{
			return 0;
		}
	}
}
