package player;

import java.util.ArrayList;

public class Top 
{

	protected static Player player;

	public static void main(String args[])
	{		
		int y = 0;
		MainMenu mm = new MainMenu();
		
		do
		{
			y = MainMenu.startMainMenu();
			mm.processInput(y);
		}
		while(y < 1 || y > 3);
		
			
		Environment.startEnvironment();
		MasterLists.startMasterLists();
		Player.inventory = new ArrayList<Item>();
		Warrior.startingInventory();
		
		int x = 0;
		GameMenu gm = new GameMenu();
		
		do
		{
			x = GameMenu.startGameMenu();
			gm.processInput(x);
		}
		while (x != 8 && Player.getCurrentHP() > 0);
	}
}



/*	player.displayInventory();
	player.displayEquipped();
	//Environment.spawnEnemy();
	//Player.equipEquipment();
	//player.displayEquipped();
	
	//Top.player.movePlayer(1);
	//System.out.println(player.getX());
	
	//Environment.spawnEnemy();	

	Top.player.movePlayer(0);
	Top.player.movePlayer(2);
	Top.player.movePlayer(1);
	Top.player.movePlayer(3);
		
	Environment.spawnEnemy();
	for(int i = 0; i < Map.worldMap.size(); i++)
	{
		System.out.println(Map.worldMap.get(i));
	}
*/	