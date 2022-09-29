public class Teste {
	public static void main(String[] args) {
		int[] L = {63, 33, 94, 47, 82, 80, 53, 61};
		heapSort(L);
	}

	public static void heapSort(int[] array) {
		for (int i = (array.length - 2) / 2; i >= 0; i--)
			 heapify( array , i , array.length - 1 );
   
		for (int i = array.length - 1; i > 0; i--) {
			 swapKeys( array , 0 , i );
			 heapify(array , 0 , i - 1 );
		}
   }
   private static void heapify(int[] array, int i, int m) {
		int j;
		while ( 2 * i + 1 <= m ) {
			 j = 2 * i + 1;
			 if ( j < m ) {
				  if ( array[ j ] < array[ j + 1 ] )
					   j++;
			 }
			 if (array[ i ] < array[ j ]) {
				  swapKeys( array , i , j );
				  i = j;
			 } else
				  i = m;
		}
   }
   
   public static void swapKeys(int[] array, int i, int j) {
		int temp;
		temp = array[ i ];
		array[ i ] = array[ j ];
		array[ j ] = temp;
   } 
}