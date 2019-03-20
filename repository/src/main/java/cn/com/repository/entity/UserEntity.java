package cn.com.repository.entity;

/*
 * 	`uid` bigint(64) not null auto_increment comment 'id' primary key,
    `nickname` varchar(100) NOT NULL COMMENT '昵称',
    `password` varchar(200) NOT NULL COMMENT '密码'
 */
public class UserEntity {
	
	private long id;

	private String nickName;
	
	private String password;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
