public class ArraysDemo2 {
	
	public static void main (String[] args) {
		
		
		
	}
	
	public static void printArray(int[] array) {
		
		for( int e: array ) {	
			
			System.out.print( e + " " );
		}
		
		System.out.println();
	}
	
	public static int [ ] insert (int [ ] a, int n, int sInd) {
		
		if (isFull ( )) {
			
			System.out.println ("Array is full");
		}
		
		else {
			
			int x = 1;
			int y = -1;
			for (int i = a.length - 1; i > sInd; i--) {
				
				a [i] = a [i - 1];
			}
			
			a[sInd] = n;
		}
		
		return a;
	}
	
	static void bubble(int[] a)
	{
		// your code goes here - sort the array a using bubble sort
		
		int i = a.length;
		boolean elementSwapped = true;
		while (elementSwapped = true) {
			
			int j = 0;
			elementSwapped = false;
			while ( j<=i-1 ) {
				
				if (a [j] > a [j+1]) {
					
					int temp = a [j];
					a [ j ] = a [ j+1 ];
					a [ j + 1] = temp;
					elementSwapped = true;
					
				}
				
				j++;
				
			}
			
			i--;
			
		}
	}
}

