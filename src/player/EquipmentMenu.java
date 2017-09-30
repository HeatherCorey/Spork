package player;

import java.util.ArrayList;
import java.util.Scanner;



public class EquipmentMenu {
	
	private static Scanner s;
	private static ArrayList<Equippable> equipmentSlotMatches;
	
	public EquipmentMenu()
	{
		s = new Scanner(System.in);
	}
	
	public static int startEquipmentMenu()
	{		
		System.out.println("\n Equip to: ");
		System.out.println("1. Hand 1 - Weapon or Shield"); 
		System.out.println("2. Hand 2 - Weapon or Shield");
		System.out.println("3. Head - Armor");
		System.out.println("4. Body - Armor");
		System.out.println("5. Legs - Armor");
		System.out.println("6. Feet - Armor");
		System.out.println("7. Ring 1 - Accessory");
		System.out.println("8. Ring 2 - Accessory");
		System.out.println("9. Exit Equip Menu");
		
		int selection = s.nextInt();
		
		while (selection < 1 || selection > 9)
		{
			System.out.println("Invalid selection. Please try again.");
			selection = s.nextInt();
		}
		return selection;
	}
		
	public void processInput(int selection)
	{
		if (selection == 1)    //Hand 1
		{				
			Equippable toEquip = getEquipmentOfMatchingSlot("weapon");
			if (toEquip != null)
			{
				Player.hand1 = toEquip;
				{
					if (((Weapon) toEquip).isTwoHanded() == true)
					{
						Player.hand2 = null;
					}
				}
				Player.equippedItems.add(toEquip);
				System.out.println(Player.getName() + " equipped the " + toEquip.getItemName() + ".");
			}
			return;
		}
		else if (selection == 2)   //Hand 2
		{
			Equippable toEquip = getEquipmentOfMatchingSlot("weapon");
			if (toEquip != null)
			{
				Player.hand2 = toEquip;
				Player.equippedItems.add(toEquip);
				System.out.println(Player.getName() + " equipped the " + toEquip.getItemName() + ".");
			}
			return;
		}
		else if (selection == 3)  //Head
		{
			Equippable toEquip = getEquipmentOfMatchingSlot("head");
			if (toEquip != null)
			{
				Player.armorHead = toEquip;
				Player.equippedItems.add(toEquip);
				System.out.println(Player.getName() + " equipped the " + toEquip.getItemName() + ".");
			}
			return;
		}
		else if (selection == 4) //Body
		{
			Equippable toEquip = getEquipmentOfMatchingSlot("body");
			if (toEquip != null)
			{
				Player.armorBody = toEquip;
				Player.equippedItems.add(toEquip);
				System.out.println(Player.getName() + " equipped the " + toEquip.getItemName() + ".");
			}
			return;
		}
		else if (selection == 5)  //Legs
		{
			Equippable toEquip = getEquipmentOfMatchingSlot("legs");
			if (toEquip != null)
			{
				Player.armorLegs = toEquip;
				Player.equippedItems.add(toEquip);
				System.out.println(Player.getName() + " equipped the " + toEquip.getItemName() + ".");
			}
			return;
		}
		else if (selection == 6)  //Feet
		{
			Equippable toEquip = getEquipmentOfMatchingSlot("feet");
			if (toEquip != null)
			{
				Player.armorFeet = toEquip;
				Player.equippedItems.add(toEquip);
				System.out.println(Player.getName() + " equipped the " + toEquip.getItemName() + ".");
			}
			return;
		}
		else if (selection == 7)  //Ring 1
		{
			Equippable toEquip = getEquipmentOfMatchingSlot("ring");
			if (toEquip != null)
			{
				Player.armorRing1 = toEquip;
				Player.equippedItems.add(toEquip);
				System.out.println(Player.getName() + " equipped the " + toEquip.getItemName() + ".");
			}
			return;
		}
		else if (selection == 8)  //Ring 2
		{
			Equippable toEquip = getEquipmentOfMatchingSlot("ring");
			if (toEquip != null)
			{
				Player.armorRing2 = toEquip;
				Player.equippedItems.add(toEquip);
				System.out.println(Player.getName() + " equipped the " + toEquip.getItemName() + ".");
			}
			return;
		}
		else
		{
			return;
		}
	}
	
	public static Equippable getEquipmentOfMatchingSlot(String slotToMatch)
	{
		equipmentSlotMatches = new ArrayList<Equippable>();
		for (int i = 0; i < Player.inventory.size(); i++)
		{
			Item scanItem = Player.inventory.get(i);
			
			if (scanItem.getItemType() .equals ("Weapon") || scanItem.getItemType() .equals ("Armor"))
			{
				Equippable possibleEquipmentMatch = (Equippable) scanItem;
			
				if (possibleEquipmentMatch.getEquipmentSlot() .contentEquals(slotToMatch))
				{
					equipmentSlotMatches.add(possibleEquipmentMatch);
				}			 
			}
		}
		if (equipmentSlotMatches.size() <= 0)
		{
			System.out.println("No inventory items are equippable in this slot.");
			return null;
		}
		else
		{
			System.out.println("Equip: ");
			
			for (int i = 0; i < equipmentSlotMatches.size(); i++)
			{
				System.out.println((i + 1) + ".) " + equipmentSlotMatches.get(i).getItemName());
			}
			int selection = s.nextInt();
			
			Equippable toEquip = (Equippable) equipmentSlotMatches.get(selection - 1);
			return toEquip;
		}
	}
	@SuppressWarnings("unused")
	public void main(String args[])
	{
		Environment startEnvironment = new Environment();
		MasterLists startMasterLists = new MasterLists();
		MasterLists.populateBestiary();
		MasterLists.populateMasterWeapons();
		Warrior player = new Warrior("Sam");
		
		int x = 0;
		EquipmentMenu em = new EquipmentMenu();
				
		x = EquipmentMenu.startEquipmentMenu();
		em.processInput(x);
	}
}
