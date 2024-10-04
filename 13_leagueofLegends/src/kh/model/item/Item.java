package kh.model.item;

public class Item {
	private String name;
	private int attackPower;
	private int defense;
	
	public Item(String name, int attackPower, int defense) {
		this.name = name;
		this.attackPower = attackPower;
		this.defense = defense;
	}

	public String getName() {
		return name;
	}

	public int getAttackPower() {
		return attackPower;
	}

	public int getDefense() {
		return defense;
	}

	@Override
    public String toString() {
        return name + " (Attack Power: " + attackPower + ", Defense: " + defense + ")";
    }
}

	
	
	

