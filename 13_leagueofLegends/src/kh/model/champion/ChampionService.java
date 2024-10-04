package kh.model.champion;

import java.util.ArrayList;
import java.util.List;

import kh.model.build.Build;
import kh.model.build.Champion;
import kh.model.item.Item;
import kh.model.skill.Skill;

public class ChampionService {

    // 챔피언 목록 생성
    public List<Champion> getChampions() {
        List<Champion> champions = new ArrayList<>();

        // 챔피언1 생성
        List<Skill> skills1 = new ArrayList<>();
        skills1.add(new Skill("Q - 발사체", "적에게 피해를 입힘", 50));
        skills1.add(new Skill("W - 보호막", "자신에게 보호막을 생성", 0));
        Champion champion1 = new Champion("가렌", 60, 40, skills1);
        champions.add(champion1);

        // 챔피언2 생성
        List<Skill> skills2 = new ArrayList<>();
        skills2.add(new Skill("Q - 스킬샷", "적에게 큰 피해", 80));
        Champion champion2 = new Champion("애쉬", 50, 30, skills2);
        champions.add(champion2);

        return champions;
    }

    // 챔피언 빌드 생성
    public Build createBuild(Champion champion, List<Item> items) {
        Build build = new Build(champion);
        for (Item item : items) {
            build.addItem(item);
        }
        return build;
    }
}

