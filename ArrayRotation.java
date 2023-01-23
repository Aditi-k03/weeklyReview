//Rotate an array 

public class ArrayRotation  
{  
	public static void rotateLeft(int array[], int d, int n)  //array of size n by d   
	{   
		for (int i = 0; i < d; i++)   
		rotateArrayByOne(array, n);   
	} 
	
	public static void rotateArrayByOne(int array[], int n)   
	{   
		int i, temp;    
		temp = array[0];   
		for (i = 0; i < n - 1; i++)
		{
			array[i] = array[i + 1];  
			array[i] = temp;   
		}   
	}
	
	public static void main(String args[])   
	{   
		int array[] = { 11, 22, 33, 44, 55, 66, 77 };    
		int r = 1;  
		int n = array.length;  
		
		System.out.println("Array before rotation:-");   
		for(int i = 0 ; i < n ; i++)  
		{  
			System.out.print(array[i]+ " ");   
		}  
		System.out.println();  
		rotateLeft(array, r, n);   
		
		System.out.println("\nArray after 1st rotation:-");   
		for(int i = 0 ; i < n ; i++)  
		{      
			System.out.print(array[i] + " "); 
		} 
		System.out.println();  
		rotateLeft(array, r, n); 

		System.out.println("\nArray after 2nd rotation:-");   
		for(int i = 0 ; i < n ; i++)  
		{      
			System.out.print(array[i] + " "); 
		} 
		System.out.println();  
		rotateLeft(array, r, n);
		
		System.out.println("\nArray after 3rd rotation:-");   
		for(int i = 0 ; i < n ; i++)  
		{      
			System.out.print(array[i] + " "); 
		} 
		System.out.println();  
		
	
	}   
}