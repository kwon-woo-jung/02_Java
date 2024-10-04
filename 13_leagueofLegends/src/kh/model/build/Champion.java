package kh.model.build;

import java.util.List;

import kh.model.skill.Skill;

public class Champion {
	private String name;
	private int baseAttackPower;
	private int baseDefense;
	private List<Skill> skills;
	
	public Champion(String name, int baseAttackPower, int baseDefense, List<Skill> skills) {
		this.name = name;
		this.baseAttackPower = baseAttackPower;
		this.baseDefense = baseDefense;
		this.skills = skills;
	}

	
	public String getName() {
		return name;
	}

	public int getBaseAttackPower() {
		return baseAttackPower;
	}

	public int getBaseDefense() {
		return baseDefense;
	}

	 public List<Skill> getSkills() {
	        return skills;
	    }


	@Override
	public String toString() {
		return  name + " (Attack: " + baseAttackPower + ", Defense: " + baseDefense + ")";
	}
	
	
}