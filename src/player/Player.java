package player;

import java.util.ArrayList;

/**
 * A class intended to represent the basis for the player character.
 * Intended to be inherited by the subclasses "Warrior", "Thief", "Mage" etc.
 * @author Heather
 *
 */
public class Player extends Combatant implements CombatBehavior{
	
	protected static String name;
	protected int level;
	protected int currentXP;
	protected int gold;
	protected int maxHP;
	protected static int currentHP;
	protected int maxMana;
	protected int currentMana;
	protected int strength;
	protected int defense;
	protected int intelligence;
	protected int speed;
	protected static int x;
	protected static int y;
	protected static String playerCurrentLocation;
	
	protected static Equippable hand1;
	protected static Equippable hand2;
	protected static Equippable armorHead;
	protected static Equippable armorBody;
	protected static Equippable armorLegs;
	protected static Equippable armorFeet;
	protected static Equippable armorRing1;
	protected static Equippable armorRing2;
	
	protected static ArrayList<Item> inventory;
	protected static ArrayList<Equippable> equippedItems;
	
	public Player(String name, int maxHP, int maxMana, int strength, int defense,
				  int intelligence, int speed)
	{		
		Player.name = name;
		this.level = 1;
		this.currentXP = 0;
		this.gold = 100;
		this.maxHP = maxHP;
		Player.currentHP = maxHP;
		this.maxMana = maxMana;
		this.currentMana = maxMana;
		this.strength = strength;
		this.defense = defense;
		this.intelligence = intelligence;
		this.speed = speed;
		Player.x = 5;
		Player.y = 5;
		inventory = new ArrayList<Item>();
		equippedItems = new ArrayList<Equippable>();
	}
		
	/**
	 * Displays relevant stats of the player character.
	 */
	public String toString()
	{
		return "\n\tName:  " + Player.getName() + 
				"\n\nGold: " + this.gold + "\tCoordinates:  " + getX() + " , " + getY() +
				"\nHP: " + getCurrentHP() + "/" + this.maxHP + "\tMP: " + currentMana + "/" + maxMana + "\n" +
				"STR: " + this.strength + "\t\tDEF: " + this.defense + 
				"\nSPD: " + this.speed + "\t\tINT: " + this.intelligence + "\n";
	}
	
	public void displayEquipped()
	{
		for (int i = 0; i < equippedItems.size(); i++)
		{
			String equippedName = Player.equippedItems.get(i).getItemName();
			Equippable equippedSlot = equippedItems.get(i);
			String equippedSlotName = equippedSlot.getUserFriendlyEquipmentSlot();
			
			System.out.println(equippedSlotName + ": " + equippedName);
		}
	}
	
	/**
	 * Prints inventory, one item per line.
	 */
	public void displayInventory()
	{
		for (int i = 0; i < inventory.size(); i++)
		{
			String nameOfItem = inventory.get(i).getItemName();
			String typeOfItem = inventory.get(i).getItemType();
			System.out.println((i + 1) + ". " + nameOfItem + ": " + typeOfItem);
		}
		
		
	}
	/**
	 * Getters for player stats.
	 */
	public static String getName() {
		return name;
	}

	public int getLevel()
	{
		return this.level;
	}
	
	public int getMaxHP() {
		return this.maxHP;
	}

	public static int getCurrentHP() {
		return Player.currentHP;
	}

	public int getMaxMana() {
		return this.maxMana;
	}

	public int getCurrentMana() {
		return this.currentMana;
	}

	public int getStrength() {
		return this.strength;
	}

	public int getDefense() {
		return this.defense;
	}

	public int getIntelligence() {
		return this.intelligence;
	}

	public int getSpeed() {
		return this.speed;
	}

	public int getX() {
		return Player.x;
	}

	public int getY() {
		return Player.y;
	}
	
	public static String getPlayerCurrentLocation(){
		return x + "," + y;
	}
	
	/**
	 * Getters for Equipment
	 */
	public Equippable getHand1() {
		return hand1;
	}

	public Equippable getHand2() {
		return hand2;
	}

	public Equippable getArmorHead() {
		return armorHead;
	}

	public Equippable getArmorBody() {
		return armorBody;
	}

	public Equippable getArmorLegs() {
		return armorLegs;
	}

	public Equippable getArmorFeet() {
		return armorFeet;
	}

	public Equippable getArmorRing1() {
		return armorRing1;
	}

	public Equippable getArmorRing2() {
		return armorRing2;
	}
	
