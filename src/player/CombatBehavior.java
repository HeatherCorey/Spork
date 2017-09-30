package player;

public interface CombatBehavior {

	public int calculateAttackDamage(Combatant opponent);
	public String chanceOfSuccess();
	public void executeAttack(Combatant opponent);
	public void executeGuard();
	public void executeSteal(Combatant opponent);
	
}
