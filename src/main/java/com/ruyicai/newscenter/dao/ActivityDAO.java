package com.ruyicai.newscenter.dao;

import java.util.List;

import com.ruyicai.newscenter.pojo.Activity;


/**
 * @classname: AdminDAO
 * @description 系统管理员 操作接口
 * @date： 2011-1-18 下午05:08:31
 */

public interface ActivityDAO {
	
	/**
	 * @description 创建活动专题
	 * @param activity 创建活动专题
	 * @return
	 */
	public  void insertActivity (Activity activity);
	
	/**
	 * 所有活动查询
	 * @param activity
	 * @return
	 */
	public  List<Activity> queryActivityByList (Activity activity);
    
}
