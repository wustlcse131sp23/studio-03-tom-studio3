package studio3;

import java.lang.reflect.Array;
import java.util.Scanner;

public class SieveOfEratosthenes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("The largest number in the array is: ");
		int maximum = input.nextInt();
		boolean[] PrimeNumbers = new boolean[maximum + 1];
		for (int i = 0; i < PrimeNumbers.length; i++)
		{
			PrimeNumbers[i] = true;
		}
		for (int i = 2; i < (PrimeNumbers.length / 2); i++) {

			for (int y = i * 2; y < PrimeNumbers.length; y += i) {
				PrimeNumbers[y] = false;
			}
		}

		for (int i = 2; i < PrimeNumbers.length; i++)

		{
			if (PrimeNumbers[i] == true) {
				System.out.println(i);
			}
		}

		// TODO Auto-generated method stub

	}

}
