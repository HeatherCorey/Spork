package player;

import java.util.ArrayList;
import java.util.Scanner;

public class Consumable extends Item{

	private static Scanner s;
	protected String itemEffect;
	protected static ArrayList<Consumable> consumablesInInventory;
	
	public Consumable(String itemID, String itemType, String itemName, String itemEffect) {
		super(itemID, "Consumable", itemName);
		this.itemEffect = itemEffect;
	}
	
	public String getItemEffect()
	{
		return this.itemEffect;
	}
	
	public static void useConsumables()
	{
		s = new Scanner(System.in);
		System.out.println("Which item will you use?");
		
		ArrayList<Consumable> consumablesInInventory = new ArrayList<Consumable>();
	
		for (int i = 0; i < Player.inventory.size(); i++)
		{
			Item possibleConsumable = Player.inventory.get(i);
			
			if(possibleConsumable.getItemType() .equals("Consumable"))
			{
				consumablesInInventory.add((Consumable) possibleConsumable);
			}
		}
		
		for (int i = 0; i < consumablesInInventory.size(); i++)
		{
			Item consumableOption = consumablesInInventory.get(i);
			System.out.println((i + 1) + ". " + consumableOption.getItemName() + ": " + ((Consumable) consumableOption).getItemEffect());
		}
		s.nextInt();
	}

}
