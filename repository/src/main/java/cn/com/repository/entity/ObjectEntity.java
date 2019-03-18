package cn.com.repository.entity;

/*
  	`id` bigint(64) not null auto_increment comment '物品id' primary key,
    `name` varchar(100) NOT NULL COMMENT '名称',
    `type` VARCHAR(100) NOT NULL COMMENT '类型',
    `uid` bigint(64) not null comment '用户id',
    `remark` varchar(200) comment '备注',
    `barcode` varchar(50) COMMENT '条形码'
 */
public class ObjectEntity {
	
	private long id;
	private String name;
	private String type;
	private long uid;
	private String remark;
	private String barcode;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public long getUid() {
		return uid;
	}
	public void setUid(long uid) {
		this.uid = uid;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	
}
