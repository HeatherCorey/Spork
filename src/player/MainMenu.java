package player;

import java.util.Scanner;

public class MainMenu {

	private static Scanner s;
	
	public MainMenu()
	{
		s = new Scanner(System.in);
	}
	
	public static int startMainMenu()
	{
		System.out.println("\n\n");
		System.out.println("\t\t\t\t\t\t\t\tWelcome to Spork: A Tribute to Zork!");
		System.out.println("\n\n");
		System.out.println("\t\t"
				+ "Spork was created in an attempt to capture a bit of the magic of a game originally written "
				+ "in MDL and eventually ported to \n\t\t"
				+ "such systems as the Commodore64 and AppleII. Spork was written using Java, an object-oriented "
				+ "programming language, and is\n\t\t"
				+ " still in early development. In choosing a classic text-based adventure game, the developer hopes"
				+ " to demonstrate creative\n\t\t"
				+ "\t useage of modern programming concepts, such as polymorphism, while retaining the nostalgia of yesteryear."
				+ "\n\n\n");
		System.out.println("\t\t\t\t\t\t\t\t   1. Begin Adventure\n");
		System.out.println("\t\t\t\t\t\t\t\t\t 2. About\n");
		System.out.println("\t\t\t\t\t\t\t\t\t 3. Exit\n");
		System.out.println("\t\t\t\t\t\t\t\tPlease select an option: ");
		
		int selection = s.nextInt();
		while (selection < 1 || selection > 3)
		{
			System.out.println("Invalid selection. Please try again.");
			selection = s.nextInt();
		}
		return selection;
	}
	
	public void processInput(int selection)
	{
		if (selection == 1)
		{
			createCharacter();
			return;
		}
		if(selection == 2)
		{			
			//TODO
			System.out.println("About: ");
			return;
		}
		if(selection == 3)
		{
			//TODO
			return;
		}
	}
	
	public void createCharacter()
	{
		System.out.println("Please enter the name of your adventurer: ");
		String nameChoice = s.next();
		
		System.out.println("Please choose " + nameChoice + "'s class: ");
		System.out.println("1. Warrior");
		System.out.println("Mage: Coming Soon!");
		System.out.println("Thief: Coming Soon!");
		
		int classChoice = s.nextInt();
		if (classChoice != 1)
		{
			System.out.println("Please choose a valid class.");
			classChoice = s.nextInt();
		}
		if (classChoice == 1)
		{
			Top.player = new Warrior(nameChoice);
			GameMenu.clearScreen();
			System.out.println(nameChoice + " was successfully created!");
		}
	}
	
	
	public static void main(String args[])
	{
		
	}
}
