import java.util.Scanner;
import java.io.File;
import java.util.LinkedList;

public class Teste {
	public static void main(String[] args) {
		listaAdjacencias();
		System.out.println("---------------------------------------------------------------------------------");
		int[][] A = matrizAdjacencia();
		System.out.println("---------------------------------------------------------------------------------");
		int[][] M = matrizIncidencia();
		System.out.println("---------------------------------------------------------------------------------");
		possuiLaco(A);
		System.out.println("---------------------------------------------------------------------------------");
		contaGraus(M);
	}

	public static void listaAdjacencias(){
		Scanner leitor = new Scanner(System.in);
		try {
			leitor = new Scanner(new File("C:\\coding\\college\\java\\4 periodo\\ED-Exercicio2\\Grafo.txt"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		String[] a = leitor.nextLine().split(" ");
		int n = Integer.parseInt(a[0]);

		LinkedList<Integer>[] listaAdjacencias = new LinkedList[n];
		for (int i = 0; i < n; i++) {
			listaAdjacencias[i] = new LinkedList<Integer>();
		}

		while (leitor.hasNextLine()) {
			String[] aresta = leitor.nextLine().split(" ");
			int v1 = Integer.parseInt(aresta[0])-1;
			int v2 = Integer.parseInt(aresta[1])-1;
			
			listaAdjacencias[v1].add(v2+1);
			listaAdjacencias[v2].add(v1+1);
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < listaAdjacencias[i].size(); j++){
				System.out.print(listaAdjacencias[i].get(j));
			}
			System.out.println("");
		}
		try {
			leitor.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static int[][] matrizAdjacencia() {
		Scanner leitor = new Scanner(System.in);
		try {
			leitor = new Scanner( new File("C:\\coding\\college\\java\\4 periodo\\ED-Exercicio2\\Grafo.txt"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		String[] a = leitor.nextLine().split(" ");
		int n = Integer.parseInt(a[0]);
		int[][] A = new int[n][n];
		
		while (leitor.hasNextLine()) {
			String[] aresta = leitor.nextLine().split(" ");
			int v1 = Integer.parseInt(aresta[0])-1;
			int v2 = Integer.parseInt(aresta[1])-1;
			
			A[v1][v2] = 1;
			A[v2][v1] = 1;
		}
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println("");
		}

		try {
			leitor.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return A;
	}

	public static int[][] matrizIncidencia() {
		Scanner leitor = new Scanner(System.in);
		try {
			leitor = new Scanner( new File("C:\\coding\\college\\java\\4 periodo\\ED-Exercicio2\\Grafo.txt"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		String[] a = leitor.nextLine().split(" ");
		int n = Integer.parseInt(a[0]);
		int m = Integer.parseInt(a[1]);
		int[][] A = new int[n][m];
		int l = 0;
		
		while (leitor.hasNextLine()) {
			String[] aresta = leitor.nextLine().split(" ");
			int v1 = Integer.parseInt(aresta[0])-1;
			int v2 = Integer.parseInt(aresta[1])-1;
			
			A[v1][l] = 1;
			A[v2][l] = 1;
			l++;
		}
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println("");
		}

		try {
			leitor.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return A;
	}

	public static void possuiLaco(int[][] A) {
		boolean laco = false;
		for (int i = 0; i < A.length; i++) {
			if (A[i][i] == 0) {
				laco = false;
			}else{
				laco = true;
				break;
			}
		}
		if (laco) {
			System.out.println("O grafo possui laço.");
		}else{
			System.out.println("O grafo não possui laço.");
		}
	}

	public static void contaGraus(int[][] M) {
		int[] vetorGraus = new int[M.length];
		
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[0].length; j++) {
				if (M[i][j] == 1){
					vetorGraus[i]++;
				}
			}
		}
		for (int i = 0; i < vetorGraus.length; i++) {
			System.out.println(i+1 + " = " + vetorGraus[i]);
		}
	}
}