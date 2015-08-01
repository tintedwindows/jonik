package com.java.game;

import java.util.*;

public class MainGameClass {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Scanner name = new Scanner(System.in);
		Scanner age = new Scanner(System.in);
		String ForrestAnswer = new String ();
							
		System.out.println("");
		System.out.println(".");
		System.out.println("Thank you or playing! Press ENTER to continue!");
		System.out.println("are you a boy or a girl?\n\nOptions: \n1:Boy\n2:Girl");
		
		int a = s.nextInt();
		
		switch (a) {
		case 1:
			System.out.println("So you are a boy? Well what is your name boy?");
			break;
		case 2:
			System.out.println("So you are a girl? Well what is your name girl?");
			break;
			
		}
		
		System.out.println(name.nextLine());
		
		System.out.println("Cool how old are you?");
		
		System.out.println(age.nextLine());
		
		System.out.println("Well, are you ready for an adventure?\n\nOptions\n1:Yes\n2:No");
		
		System.out.println("Where do you want to go?\n\n1:Home\n2:The Town\n3:Exit the game");
		
		
		int b = s.nextInt();
		
		switch(b) {
		case 1:
			System.out.println("Now you are Home.");
			System.exit (b);
			break;
		case 2:
			System.out.println("What do you want to visit first in the town?");
			break;
		case 3:
			System.exit (b);
			break;
			
		}
			
		}
	}
