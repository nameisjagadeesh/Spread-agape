package com.xworkz.data.team;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ScoreRunner {

	public static void main(String[] args) {
		Player p1=new Player("jaga", "batsman", 120);
		Player p2=new Player("manja", "bowler", 56);
		Player p3=new Player("chetan", "alrounder", 125);
		Player p4=new Player("raj", "batsman", 253);

		List<Player> pl=new ArrayList<Player>();
		
		
		pl.add(new Player("kim", "batsaman", 256));
		pl.add(p3);
		pl.add(p2);
		pl.add(p1);
		pl.add(p4);
		Teams t=new Teams();
		t.setPlayers(pl);
		
		int totalScore=t.getScore();
		System.out.println("total score= "+totalScore);
		
		
		Map<String, List<Player>> skill=t.getPlayersBySkills();
		System.out.println("skilled payer types"+skill);
		
	}

}
