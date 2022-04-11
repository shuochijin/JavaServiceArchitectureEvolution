package model;

import java.util.List;

public class Battle {
	
	private int battleId;
	
	private int numberOfPeriods;
	
	private int createGroupId;
	
	private List<Integer> groups;

	public int getBattleId() {
		return battleId;
	}

	public void setBattleId(int battleId) {
		this.battleId = battleId;
	}

	public int getNumberOfPeriods() {
		return numberOfPeriods;
	}

	public void setNumberOfPeriods(int numberOfPeriods) {
		this.numberOfPeriods = numberOfPeriods;
	}

	public int getCreateGroupId() {
		return createGroupId;
	}

	public void setCreateGroupId(int createGroupId) {
		this.createGroupId = createGroupId;
	}

	public List<Integer> getGroups() {
		return groups;
	}

	public void setGroups(List<Integer> groups) {
		this.groups = groups;
	}
	
}
