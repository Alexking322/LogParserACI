package Javacourse;

public class Bubblesort {

	public static void main(String[] args) {
		
int arr[] = new int[(int) (Math.random() * 100)];
		
		for(int i = 0; i < arr.length; i++) {
		    //элементу массива присваивается случайное число от 0 до 99
		    arr[i] = (int)(Math.random() * 100);
		    System.out.print(arr[i] + "  ");
		}
		      System.out.print("\n");
		                bubbleSort(arr);
		                for(int i = 0; i <  arr.length; i++) {
		                	System.out.print(arr[i] + "  ");
		    }
	
		                
	}
	

}
