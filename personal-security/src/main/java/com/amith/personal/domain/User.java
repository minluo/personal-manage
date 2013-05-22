package com.amith.personal.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.amith.domain.AggregateRootEntity;
import com.amith.query.QueryObject;

/**
 * 用户实体
 * 
 * @author amith
 * 
 */
@Entity
@Table(name = "users")
public class User extends AggregateRootEntity {

	private static final long serialVersionUID = 1L;

	private String username;

	private String password;

	private String email;

	private String mobile;

	private Date createDate;

	private boolean activated = false;

	private boolean usabled = true;

	public User(String username, String password) {
		this.username = username;
		this.password = password;
		this.email = username;
		this.createDate = new Date();
	}

	public User() {}
	
	/**
	 * 激活用户
	 */
	public void activate() {
		activated = true;
		this.save();
	}

	/**
	 * 设置用户不可用
	 */
	public void unusable() {
		usabled = false;
		this.save();
	}

	/**
	 * 设置用户可用
	 */
	public void usable() {
		usabled = true;
		this.save();
	}

	/**
	 * 判断该用户是否存在
	 * 
	 * @param user
	 * @return
	 */
	public static boolean isExist(String username) {
		return getByUsername(username) != null;
	}

	/**
	 * 根据用户名查找用户
	 * 
	 * @param username
	 * @return
	 */
	public static User getByUsername(String username) {
		return getRepository().getSingleResult(QueryObject.create(User.class).eq("username", username));
	}

	@Column(unique = true, nullable = false)
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(nullable = false)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_date")
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public boolean isActivated() {
		return activated;
	}

	public void setActivated(boolean activated) {
		this.activated = activated;
	}

	public boolean isUsabled() {
		return usabled;
	}

	public void setUsabled(boolean usabled) {
		this.usabled = usabled;
	}

}
