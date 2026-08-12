import java.util.Scanner;
 
public class ArrayStats {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 	int[] numbers = new int[5];
  
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
    	}
 
        int largest = numbers[0];
        int smallest = numbers[0];
        int sum = 0;

         for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            if (numbers[i] > largest) largest = numbers[i];
            if (numbers[i] < smallest) {smallest = numbers[i];}
    	}
 
        double average = sum / (double) numbers.length;
 
        System.out.println("Largest  : " + largest);
        System.out.println("Smallest : " + smallest);
        System.out.println("Sum  	: " + sum);
        System.out.println("Average  : " + average);
 
        sc.close();
	}
}
