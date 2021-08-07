import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Number of Elements in Array:\t");
		int size = input.nextInt();
		
		int[] array = new int[size];
		System.out.print("Enter your Elements\n");
		for(int i=0;i<size;i++)
		array[i] = input.nextInt();
		
		int min = array[0];
		for(int i=0;i<size;i++)
		{
		    if (array[i] < min)
		    min = array[i];
		}
		
		System.out.print("Minimum element in the array is:"+min);
		
	}
}
