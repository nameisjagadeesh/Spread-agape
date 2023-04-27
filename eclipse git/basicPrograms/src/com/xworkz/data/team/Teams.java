package com.xworkz.data.team;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Teams {

	private List<Player> players;

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	public int getScore() {
		if(players!=null) {
		return	players.stream().mapToInt(p->p.getScore()).reduce(0, (a,b)->a + b);
		}
		return 123;
		
	}

	public Map<String, List<Player>> getPlayersBySkills(){
		Map<String, List<Player>> mapBySkillSet=players.stream().collect(Collectors.groupingBy(Player::getType));
		return mapBySkillSet;
	}
}
