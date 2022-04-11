package model;

import java.util.LinkedList;
import java.util.List;

public class Group {
	
	/**
	 * 公会id
	 */
	private int groupId;
	
	/**
	 * 公会战当前总分
	 */
	private int totalNum;
	
	/**
	 * 公会当前x坐标
	 */
	private int x;
	
	/**
	 * 公会当前y坐标
	 */
	private char y;
	
	/**
	 * 公会名称
	 */
	private String groupName;
	
	private List<Field> ownField = new LinkedList<Field>();

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public int getTotalNum() {
		return totalNum;
	}

	public void setTotalNum(int totalNum) {
		this.totalNum = totalNum;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public char getY() {
		return y;
	}

	public void setY(char y) {
		this.y = y;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public List<Field> getOwnField() {
		return ownField;
	}

	public void setOwnField(List<Field> ownField) {
		this.ownField = ownField;
	}

}
