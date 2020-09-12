package com.pkg;

import java.util.Arrays;
import java.util.Scanner;

public class Dummy {


	public static void main(String[]args)
	{
	  Scanner  in    = new Scanner(System.in);

    System.out.printf("Enter the row count: ");        
    String[] input = new String[in.nextInt()];
    in.nextLine(); //consuming the <enter> from input above

    for (int i = 0; i < input.length; i++) {
        input[i] = in.nextLine();
    }

    System.out.printf("\nYour input:\n");
    for (String s : input) {
        System.out.println(s);
	}
}
}
