
package com.ruyicai.newscenter.service;

import java.util.List;

import com.ruyicai.newscenter.pojo.Activity;


/**
 * 处理活动专题相关业务
 * @author 赵凯龙
 *
 */
public interface ActivityService {
   /**
    * 添加 活动
    * @param activity
    * @return
    */
	public String addacvitity(Activity activity);
   
	/**
	 * 查询活动列表
	 * @return
	 */
	public List<Activity> selectActivityForList(Activity activity);
	
	
}
