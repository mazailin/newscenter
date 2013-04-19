package com.ruyicai.newscenter.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ruyicai.newscenter.pojo.Admin;
import com.ruyicai.newscenter.service.AdminService;
@Controller
@RequestMapping(value="/admin")
public class AdminController {
	private Logger logger = LoggerFactory.getLogger(AdminController.class);  
	@Autowired 
	private AdminService adminService;
	
	/**
	 * 根据条件查询用户信息
	 * 
	 * @param username  用户名
	 * @param type      权限
	 * @param userstate 用户状态  关闭或者正常
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "queryAdminInfoByWhere", method = RequestMethod.GET)
	public String queryAdminInfoByWhere(
			@RequestParam(value = "username",required=false) String username,
			HttpServletRequest request, HttpServletResponse response){
		List<Admin> admin = adminService.selectAllUserByList(username);
		request.setAttribute("listuserinfos", admin);
		return "user_quanxian_query";
	}
	
	/**
	 * 管理员登陆功能
	 * 
	 * @return
	 */
	@RequestMapping(value="/login")
    public String login(HttpServletRequest request,HttpServletResponse response,
    		@RequestParam(value="login_name") String login_name,
    		@RequestParam(value="login_password") String login_password
    		) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("login_name", login_name);
		map.put("login_password", login_password);
		Admin admin = adminService.selectAdmin(map);
		if (admin != null){
				request.getSession().setAttribute("ADMIN", login_name);
				request.getSession().setAttribute("ADMIN_SESSION", admin);
				return "index";
		} else {
			return "login";
		}
	}

	/**
	 * 管理员退出功能
	 * 
	 * @return
	 */
	@RequestMapping(value="/loginout")
	public String logout(HttpServletRequest request,HttpServletResponse response) {
		request.getSession().invalidate();
		return "login";

	}

	/**
	 * 修改管理员密码
	 * 
	 * @return
	 */
//	@RequestMapping(value="/modifyPwd")
//	public String modifyPwd(HttpServletRequest request,HttpServletResponse response) {
//
//		String name = (String) request.getSession().getAttribute("ADMIN");
//
//		Admin admin = adminService.queryAdminByName(name);
//		if (pwd.equals(admin.getLogin_password())) {
//			String updatecode = adminService.editPwd(changpwd,
//					Long.parseLong(admin.getLogin_id().toString()));
//			if (FinalVar.UPDATE_SUCCESS.equals(updatecode)) {
//				request.setAttribute("msg", "修改密码成功");
//			} else {
//				request.setAttribute("msg", "修改密码失败");
//			}
//
//		} else {
//			request.setAttribute("msg", "原始密码错误,请重新输入");
//		}
//
//		return "msg";
//
//	}

	/**
	 * 添加管理员
	 * 
	 * @return
	 */
//	public String createAdmin() {
//		Admin admin = adminService.queryAdminByName(user.getLogin_name());
//		if (admin == null) {
//			String insertcode = adminService.addadmin(user);
//			if (FinalVar.INSERT_SUCCESS.equals(insertcode)) {
//				request.setAttribute("msg", "添加管理员成功");
//			} else {
//				request.setAttribute("msg", "添加管理员失败");
//			}
//		} else {
//			request.setAttribute("msg", "此管理员已存在");
//		}
//		return "msg";
//
//	}
//
//	public void validateUserName() throws Exception {
//		String username = request.getParameter("username");
//		Object object = adminService.queryAdminByName(username);
//		PrintWriter out = response.getWriter();
//		if (object!=null) {
//			out.print("1");
//		} else {
//			out.print("0");
//		}
//
//	}

}

