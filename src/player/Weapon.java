package player;

public class Weapon extends Item implements Equippable {
		
	protected int weaponDamage;
	protected String specialProperty;
	protected String weaponType;
	protected boolean twoHanded;
	protected boolean heavyEquipment;
	protected String equipmentSlot;

		public Weapon(String itemID, String itemName, int weaponDamage, String specialProperty, String weaponType, boolean twoHanded, boolean heavyEquipment, int itemLevel, String equipmentSlot)
		{
			super(itemID, "Weapon", itemName);
			this.weaponDamage = weaponDamage;
			this.specialProperty = specialProperty;
			this.weaponType = weaponType;
			this.twoHanded = twoHanded;
			this.heavyEquipment = heavyEquipment;
			this.equipmentSlot = equipmentSlot;
		}
		
		public String getItemID(){
			return this.itemID;
		}
		public int getWeaponDamage() {
			return weaponDamage;
		}

		public String getSpecialProperty() {
			return specialProperty;
		}

		public String getWeaponType() {
			return weaponType;
		}

		public boolean isTwoHanded() {
			return twoHanded;
		}

		public boolean isHeavyEquipment() {
			return heavyEquipment;
		}

		public String getEquipmentSlot() {
			return equipmentSlot;
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
