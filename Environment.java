package player;

import java.util.ArrayList;
import java.util.Scanner;

public class Environment {
	
	private static Scanner s;
	
	protected static ArrayList<MapUnit> worldMap;
	protected static ArrayList<Enemy> battlefield;
	
	public Environment()
	{
		worldMap = new ArrayList<MapUnit>();
		battlefield = new ArrayList<Enemy>();
	}
	
	public static void startEnvironment()
	{
		Environment startEnvironment = new Environment();
		Map newMap = new Map();
		newMap.populateMap();
	}

	public static void spawnEnemy()
	{
		double numberOfEnemiesToSpawn = Math.random()*100;
		numberOfEnemiesToSpawn = ((int) Math.round(numberOfEnemiesToSpawn % 3));
		
		if(numberOfEnemiesToSpawn < 1)
		{
			numberOfEnemiesToSpawn++;
			
		}
		
		
		for (int i = 0; i < numberOfEnemiesToSpawn; i++)
		{
			int randomEnemySelector = (int) Math.round(Math.random()*1000);
			
			randomEnemySelector = randomEnemySelector % MasterLists.bestiary.size();
			
			Enemy randomEnemyFromList = MasterLists.bestiary.get(randomEnemySelector);
			
			Enemy enemyCopy = new Enemy(randomEnemyFromList);
			
			battlefield.add(enemyCopy);
			
			System.out.println(enemyCopy.getName() + " has appeared!");
		}

		int x = 0;
		BattleMenu bm = new BattleMenu();
		
		do
		{
			x = BattleMenu.startBattleMenu();
			bm.processInput(x);
		}
		while (Environment.battlefield.size() > 0);
		
		Map.getPlayerLocationDescription();
	}
	
	public static void spawnChest()
	{
		s = new Scanner(System.in);
		System.out.println("You found a treasure chest!");
		System.out.println("Open the chest?");
		System.out.println("1. Yes");
		System.out.println("2. No");
		
		int selection = s.nextInt();
		
		if (selection == 1)
		{
			System.out.println("You open the chest...");
			double treasureOrEnemy = Math.random();
			
			if (treasureOrEnemy < .20)
			{
				spawnEnemy();
			}
			else
			{
				awardGold();
				awardLoot();
			}
		}
		else 
			return;
	}
	
	public static void awardGold()
	{
		int awardGold = (int) Math.round(Math.random() * 100);
		Top.player.gold += awardGold;
		
		System.out.println("You received " + awardGold + " gold!");
	}
		
	public static void awardLoot()
	{		
		double awardWeaponChance = Math.random();
		if (awardWeaponChance < .50)
		{
			return;
		}
		else
		{
			int randomWeaponSelector = (int) Math.round(Math.random()*1000);
			randomWeaponSelector = randomWeaponSelector % MasterLists.masterWeapons.size();
			//TODO spawn higher level weapons if awardWeaponChance is high
			Weapon awardWeapon = MasterLists.masterWeapons.get(randomWeaponSelector);

			System.out.println("You received a " + awardWeapon.getItemName() + "!");
			Player.inventory.add(awardWeapon);
		}
	}
	
	public static void main(String args[])
	{
		//Environment startEnvironment = new Environment();
		//Environment environment = new Environment();
		//MasterLists.populateBestiary();
		//MasterLists.populateMasterWeapons();
		//Warrior miked = new Warrior("Mike Diamond");
		
/*		for (int i = 0; i < bestiary.size(); i++)
		{
			System.out.println(bestiary.get(i));
		}
*/
		//awardLoot();
		//awardLoot();
		//spawnChest();
		//spawnEnemy();
		//spawnEnemy();
		//spawnEnemy();
		//spawnChest();
		
		//for (int i = 0; i < battlefield.size(); i++)
	//	{
			//System.out.println(battlefield.get(i));
		//}
		
		
	}
}
