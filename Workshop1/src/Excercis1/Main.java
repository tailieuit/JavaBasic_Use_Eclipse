package Excercis1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter fan code: ");
		String code = sc.nextLine();
		System.out.print("Enter fan price: ");
		double price = sc.nextDouble();
		System.out.println("1. TC = 1 - test getCode()");
		System.out.println("2. TC = 1 - set setPrice()");
		System.out.print("Enter TC: ");
		int tc = sc.nextInt();
		Fan f = new Fan(code, price);
		if(tc == 1) {
			System.out.print("OUTPUT: " + f.getCode());
		}
		if(tc==2) {
			System.out.print("Enter new price: ");
			f.setPrice(sc.nextDouble());
			System.out.print("OUTPUT: " + f.getPrice());
		}
	}

}
