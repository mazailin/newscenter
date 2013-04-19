
package com.ruyicai.newscenter.service;

import java.util.List;
import java.util.Map;

import com.ruyicai.newscenter.pojo.Admin;

public interface AdminService {
	
	public Admin selectAdmin(Map record);
	/**
	 * 按条件查询  login_name  按时间倒序排列
	 * @param record
	 * @return
	 */
	public List<Admin> selectAllUserByList(String login_name);
	
	/**
	 * @description 返回查询的管理员对象
	 * @param name 
	 * @return 管理员对象
	 */
	public Admin queryAdminByName(String name);
	
	/**
	 * @description 根据id修改对应的管理员密码
	 * @param changepwd
	 * @param id
	 * @return 返回码
	 */
	public String editPwd(String changepwd,Long id);

	/**
	 * @description 创建管理员
	 * @param user
	 * @return 返回码
	 */
	public String addadmin(Admin user);

	
}
