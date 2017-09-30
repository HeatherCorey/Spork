package player;

import java.util.Scanner;


public class BattleMenu {
	
	private static Scanner s;
			
		public BattleMenu()
		{
			s = new Scanner(System.in);
		}
		
		public static int startBattleMenu()
		{
			System.out.println("\n Select Option: ");
			System.out.println("1. Attack Enemy"); 
			System.out.println("2. Guard");
			System.out.println("3. Steal - TODO");   //TODO
			System.out.println("4. Flee - TODO");    //TODO
			System.out.println("5. Use Item - TODO");  //TODO
			System.out.println("6. View Player Vitals");
			
			int selection = s.nextInt();
			while (selection < 1 || selection > 6)
			{
				System.out.println("Invalid selection. Please try again.");
				selection = s.nextInt();
			}
			return selection;
		}
		public void processInput(int selection)
		{
			if (selection == 1)    //Attack Enemy
			{				
				int selectedEnemy = selectEnemy("Attack");
				executeAttack(selectedEnemy);
				
			}
			if (selection == 2)   //Guard
			{
				Top.player.executeGuard();
			}
			if (selection == 3)  //Steal
			{
				selectEnemy("Steal from");
			}
			if (selection == 4) //Flee
			{
				//TODO
			}
			if (selection == 5)  //Use Item
			{
				//TODO
			}
			if (selection == 6)  //display Player Vitals
			{
				System.out.println(Top.player);
			}
			else
			{
				return;
			}
			
		}
	
		public static int selectEnemy(String playerAction)
		{
			int selection = 0;
			if(Environment.battlefield.size() > 1)
			{
				GameMenu.clearScreen();
				System.out.println(playerAction + " which enemy? \n");
			
				for (int i = 0; i < Environment.battlefield.size(); i++)
				{
					Enemy listEnemy = Environment.battlefield.get(i);
					System.out.println((i + 1) + "). " + listEnemy.getName()); 
				}
				selection = s.nextInt();
				while (selection < 1 || selection > Environment.battlefield.size())
				{
					System.out.println("Invalid selection. Please try again.");
					selection = s.nextInt();
				}
				selection -= 1;
			}
			return selection;
		}
		
		public void executeAttack(int selection)
		{
			Enemy selectedEnemy = Environment.battlefield.get(selection);
			Top.player.executeAttack(selectedEnemy);
		}
		
		public void executeSteal(int selection)
		{
			Enemy selectedEnemy = Environment.battlefield.get(selection);
			Top.player.executeSteal(selectedEnemy);
		}
		
		public static void main(String[] args)
		{
			int x = 0;
			BattleMenu bm = new BattleMenu();
			
			do
			{
				x = BattleMenu.startBattleMenu();
				bm.processInput(x);
			}
			while (Environment.battlefield.size() > 0);
		}
}
