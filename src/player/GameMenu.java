package player;

import java.util.Scanner;


public class GameMenu {
	
	private static Scanner s;
	
	public static void main(String[] args)
	{
		int x = 0;
		GameMenu gm = new GameMenu();
		
		do
		{
			x = GameMenu.startGameMenu();
			gm.processInput(x);
		}
		while (x != 8);
	}
		
		public GameMenu()
		{
			s = new Scanner(System.in);
		}
		
		public static int startGameMenu()
		{
			if(Player.getCurrentHP() > 0);
			{			
				Map.getPlayerLocationDescription();
				System.out.println("\n");
				System.out.println("1. Explore the current area");
				System.out.println("2. Move North, South, East, or West");
				System.out.println("3. Equip Weapons or Armor");
				System.out.println("4. Use Items - TODO");
				System.out.println("5. View Inventory");
				System.out.println("6. Display Equipment");
				System.out.println("7. View Player Information");
				System.out.println("8. Exit\n");
				System.out.println("Please select an option: ");
				
				int selection = s.nextInt();
				while (selection < 1 || selection > 8)
				{
					System.out.println("Invalid selection. Please try again.");
					selection = s.nextInt();
				}
				return selection;
			}
		}
	
	public void processInput(int selection)
	{
		GameMenu.clearScreen();
		if (selection == 1)
		{
			exploreArea();
		}
		if(selection == 2)
		{			
			movePlayerInquiry();
		}
		if(selection == 3)
		{
			Player.equipEquipment();
		}
		if(selection == 4)
		{
			Consumable.useConsumables();
		}
		if(selection == 5)
		{
			Top.player.displayInventory();
		}
		if(selection == 6)
		{
			Top.player.displayEquipped();
		}
		if(selection == 7)
		{
			System.out.println(Top.player);
		}
		if(selection == 8)
		{
			//TODO
		}
	}
	
	public void movePlayerInquiry()
	{
		System.out.println("Which direction would you like to move?");
		System.out.println("1. North");
		System.out.println("2. East");
		System.out.println("3. South");
		System.out.println("4. West");
		
		int selection = (s.nextInt() - 1);
		
		Top.player.movePlayer(selection);
		GameMenu.clearScreen();
	}
	
	public static void exploreArea()
	{
		double enemyChestOrNull = Math.random();
		
		if (enemyChestOrNull < .50)
		{
			Environment.spawnEnemy();
		}
		if (enemyChestOrNull > .80)
		{
			Environment.spawnChest();
		}
		else
		{
			System.out.println("There's nothing of interest here.");
			return;
		}
		
	}
	
	public static void clearScreen()
	{
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	}
}
