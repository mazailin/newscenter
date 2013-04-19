package com.ruyicai.newscenter.pojo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Admin {
	/**
	 * 管理员id自增长数字主键
	 */
	private Long login_id;
	/**
	 * 管理员登录名
	 */
	private String login_name;
	/**
	 * 管理员登录密码
	 */
	private String login_password;
	/**
	 * 角色权限id 如：用数字1、2、3、4来代表各种权限
	 */
	private Integer role_id;
	/**
	 * 管理员职责描述
	 */
	private String description;
	/**
	 * 最近登录时间
	 */
	private String login_time;

	/**
	 * 登录时自动保存当前时间
	 */
	public Admin() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		login_time = sdf.format(new Date());
	}

	public Integer getRole_id() {
		return role_id;
	}

	public void setRole_id(Integer role_id) {
		this.role_id = role_id;
	}

	public Long getLogin_id() {
		return login_id;
	}

	public void setLogin_id(Long login_id) {
		this.login_id = login_id;
	}

	public String getLogin_name() {
		return login_name;
	}

	public void setLogin_name(String login_name) {
		this.login_name = login_name;
	}

	public String getLogin_password() {
		return login_password;
	}

	public void setLogin_password(String login_password) {
		this.login_password = login_password;
	}


	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLogin_time() {
		return login_time;
	}

	public void setLogin_time(String login_time) {
		this.login_time = login_time;
	}

}
