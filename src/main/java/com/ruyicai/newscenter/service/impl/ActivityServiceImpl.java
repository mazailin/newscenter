package com.ruyicai.newscenter.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ruyicai.newscenter.dao.ActivityDAO;
import com.ruyicai.newscenter.pojo.Activity;
import com.ruyicai.newscenter.service.ActivityService;
import com.ruyicai.newscenter.util.FinalVar;


/**
 * @classname: AcvitityServiceImpl
 * @description 活动专题业务操作实现方法
 */
@Component
public class ActivityServiceImpl implements ActivityService {
	private Logger log = LoggerFactory.getLogger(ActivityServiceImpl.class);
    private ActivityDAO activityDAO;
    
	public ActivityDAO getActivityDAO() {
		return activityDAO;
	}

	public void setActivityDAO(ActivityDAO activityDAO) {
		this.activityDAO = activityDAO;
	}

	@Override
	public String addacvitity(Activity activity) {
		try {
			activityDAO.insertActivity(activity);
			log.info("添加活动专题成功");
			return FinalVar.INSERT_SUCCESS;
		} catch (Exception e) {
			log.info("添加活动专题失败");
			return FinalVar.INSERT_FAIL;
		} 
	}

	@Override
	public List<Activity> selectActivityForList(Activity activity) {
		List<Activity> activities = activityDAO.queryActivityByList(activity);
		return activities;
	}
	
	
}
