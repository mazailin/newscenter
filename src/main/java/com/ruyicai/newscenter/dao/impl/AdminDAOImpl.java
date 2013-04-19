package com.ruyicai.newscenter.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Component;

import com.ruyicai.newscenter.dao.AdminDAO;
import com.ruyicai.newscenter.pojo.Admin;

/**
 * @classname: AdminDAOImpl
 * @description 系统管理员 操作实现类
 */
@Component
public class AdminDAOImpl implements AdminDAO {
	private Logger log = LoggerFactory.getLogger(AdminDAOImpl.class);
	private SqlMapClientTemplate sqlMapClientTemplate;

	public void setSqlMapClientTemplate(
			SqlMapClientTemplate sqlMapClientTemplate) {
		this.sqlMapClientTemplate = sqlMapClientTemplate;
	}

	/**
	 * @description 查询系统用户
	 * @param record
	 * @return 用户列表
	 */
	public Admin selectAdmin(Map record) {
		Admin admin = (Admin) this.sqlMapClientTemplate.queryForObject("AdminSQLMap.selectAdmin", record);
		return admin;
	}

	@Override
	public Admin selectAdminByName(String name) {
		return (Admin) this.sqlMapClientTemplate.queryForObject(
				"AdminSQLMap.selectAdminByName", name);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Integer updatePwd(String changepwd, Long id) {
		Map map = new HashMap();
		map.put("login_password", changepwd);
		map.put("login_id", id);
		return this.sqlMapClientTemplate.update("AdminSQLMap.updatePwd", map);
	}

	public void insertAdmin(Admin user) {

		this.sqlMapClientTemplate.insert("AdminSQLMap.insertAdmin", user);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Admin> queryUserByList(String login_name) {
		Admin  admin = new Admin();
		admin.setLogin_name(login_name);
		List<Admin> admins = this.sqlMapClientTemplate.queryForList("AdminSQLMap.selectAllUserByList",admin);
		return admins;
	}

	

}
