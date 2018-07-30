import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class NumSort {

public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	int i;
	
	int numList[] = new int[10];
	System.out.println("This program will ask you to input ten numbers of your choosing and sort them.");
	for (i=0; i < 10; i++) {
		numList[i] = scan.nextInt();
		}
	System.out.println("Numbers before sorting");
	System.out.println(Arrays.toString(numList));
	System.out.println("--------------------------------------------------");
	bubbleSortDesc(numList);
	System.out.println("Numbers after sorting");
	System.out.println(Arrays.toString(numList));
	  
	}

static void bubbleSortDesc(int[] numListArray) {
	int n = numListArray.length;
	int temp;
	for (int x=0; x < n; x++) {
		for(int y = 1; y < (n- x); y++) {
			if(numListArray[y-1] < numListArray[y]) {
				temp = numListArray[y -1];
				numListArray[y-1]= numListArray[y];
				numListArray[y]= temp;
			}
		}
	}
}
}