	/**
	 * Checks for Player Death (Game Over condition)
	 * @return true if player's currenHP is 0.
	 */
	public boolean playerDeath()
	{
		if (this.currentHP <= 0)
		{
			System.out.println("You were defeated!");
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void equipEquipment()
	{
		int x = 0;
		EquipmentMenu em = new EquipmentMenu();
		
		x = EquipmentMenu.startEquipmentMenu();
		em.processInput(x);
	}
	
	public static void chooseAction()
	{
		int x = 0;
		GameMenu gm = new GameMenu();
		
		x = GameMenu.startGameMenu();
		gm.processInput(x);
	}
	
	public int getCurrentXP() {
		return currentXP;
	}

	public int getGold() {
		return gold;
	}

	

	/**
	 * A method intended to move the player, as long as the move is permitted.
	 * @param direction - 0 == North, 1 == East, 2 == South, 3 == West
	 * @return true if character moved successfully.
	 */
	public boolean movePlayer(int direction)
	{
		if (direction == 0 && Player.y < Map.getMaxMapSize() - 1)
		{
			y += 1;
			return true;
		}
		else if (direction == 1 && Player.x < Map.getMaxMapSize() - 1)
		{
			x += 1;
			return true;
		}
		else if (direction == 2 && Player.y > 0)
		{
			y -= 1;
			return true;
		}
		else if (direction == 3 && Player.x > 0)
		{
			x -= 1;
			return true;
		}
		else
		{
			System.out.println("You cannot go that way. Please try again.");
			return false;
		}
	}
	
	public void executeAttack(Combatant opponent)
	{		
		String chanceOfSuccess = this.chanceOfSuccess();
		GameMenu.clearScreen();
		
		if (chanceOfSuccess .contentEquals("Miss"))
		{
			System.out.println(getName()+ "'s attack misses the " + ((Enemy) opponent).getName() + "!");
		}
		else if (chanceOfSuccess .contentEquals("Hit"))
		{
			int damageDealt = this.calculateAttackDamage(opponent);
			
			((Enemy) opponent).currentHP -= damageDealt;
			
			System.out.println(Player.getName()+ "'s attack hits the " + ((Enemy)opponent).getName() + " for " + damageDealt + " point of damage!\n");
		}
		else if (chanceOfSuccess .contentEquals("Critical"))
		{
			int damageDealt = this.calculateAttackDamage(opponent);
			int criticalBonusDamage = (int) Math.round(damageDealt * .10);
			damageDealt += criticalBonusDamage;
			((Enemy) opponent).currentHP -= damageDealt;
			
			
			System.out.println("Critical Hit! " + Player.getName()+ "'s attack does " + damageDealt + " points of damage on the "
							   + ((Enemy)opponent).getName() + "!\n");			
		}
		if(deathCheck(opponent))
		{
			return;
		}
		else
		{
			for (int i = 0; i < Environment.battlefield.size(); i++)
			{
				Enemy enemyAttacking = Environment.battlefield.get(i);
				enemyAttacking.executeAttack(this);
			}

		}
	}
	
	public void executeGuard()
	{
		GameMenu.clearScreen();
		System.out.println(Player.getName() + " is guarding against attack!");
		this.defense *= 2;
		
		for (int i = 0; i < Environment.battlefield.size(); i++)
		{
			Combatant enemyAttacking = Environment.battlefield.get(i);
			((Enemy) enemyAttacking).executeAttack(this);
		}
		
		this.defense /= 2;
	}
	
	public void executeSteal(Combatant opponent)
	{
		GameMenu.clearScreen();
		double chanceToSteal = Math.random();
		
		if (chanceToSteal < .50)
		{
			int stolenGold = (int) Math.round(Math.random() * 100);
			Top.player.gold += stolenGold;
			System.out.println(Player.getName() + " steals " + stolenGold + "gold from the " + opponent + "!");
			return;
		}
		else
		{
			System.out.println(Player.getName() + " fails to steal from the " + opponent + ".");
			return;
		}
	}
	
	public boolean executeFlee()
	{
		GameMenu.clearScreen();
		//TODO
		return true;
	}
	
	public int calculateAttackDamage(Combatant opponent)
	{
//		TODO  add Equipment Damage by adding up getWeaponDamage in EquippedEquipment
		int weaponDamage = ((Weapon) hand1).getWeaponDamage();
		
		int totalDamage = this.strength + weaponDamage;
		
		int damageDealt = totalDamage - ((Enemy)opponent).defense;
		
		if (damageDealt < 0)
		{
			damageDealt = 0;
		}
		
		return damageDealt;
	}
	
	public String chanceOfSuccess()
	{
		double chanceOfSuccess = Math.random();
		
		if (chanceOfSuccess <= 0.20)
		{
			return "Miss";
		}
		else if (chanceOfSuccess >= .90)
		{
			return "Critical";
		}
		else
		{
			return "Hit";
		}		
	}
	
	public boolean deathCheck(Combatant opponent)
	{
		if (((Enemy)opponent).getCurrentHP() <= 0)
		{	
			GameMenu.clearScreen();
			System.out.println(Player.getName() + " defeated the " + ((Enemy)opponent).getName() + "!");
			
			this.rewardXP(opponent);
			Environment.awardGold();
			
			
			Environment.battlefield.remove(opponent);
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void rewardXP(Combatant opponent)
	{
		//TODO
	}
	
	
	public static void main(String args[])
	{
		
	}
}
