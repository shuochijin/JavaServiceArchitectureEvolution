package cn.com.repository.entity;

/*
 * 	`packageid` bigint(64) not null comment '包装id',
    `objectid` bigint(64) not null comment '物品id',
    `status` varchar(1) not null comment '状态'
 */
public class ObjectContainEntity {
	
	private long packageId;
	
	private long objectId;
	
	private String status;

	public long getPackageId() {
		return packageId;
	}

	public void setPackageId(long packageId) {
		this.packageId = packageId;
	}

	public long getObjectId() {
		return objectId;
	}

	public void setObjectId(long objectId) {
		this.objectId = objectId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
