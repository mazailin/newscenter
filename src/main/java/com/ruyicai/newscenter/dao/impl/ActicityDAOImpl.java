package com.ruyicai.newscenter.dao.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Component;

import com.ruyicai.newscenter.dao.ActivityDAO;
import com.ruyicai.newscenter.pojo.Activity;

/**
 * @classname: AdminDAOImpl
 * @description 系统管理员 操作实现类
 */
@Component
public class ActicityDAOImpl implements ActivityDAO {
	private Logger log = LoggerFactory.getLogger(ActicityDAOImpl.class);
	private SqlMapClientTemplate sqlMapClientTemplate;

	public void setSqlMapClientTemplate(
			SqlMapClientTemplate sqlMapClientTemplate) {
		this.sqlMapClientTemplate = sqlMapClientTemplate;
	}

	@Override
	public void insertActivity(Activity activity) {
		// TODO Auto-generated method stub
	    sqlMapClientTemplate.insert("ActivityMap.insertActivity", activity);
		
	}

	@Override
	public List<Activity> queryActivityByList(Activity activity) {
		return (List<Activity>) sqlMapClientTemplate.queryForList("ActivityMap.selectAllActivityForList",activity);
	}


	

	

}
