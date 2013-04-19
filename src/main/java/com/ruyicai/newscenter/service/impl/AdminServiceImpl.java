package com.ruyicai.newscenter.service.impl;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ruyicai.newscenter.dao.AdminDAO;
import com.ruyicai.newscenter.pojo.Admin;
import com.ruyicai.newscenter.service.AdminService;
import com.ruyicai.newscenter.util.FinalVar;


/**
 * @classname: AdminServiceImpl
 * @description 系统管理员 业务操作实现方法
 */
@Component
public class AdminServiceImpl implements AdminService {
	private Logger log = LoggerFactory.getLogger(AdminServiceImpl.class);
	
	private  AdminDAO adminDAO;

	public AdminDAO getAdminDAO() {
		return adminDAO;
	}

	public void setAdminDAO(AdminDAO adminDAO) {
		this.adminDAO = adminDAO;
	}

	public Admin selectAdmin(Map record) {
		Admin admin = this.adminDAO.selectAdmin(record);
		return admin;
	}

	@Override
	public Admin queryAdminByName(String name) {
		return  this.adminDAO.selectAdminByName(name);
	}

	@Override
	public String editPwd(String changepwd, Long id) {

		try {
			Integer num = this.adminDAO.updatePwd(changepwd, id);
			if (num > 0) {
				log.info("修改密码成功");
				return FinalVar.UPDATE_SUCCESS;
			} else {
				log.info("数据库找不到此记录");
				return FinalVar.UPDATE_THERE;
			}
		} catch (Exception e) {
			log.error("修改密码失败");
			return FinalVar.UPDATE_FAIL;
		}

	}

	@Override
	public String addadmin(Admin user) {
		try {
			this.adminDAO.insertAdmin(user);
			log.info("添加管理员成功");
			return FinalVar.INSERT_SUCCESS;
		} catch (Exception e) {
			log.info("添加失败");
			return FinalVar.INSERT_FAIL;
		}
	}

	@Override
	public List<Admin> selectAllUserByList(String login_name) {
		return  (List<Admin>) this.adminDAO.queryUserByList(login_name);
		
	}

}
