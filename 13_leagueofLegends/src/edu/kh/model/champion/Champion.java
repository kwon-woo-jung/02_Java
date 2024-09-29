package edu.kh.model.champion;

import java.util.List;
import edu.kh.model.skill.Skill;

public class Champion {

    private String name;
    private int BaseAttackPower;
    private int baseDefense;
    private List<Skill> skills;
    
	public Champion(String name, int baseAttackPower, int baseDefense, List<Skill> skills) {
		this.name = name;
		BaseAttackPower = baseAttackPower;
		this.baseDefense = baseDefense;
		this.skills = skills;
	}

	public String getName() {
		return name;
	}

	public int getBaseAttackPower() {
		return BaseAttackPower;
	}

	public int getBaseDefense() {
		return baseDefense;
	}

	public List<Skill> getSkills() {
		return skills;
	}

	@Override
	public String toString() {
		return "Champion:" + name + " (Attack Power: " + BaseAttackPower + ",Defense: " + baseDefense + ")";
    
	
	}
}
