package pixelmon.battles.attacks.statusEffects;

import java.util.ArrayList;

import pixelmon.RandomHelper;
import pixelmon.battles.attacks.Attack;
import pixelmon.entities.pixelmon.EntityPixelmon;
import pixelmon.enums.EnumType;

public class SmackedDown extends StatusEffectBase {

	public SmackedDown() {
		super(StatusEffectType.SmackedDown, false, true, false);
	}

	@Override
	public void ApplyEffect(EntityPixelmon user, EntityPixelmon target, ArrayList<String> attackList) {}
	
	@Override
	public double adjustDamage(Attack a, double damage, EntityPixelmon user, EntityPixelmon target, double crit) {
		double stab = 1;
		if (a.STAB)
			stab = 1.5;
		double type = EnumType.getTotalEffectiveness(user.type, a.baseAttack.attackType);
		if (a.baseAttack.attackType == EnumType.Ground && user.type.contains(EnumType.Flying))
			type = 1;
		double critical = crit;
		double rand = ((double) RandomHelper.getRandomNumberBetween(85, 100)) / 100;
		double modifier = stab * type * critical * rand;
		double attack = 0, defence = 0;
		if (a.baseAttack.attackCategory == Attack.ATTACK_PHYSICAL) {
			attack = ((double) target.stats.Attack)
					* ((double) target.battleStats.AttackModifier) / 100;
			defence = ((double) user.stats.Defence)
					* ((double) user.battleStats.DefenceModifier) / 100;
		} else if (a.baseAttack.attackCategory == Attack.ATTACK_SPECIAL) {
			attack = ((double) target.stats.SpecialAttack)
					* ((double) target.battleStats.SpecialAttackModifier)
					/ 100;
			defence = ((double) user.stats.SpecialDefence)
					* ((double) user.battleStats.SpecialDefenceModifier)
					/ 100;
		}
		double Damage = ((2 * ((float)target.getLvl().getLevel()) + 10) / 250
				* (attack / defence) * a.baseAttack.basePower + 2)
				* modifier;

		return Damage;
	}
}
