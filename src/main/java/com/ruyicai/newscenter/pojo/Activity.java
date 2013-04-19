package com.ruyicai.newscenter.pojo;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * @author Administrator
 *
 */
public class Activity {
		/**
		 * 自增id
		 */
		private long activity_id;
		/**
		 * 活动标题
		 */
		private String activity_title;
		/**
		 * 活动地址
		 */
		private String activity_url;
		/**
		 * 活动内容
		 */
		private String activity_content;
		/**
		 * 活动图片
		 */
		private String activity_image;
		/**
		 * 活动是否开启 0为开始  1为停止
		 */
		private int type;
		/**
		 * 创建时间
		 */
		private String create_time;
		/**
		 * 站点 默认为ruyicai
		 */
		private String website_id;
		
		public String getWebsite_id() {
			return website_id;
		}
		public void setWebsite_id(String website_id) {
			this.website_id = website_id;
		}
		public Activity() {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			create_time = sdf.format(new Date());
		}
		public String getCreate_time() {
			return create_time;
		}
		public void setCreate_time(String create_time) {
			this.create_time = create_time;
		}
		public int getType() {
			return type;
		}
		public void setType(int type) {
			this.type = type;
		}
		public long getActivity_id() {
			return activity_id;
		}
		public void setActivity_id(long activity_id) {
			this.activity_id = activity_id;
		}
		public String getActivity_title() {
			return activity_title;
		}
		public void setActivity_title(String activity_title) {
			this.activity_title = activity_title;
		}
		public String getActivity_url() {
			return activity_url;
		}
		public void setActivity_url(String activity_url) {
			this.activity_url = activity_url;
		}
		public String getActivity_content() {
			return activity_content;
		}
		public void setActivity_content(String activity_content) {
			this.activity_content = activity_content;
		}
		public String getActivity_image() {
			return activity_image;
		}
		public void setActivity_image(String activity_image) {
			this.activity_image = activity_image;
		}
		
		
		
}
