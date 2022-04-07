package model;

public class Map {
	
	private Field[] xHead;
	
	private Field[] yHead;
	
	{
		initMapNode(xHead, yHead);
	}
	
	public static void initMapNode(Field[] xHead, Field[] yHead) {
		xHead = new Field[20];
		yHead = new Field[20];
	}
	
	public Field[] getxHead() {
		return xHead;
	}
	public void setxHead(Field[] xHead) {
		this.xHead = xHead;
	}
	public Field[] getyHead() {
		return yHead;
	}
	public void setyHead(Field[] yHead) {
		this.yHead = yHead;
	}

}
