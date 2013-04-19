<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script src="<%=request.getContextPath() %>/resources/js/jquery.min.js"type="text/javascript"></script>
<script src="<%=request.getContextPath() %>/resources/js/formValidator/jquery_last.js" type="text/javascript"></script>
<link type="text/css" rel="stylesheet" href="<%=request.getContextPath() %>/resources/js/formValidator/style/validator.css"></link>
<script src="<%=request.getContextPath() %>/resources/js/formValidator/formValidator.js" type="text/javascript" charset="UTF-8"></script>
<script src="<%=request.getContextPath() %>/resources/js/formValidator/formValidatorRegex.js" type="text/javascript" charset="UTF-8"></script>
<script language="javascript" type="text/javascript" src="<%=request.getContextPath() %>/resources/js/jQuery.FillOptions.js"></script>
<script language="javascript" type="text/javascript" src="<%=request.getContextPath() %>/resources/js/jQuery.CascadingSelect.js"></script>
<script type="text/javascript" charset="utf-8" src="<%=request.getContextPath() %>/resources/kindeditor/kindeditor.js"></script>
<script type="text/javascript" charset="utf-8" src="<%=request.getContextPath() %>/resources/js/upload.js"></script>
<script type="text/javascript" charset="utf-8" src="<%=request.getContextPath() %>/resources/js/ajaxfileupload.js"></script>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<base href="<%=basePath%>">
<script  type="text/javascript">
		KE.show({
			id : 'content',
			imageUploadJson : '<%=basePath%>resources/kindeditor/jsp/upload_json.jsp',
			fileManagerJson : '<%=basePath%>resources/kindeditor/jsp/file_manager_json.jsp',
			allowFileManager : true 
		});
	</script>
<div>
<form action="<%=basePath%>news/create"  method="post" id="form2">
<div class="space30"></div>
<table id="Table1" width="898px" border="1" cellpadding="0" cellspacing="0" style="color: blue;" cellpadding="0" cellspacing="0">
   <tr>
    <td width="100" align="right"><p>活动标题：</p></td>
    <td width="450">
	    <input name="title" type="text" size="50" id="title"/>
	    <div id="titleTip" style="width:250px"></div>
	</td>
	<td width="350">创建活动的唯一标题</td>
  </tr>
     <tr>
    <td width="100" align="right"><p>活动页面地址：</p></td>
    <td width="450">
	    <input name="url" type="text" size="80" id="url"/>
	    <div id="titleTip" style="width:250px"></div>
	</td>
	<td width="350">活动页面的地址， 用于找到上传的活动页面</td>
 	</tr>
      <tr>
        <td align="right">上传图片：</td>
        <td>
           <input name="upload" type="file" size="40" src="" id="upload"/>
           <input name="upload1" type="button" id="upload1" value="上传" onclick="return ajaxFileUpload('upload','msg');"/>
        </td>
        <td><span id="msg">上传列表图片，此图片会在活动列表展示页面显示。</span>
        <input type="hidden" id="uploadpic" value="" name="uploadpic">
         </td>
      </tr>
      <tr>
        <td align="right">活动内容：</td>
        <td colspan="2" align="left">
        <textarea id="content" name="content" cols="100" rows="10" style="width: 830px; height: 480px;">
        
        </textarea>
        <div id="contentTip" style="width:250px"></div>
        </td>
        </tr>
    </table>
		<table  width="898px" border="0" cellspacing="0" cellpadding="0" cellspacing="0">
        <tr>
          <td width="52">&nbsp;</td>
          <td width="393" align="right">
          <input name="button2" type="submit" value="保存新闻-等待审批"/></td>
          <td width="431">
          <input name="button22" type="button" 
          onclick="javaScript:window.location.href='<%=basePath%>/web/newsSearch!getSearchList'" value="取消返回" /></td>
        </tr>
</table>
</form>
</div>