package model;

public class Field {
	
	/**
	 * 地块得分
	 */
	private int num;
	
	/**
	 * 地块横坐标，数字
	 */
	private int x;
	
	/**
	 * 地块纵坐标字母
	 */
	private char y;
	
	/**
	 * 地块描述
	 */
	private String describe;
	
	/**
	 * 左上地块
	 */
	private Field[] luNode;
	
	/**
	 * 坐下地块
	 */
	private Field[] ldNode;
	
	/**
	 * 右上地块
	 */
	private Field[] ruNode;
	
	/**
	 * 右下地块
	 */
	private Field[] rdNode;
	
	public Field() {
		
	}
	
	public Field(int num, int x, char y, String describe, int relateNodeSize) {
		this.num = num;
		this.x = x;
		this.y = y;
		this.describe = describe;
		
		this.luNode = new Field[relateNodeSize];
		this.ldNode = new Field[relateNodeSize];
		this.ruNode = new Field[relateNodeSize];
		this.rdNode = new Field[relateNodeSize];
		
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
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

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public Field[] getLuNode() {
		return luNode;
	}

	public void setLuNode(Field[] luNode) {
		this.luNode = luNode;
	}

	public Field[] getLdNode() {
		return ldNode;
	}

	public void setLdNode(Field[] ldNode) {
		this.ldNode = ldNode;
	}

	public Field[] getRuNode() {
		return ruNode;
	}

	public void setRuNode(Field[] ruNode) {
		this.ruNode = ruNode;
	}

	public Field[] getRdNode() {
		return rdNode;
	}

	public void setRdNode(Field[] rdNode) {
		this.rdNode = rdNode;
	}

}
