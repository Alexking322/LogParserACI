package Javacourse;

public class Bubblesort {

	public static void main(String[] args) {
		
int arr[] = new int[(int) (Math.random() * 100)];
		
		for(int i = 0; i < arr.length; i++) {
		    //Elementu massiva prisvaevaetsya sluchainoe chislo ot 0 do 99
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
    
	/*Vneshniy cicl kajdiy raz sokrashaetsya fragment massiva,
	  tak kak vnutreniy cicl kajdiy raz stavit v konec fragmen s max elementom massiva
	 */   
	
    for(int i = arr.length-1 ; i > 0 ; i--){
        for(int j = 0 ; j < i ; j++){
        	
        	/* Sravnivaet elementy poparno, esli oni imeut nepravil'niy poryadok, to menyaet mestami.
        	 */
        	
            if( arr[j] > arr[j+1] ){
                int tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
               
                }	
                
            } 
}
}
}
