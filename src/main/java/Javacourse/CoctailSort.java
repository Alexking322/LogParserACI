package Javacourse;

public class CoctailSort {

	public static void main(String[] args) {
			int arr[] = new int[(int) (Math.random() * 100)];
			//������� ������� ������������� ��������� ����� �� 0 �� 99
			for(int i = 0; i < arr.length; i++) {
			    //�������� ������� ������������� ��������� ����� �� 0 �� 99
			    arr[i] = (int)(Math.random() * 100);
			    System.out.print(arr[i] + "  ");
			}
			      System.out.print("\n");
			                coctailSort(arr);
			                for(int i = 0; i <  arr.length; i++) {
			                	System.out.print(arr[i] + "  ");
			    }
			                
		}
	}

