package player;

public class Armor extends Item implements Equippable {
	
	private int armorDefense;
	private String equipmentSlot;

		public Armor(String itemID, String itemType, String itemName, int armorDefense, String equipmentSlot) {
			
			super(itemID, "Armor", itemName);
			this.armorDefense = armorDefense;
			this.equipmentSlot = equipmentSlot;
		}
	
		public String getEquipmentSlot() 
		{
			return this.equipmentSlot;
		}
		
		public int getArmorDefense()
		{
			return this.armorDefense;
		}		
	
		public String getUserFriendlyEquipmentSlot()
		{
			if (this.equipmentSlot .equals("weapon"))
			{
				return "Weapon";
			}
			else if (this.equipmentSlot .equals("armorHead"))
			{
				return "Head";
			}
			else if (this.equipmentSlot .equals("armorBody"))
			{
				return "Body";
			}
			else if (this.equipmentSlot .equals("armorLegs"))
			{
				return "Legs";
			}
			else if (this.equipmentSlot .equals("armorFeet"))
			{
				return "Feet";
			}
			else if (this.equipmentSlot .equals("ring1"))
			{
				return "Ring 1";
			}
			else if (this.equipmentSlot .equals("ring2"))
			{
				return "Ring 2";
			}
			else
			{
				return null;
			}
		}	
}
