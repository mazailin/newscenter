package com.ruyicai.newscenter.controller;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ruyicai.newscenter.pojo.Activity;
import com.ruyicai.newscenter.service.ActivityService;
@RequestMapping(value="/news")
@Controller
public class NewsController {
	private Logger logger = LoggerFactory.getLogger(NewsController.class);  
	@Autowired
	private ActivityService activityService;
	
	@RequestMapping(value = "create", method = RequestMethod.POST)
	public String createAcvity(
			@RequestParam(value = "title") String title,
			@RequestParam(value = "url") String acvitityurl,
			@RequestParam(value = "uploadpic") String uploadpic,
			@RequestParam(value = "content",required=false) String content,
			@RequestParam(value = "type",required=false,defaultValue="1") int type,
			@RequestParam(value = "website_id",required=false,defaultValue="ruyicai") String website_id,
			HttpServletRequest request, HttpServletResponse response){
		      try{
		    	  if(uploadpic.contains("<pre>")){
		    		  uploadpic = uploadpic.replace("<pre>", "").replace("</pre>", "").trim();
		    	  }
						Activity activity = new Activity();
						//获取上传路径
						activity.setActivity_title(title);
						activity.setActivity_content(content);
						activity.setActivity_url(acvitityurl);
						activity.setActivity_image(uploadpic);
						activity.setType(type);
						activity.setWebsite_id(website_id);
						activityService.addacvitity(activity);
						return "createhuodong";
			} catch (Exception e) {
			    e.printStackTrace();
			    logger.info("添加活动专题异常！");
			    return "uncaughtException";
			}
	}
	
	
	@RequestMapping(value = "selectActivityList", method = RequestMethod.POST)
	public String selectActivityList(){
		
		Activity activity = new Activity();
		activityService.selectActivityForList(activity);
		
		return "";
	}
	
	
}

