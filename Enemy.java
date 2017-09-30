package player;

/**
 * A class intended to represent the enemies with whom the player character
 * will engage in combat.
 * @author Heather
 *
 */
public class Enemy extends Combatant implements CombatBehavior{

	protected String enemyID;
	protected String enemyTerrain;
	protected String name;
	protected int level;
	protected int maxHP;
	protected int currentHP;
	protected int strength;
	protected int defense;
	
	public Enemy(String enemyID, String enemyTerrain, String name, int maxHP, int strength, int defense)
	{
		this.enemyID = enemyID;
		this.enemyTerrain = enemyTerrain;
		this.name = name;
		this.level = 1;
		this.maxHP = maxHP;
		this.currentHP = maxHP;
		this.strength = strength;
		this.defense = defense;
	}
	
	public Enemy(Enemy referenceEnemy)
	{
		this.enemyID = referenceEnemy.enemyID;
		this.enemyTerrain = referenceEnemy.enemyTerrain;
		this.name = referenceEnemy.name;
		this.level = referenceEnemy.level;
		this.maxHP = referenceEnemy.maxHP;
		this.currentHP = referenceEnemy.maxHP;
		this.strength = referenceEnemy.strength;
		this.defense = referenceEnemy.defense;
	}
	
	public String toString()
	{
		return this.getName();
	}
	
	public String getEnemyStats()
	{
		return "\nName:  " + this.getName() + "\t HP: " + this.getCurrentHP() + "/" + this.maxHP + "\n" +
				"STR: " + this.strength + "\t DEF: " + this.defense + "\n";
	}
	
	/**
	 * Getters are found below.
	 */
	
	public String getEnemyID()
	{
		return this.enemyID;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getMaxHP() 
	{
		return this.maxHP;
	}
	public int getCurrentHP() 
	{
		return this.currentHP;
	}
	public int getStrength() 
	{
		return this.strength;
	}
	public int getDefense() 
	{
		return this.defense;
	}

	public int calculateAttackDamage (Combatant opponent)
	{
		int damageDealt = this.strength - (((Player)opponent).defense / 2);
		
		if (damageDealt < 0)
		{
			damageDealt = 0;
		}
		
		return damageDealt;
	}

	public void executeAttack(Combatant opponent) {
		double chanceOfSuccess = Math.random();
		
		if (chanceOfSuccess <= 0.20)
		{
			System.out.println("The " + this.getName()+ "'s attack misses " + Player.getName() + "!");
		}
		else if (chanceOfSuccess > .20 && chanceOfSuccess < .90)
		{
			int damageDealt = this.calculateAttackDamage(opponent);
			((Player)opponent).currentHP -= damageDealt;
			
			System.out.println("The " + this.getName() + "'s attack hits " + Player.getName() + " for " + damageDealt + " point of damage!");
			
			((Player) opponent).playerDeath();
		}
		else if (chanceOfSuccess >= .90)
		{
			int damageDealt = this.calculateAttackDamage(opponent);
			int criticalBonusDamage = (int) (Math.round(Math.random()*10));
			damageDealt += criticalBonusDamage;
			
			((Player)opponent).currentHP -= damageDealt;
			
			System.out.println("Critical Hit! The " + this.getName() +"'s attack does " + damageDealt + " points of damage on "
							   + Player.getName() + "!");
			
			((Player) opponent).playerDeath();
		}
	}

	@Override
	public void executeGuard() {
		// TODO Auto-generated method stub
	}

	@Override
	public void executeSteal(Combatant opponent) {
		// TODO Auto-generated method stub
	}

	@Override
	public String chanceOfSuccess() {
		// TODO Auto-generated method stub
		return null;
	}
}
