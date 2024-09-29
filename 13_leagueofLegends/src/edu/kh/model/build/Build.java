package edu.kh.model.build;

import java.util.ArrayList;
import java.util.List;

import edu.kh.model.champion.Champion;
import edu.kh.model.item.Item;

public class Build {
    private Champion champion;
    private List<Item> items;

    public Build(Champion champion) {
        this.champion = champion;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public int calculateTotalAttack() {
        int totalAttack = champion.getBaseAttackPower();
        for (Item item : items) {
            totalAttack += item.getAttackPower();
        }
        return totalAttack;
    }

    public int calculateTotalDefense() {
        int totalDefense = champion.getBaseDefense();
        for (Item item : items) {
            totalDefense += item.getDefense();
        }
        return totalDefense;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Champion: ").append(champion.getName()).append("\n");
        sb.append("Items: \n");
        for (Item item : items) {
            sb.append("- ").append(item).append("\n");
        }
        sb.append("Total Attack: ").append(calculateTotalAttack()).append("\n");
        sb.append("Total Defense: ").append(calculateTotalDefense()).append("\n");
        return sb.toString();
    }
}
