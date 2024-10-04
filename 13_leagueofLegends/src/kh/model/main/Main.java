package kh.model.main;

import java.util.ArrayList;
import java.util.List;

import kh.model.build.Build;
import kh.model.build.Champion;
import kh.model.champion.ChampionService;

import kh.model.item.Item;
import kh.model.skill.Skill;

public class Main {
    public static void main(String[] args) {
        ChampionService service = new ChampionService();

        // 챔피언 목록 불러오기
        List<Champion> champions = service.getChampions();
        Champion selectedChampion = champions.get(0); // 가렌 선택

        // 가렌 정보 출력
        System.out.println("Selected Champion: " + selectedChampion);
        for (Skill skill : selectedChampion.getSkills()) {
            System.out.println(skill);
        }

        // 아이템 목록 생성
        Item item1 = new Item("피바라기", 40, 20);
        Item item2 = new Item("수호 천사", 20, 50);
        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);

        // 빌드 생성
        Build build = service.createBuild(selectedChampion, items);
        System.out.println(build);
    }
}