package player;

//import java.util.ArrayList;

public class Warrior extends Player{
	
	public Warrior(String name)
	{
		super(name, 100, 0, 7, 2, 2, 2);
		
		//Player.inventory = new ArrayList<Item>();
		//Weapon startingWeapon = MasterLists.masterWeapons.get(0);
		//Player.inventory.add(startingWeapon);
		//Player.hand1 = startingWeapon;
		
	}
	
	public static void startingInventory()
	{
		Weapon startingWeapon = MasterLists.masterWeapons.get(0);
		Player.inventory.add(startingWeapon);
		Player.equippedItems.add(startingWeapon);
		Player.hand1 = startingWeapon;
		//Consumable startingPotion = MasterLists.masterConsumables.get(0);
		//Player.inventory.add(startingPotion);
		
		for(int i = 0; i < Player.inventory.size(); i++)
		{
			System.out.println(Player.inventory.get(i).getItemName());
		}
	}
/*
	@SuppressWarnings("unused")
	public static void main(String args[])
	{
		Environment newEnvironment = new Environment();
		MasterLists.populateMasterWeapons();
		MasterLists.populateBestiary();
		Warrior a = new Warrior("Sam");
		a.getDefense();
		//a.displayInventory();
		//Player.hand1 = (Equippable) Player.inventory.get(0);
		//a.displayInventory();
		a.displayEquipped();
		//System.out.println(Player.getHand1().getName());
		
		Environment.spawnEnemy();
		
	}*/
}
