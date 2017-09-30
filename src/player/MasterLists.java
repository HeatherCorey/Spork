package player;

import java.util.ArrayList;

public class MasterLists {
	
	protected static ArrayList<Enemy> bestiary;
	protected static ArrayList<Weapon> masterWeapons;
	protected static ArrayList<Armor> masterArmor;
	protected static ArrayList<Consumable> masterConsumables;
	protected static ArrayList<Item> masterItems;
	
	public MasterLists()
	{
		bestiary = new ArrayList<Enemy>();
		masterWeapons = new ArrayList<Weapon>();
		masterArmor = new ArrayList<Armor>();
		masterConsumables = new ArrayList<Consumable>();
		masterItems = new ArrayList<Item>();
	}
	
	public static void startMasterLists()
	{
		MasterLists startMasterLists = new MasterLists();
		MasterLists.populateBestiary();
		MasterLists.populateMasterWeapons();
		MasterLists.populateMasterArmor();
		MasterLists.populateMasterConsumables();
		//MasterLists.populateMasterItems();
	}
	
	public static void populateBestiary()
	{
		Enemy E001 = new Enemy("E001", "All", "Rat", 15, 2, 2);
		bestiary.add(E001);
		
		Enemy E002 = new Enemy("E002", "All", "Goblin", 25, 3, 2);
		bestiary.add(E002);
		
		Enemy E003 = new Enemy("E003", "All", "Imp", 20, 2, 2);
		bestiary.add(E003);
		
		Enemy E004 = new Enemy("E004", "All", "Skeleton", 40, 3, 3);
		bestiary.add(E004);
		
		Enemy E005 = new Enemy("E005", "All", "Angry Butcher", 55, 4, 2);
		bestiary.add(E005);
		
		Enemy E006 = new Enemy("E006", "All", "Highway Robber", 60, 4, 3);
		bestiary.add(E006);
		
		Enemy E007 = new Enemy("E007", "All", "Impassioned Zealot", 65, 5, 2);
		bestiary.add(E007);
		
		Enemy E008 = new Enemy("E008", "All", "Rabid Bat", 20, 2, 2);
		bestiary.add(E008);
		
		Enemy E009 = new Enemy("E009", "All", "Rampaging Grizzly", 50, 5, 4);
		bestiary.add(E009);
		
		Enemy E010 = new Enemy("E010", "All", "Rabid Wolf", 35, 4, 2);
		bestiary.add(E010);		
	}
	
	public static void populateMasterWeapons()
	{
		Weapon W001 = new Weapon("W001", "Wooden Sword", 3, "None", "sword", false, false, 1, "weapon");
		masterWeapons.add(W001);
		
		Weapon W002 = new Weapon("W002", "Rusty Sword", 4, "None", "sword", false, false, 1, "weapon");
		masterWeapons.add(W002);
		
		Weapon W003 = new Weapon("W003", "Iron Sword", 5, "None", "sword", false, false, 1, "weapon");
		masterWeapons.add(W003);
		
		Weapon W004 = new Weapon("W004", "Wooden Sword", 5, "None", "sword", false, false, 1, "weapon");
		masterWeapons.add(W004);
		
		Weapon W005 = new Weapon("W005", "Wooden Sword", 5, "None", "sword", false, false, 1, "weapon");
		masterWeapons.add(W005);
		
		Weapon W006 = new Weapon("W006", "Wooden Sword", 5, "None", "sword", false, false, 1, "weapon");
		masterWeapons.add(W006);
		
		Weapon W007 = new Weapon("W007", "Wooden Sword", 5, "None", "sword", false, false, 1, "weapon");
		masterWeapons.add(W007);
		
		Weapon W008 = new Weapon("W008", "Wooden Sword", 5, "None", "sword", false, false, 1, "weapon");
		masterWeapons.add(W008);

		Weapon W009 = new Weapon("W009", "Wooden Sword", 5, "None", "sword", false, false, 1, "weapon");
		masterWeapons.add(W009);
		
		Weapon W010 = new Weapon("W010", "Wooden Sword", 5, "None", "sword", false, false, 1, "weapon");
		masterWeapons.add(W010);
	}
	
	public static void populateMasterArmor()
	{
		Armor H001 = new Armor("H001", "Armor", "Simple Hat", 2, "armorHead");
		masterArmor.add(H001);
		
		Armor H002 = new Armor("H002", "Armor", "Bronze Cap", 3, "armorHead");
		masterArmor.add(H002);
		
		Armor H003 = new Armor("H003", "Armor", "Iron Helmet", 4, "armorHead");
		masterArmor.add(H003);
		
		Armor B001 = new Armor("B001", "Armor", "Simple Tunic", 3, "armorBody");
		masterArmor.add(B001);
		
		Armor B002 = new Armor("B002", "Armor", "Bronze Armor", 4, "armorBody");
		masterArmor.add(B002);
		
		Armor B003 = new Armor("B003", "Armor", "Iron Armor", 5, "armorBody");
		masterArmor.add(B003);
		
		Armor L001 = new Armor("L001", "Armor", "Simple Leggings", 2, "armorLegs");
		masterArmor.add(L001);
		
		Armor L002 = new Armor("L002", "Armor", "Bronze Leggings", 3, "armorLegs");
		masterArmor.add(L002);
		
		Armor L003 = new Armor("L003", "Armor", "Iron Leggings", 4, "armorLegs");
		masterArmor.add(L003);
		
		Armor F001 = new Armor("F001", "Armor", "Simple Shoes", 2, "armorFeet");
		masterArmor.add(F001);
		
		Armor F002 = new Armor("F002", "Armor", "Bronze Boots", 3, "armorFeet");
		masterArmor.add(F002);
		
		Armor F003 = new Armor("F003", "Armor", "Iron Boots", 4, "armorFeet");
		masterArmor.add(F003);
	}
	
	public static void populateMasterConsumables()
	{
		Consumable C001 = new Consumable("C001", "Consumable", "Small Potion", "HP + 100");
		masterConsumables.add(C001);
	}
	
	public static void populateMasterItems()
	{
		Item itemToAdd;
		for (int i = 0; i < masterWeapons.size(); i++)
		{
			itemToAdd = masterWeapons.get(i);
			masterItems.add(itemToAdd);
		}
		for (int i = 0; i < masterArmor.size(); i++)
		{
			itemToAdd = masterWeapons.get(i);
			masterItems.add(itemToAdd);
		}
		for (int i = 0; i < masterConsumables.size(); i++)
		{
			itemToAdd = masterConsumables.get(i);
			masterItems.add(itemToAdd);
		}
	}
	
	public static void main(String args[])
	{
	
	}

}
