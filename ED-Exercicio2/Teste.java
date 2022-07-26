import java.util.Scanner;
import java.io.File;
import java.util.LinkedList;

public class Teste {
	public static void main(String[] args) {
		listaAdjacencias();
		System.out.println("---------------------------------------------------------------------------------");
		matrizAdjacencia();
		System.out.println("---------------------------------------------------------------------------------");
		matrizIncidencia();
	}

	public static void listaAdjacencias(){
		Scanner leitor = new Scanner(System.in);
		try {
			leitor = new Scanner(new File("D:\\Coding\\Java\\4-periodo\\ED-Exercicio2\\Grafo.txt"));
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
	
	public static void matrizAdjacencia() {
		Scanner leitor = new Scanner(System.in);
		try {
			leitor = new Scanner( new File("D:\\Coding\\Java\\4-periodo\\ED-Exercicio2\\Grafo.txt"));
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
	}

	public static void matrizIncidencia() {
		Scanner leitor = new Scanner(System.in);
		try {
			leitor = new Scanner( new File("D:\\Coding\\Java\\4-periodo\\ED-Exercicio2\\Grafo.txt"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		String[] a = leitor.nextLine().split(" ");
		int n = Integer.parseInt(a[0]);
		int m = Integer.parseInt(a[1]);
		int[][] A = new int[n][m];
		
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
	}
}