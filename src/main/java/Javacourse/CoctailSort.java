package Javacourse;

public class CoctailSort {

	public static void main(String[] args) {
			int arr[] = new int[(int) (Math.random() * 100)];
			//Razmeru massiva prisvaivaetsya sluchainoynoe chislo ot 0 do 99
			
			for(int i = 0; i < arr.length; i++) {
			    //Elementu massiva prisvaivaetsya sluchainoynoe chislo ot 0 do 99
			    arr[i] = (int)(Math.random() * 100);
			    System.out.print(arr[i] + "  ");
			}
			      System.out.print("\n");
			                coctailSort(arr);
			                for(int i = 0; i <  arr.length; i++) {
			                	System.out.print(arr[i] + "  ");
			    }
			                
	}
	

public static void coctailSort(int[] arr){
    int left = 0; // levaya granica
    int right = arr.length - 1; // pravaya

    do
    {
        //Sdvigaem k koncu massiva "tyajelie elementi"
        for (int i = left; i < right; i++)
        {
            if(arr[i] > arr[i+1])
            {
                arr[i] ^= arr[i+1];
                arr[i+1] ^= arr[i];
                arr[i] ^= arr[i+1];
            }
        }
        right--; //ymen'shaem pravuu granicu 
        //Sdvigaem k nachalu massiva "legkie elementiy"
        for (int i = right; i > left ; i--)
        {
            if(arr[i] < arr[i-1])
            {
                arr[i] ^= arr[i-1];
                arr[i-1] ^= arr[i];
                arr[i] ^= arr[i-1];
            }
        }
        left++; //Yvelichivaem levuu granicu 
    } while (left <= right);

  
}
}

