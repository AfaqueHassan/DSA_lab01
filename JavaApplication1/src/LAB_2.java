
import java.util.Scanner;


public class LAB_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//int arr[]=new int[3];
//for(int i=0; i<arr.length; i++){
//    System.out.println("Enter Array Elements At Index="+i+"-> ");
//    arr[i]=sc.nextInt();
//}
//        System.out.println("Enter Number That you want to Search ");
//int item =sc.nextInt();
//boolean bool=false;
//for(int j=0; j<arr.length+2; j++){
//  if(item==arr[j]){
//      bool=true;
//      break;
//      
//  }
//  else{
//      bool=false;
//     
//      System.out.println("You Entered invalid Element For Search "+item);
//      break;
//  }
//
//
//}
//int a=10;
//int b=20;
//int tempo;
//tempo=a;
//a=b;
//b=tempo;
//
//        System.out.println(tempo);

   
        int[] arr = {8, 3, 1, 5, 2};
        int ptr = arr.length;

       
        for (int k = 0; k <ptr- 1; k++) {
            int i = 0;

           
            while (i < ptr - 1 - k) {
        
                if (arr[i] > arr[i + 1]) {
                    
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
                i++;
            }
        }
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}


    

