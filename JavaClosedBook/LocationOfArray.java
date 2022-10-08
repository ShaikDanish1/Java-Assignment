package JavaClosedBook;
import java.util.Scanner;
public class LocationOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[]={3,4,2,5,6};
	        System.out.println("Enter the element to search for");
	        Scanner scan=new Scanner(System.in);
	        int search=scan.nextInt();
	        scan.close();
	        boolean check=true;
	        for(int idx=0;idx<5;idx++){
	            if(search==arr[idx]){
	                System.out.println("The searched number is located in "+idx);
	                check=false;
	            }
	        }
	        if(check){
	            System.out.println("The searched number is not located in this array");

	}

}
}
