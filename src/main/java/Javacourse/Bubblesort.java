package Javacourse;

public class Bubblesort {

	public static void main(String[] args) {
		
int arr[] = new int[(int) (Math.random() * 100)];
		
		for(int i = 0; i < arr.length; i++) {
		    //�������� ������� ������������� ��������� ����� �� 0 �� 99
		    arr[i] = (int)(Math.random() * 100);
		    System.out.print(arr[i] + "  ");
		}
		      System.out.print("\n");
		                bubbleSort(arr);
		                for(int i = 0; i <  arr.length; i++) {
		                	System.out.print(arr[i] + "  ");
		    }
	
		                
	}



public static void  bubbleSort(int[] arr){
    
	/*������� ���� ������ ��� ��������� �������� �������, 
    ��� ��� ���������� ���� ������ ��� ������ � �����
    ��������� ������������ �������*/   
	
    for(int i = arr.length-1 ; i > 0 ; i--){
        for(int j = 0 ; j < i ; j++){
        	
        	/*���������� �������� �������, 
            ���� ��� ����� ������������ �������, 
            �� ������ �������*/
        	
            if( arr[j] > arr[j+1] ){
                int tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
               
                }	
                
            } 
}
}
}
