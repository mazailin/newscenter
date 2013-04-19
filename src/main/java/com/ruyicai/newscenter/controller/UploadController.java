package com.ruyicai.newscenter.controller;

import java.io.File;
import java.io.PrintWriter;
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
@RequestMapping(value="/upload")
public class UploadController {
	
	
	private Logger logger = LoggerFactory.getLogger(UploadController.class);  
	private static ResourceBundle rbint = ResourceBundle.getBundle("ruyicai");
	private static String uploadLocation = rbint.getString("rootpath");
	private static String uploadtempPathFile = rbint.getString("tempPathFile");
	
	@RequestMapping(value = "doUploadFile", method = RequestMethod.POST)
	public void doUploadFile(HttpServletRequest request, HttpServletResponse response){
	    try {   
	    	    PrintWriter out =  response.getWriter();
		        String savePath =  uploadLocation 
				+ File.separator + "imageupload"+File.separator;
				String saveUrl  = "/imageupload/";
				SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
				String ymd = sdf.format(new Date());
				savePath += ymd + "/";
				saveUrl += ymd + "/";
				File uploadPath = new File(savePath);//上传文件目录
				    if (!uploadPath.exists()) {
				       uploadPath.mkdirs();
				    }
				    // 临时文件目录
				    File tempPathFile = new File(uploadtempPathFile);
				    if (!tempPathFile.exists()) {
				       tempPathFile.mkdirs();
				    }
				
				       // Create a factory for disk-based file items
				       DiskFileItemFactory factory = new DiskFileItemFactory();
				       // Set factory constraints
				       factory.setSizeThreshold(4096*2); // 设置缓冲区大小，这里是4kb
				       factory.setRepository(tempPathFile);//设置缓冲区目录
				       // Create a new file upload handler
				       ServletFileUpload fileupload = new ServletFileUpload(factory);
				       // Set overall request size constraint
				       fileupload.setSizeMax(4194304); // 设置最大文件尺寸，这里是4MB
				       List<FileItem> items = fileupload.parseRequest(request);//得到所有的文件
				       Iterator<FileItem> i = items.iterator();
				       FileItem fi =null;
				       String newFileName = null;
				       while (i.hasNext()) {
				           fi = (FileItem) i.next();
				           String fileName = fi.getName();
				           if (fileName != null) {
				        	   String fileExt = fileName.substring(fileName.lastIndexOf(".") + 1).toLowerCase();
						       SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
						       newFileName  = df.format(new Date()) + "_" + new Random().nextInt(1000) + "." + fileExt;
						       File savedFile = new File(uploadPath, newFileName);
						       fi.write(savedFile);
				           }
				       }
				       String pic = saveUrl+newFileName;
				       out.print(pic);
				       logger.info("上传成功");
			} catch (Exception e) {
			    e.printStackTrace();
			    logger.info("文件上传异常，重新上传。");
			}
	}
	

}

