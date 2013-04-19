<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<base href="<%=basePath%>">
  <form action="<%=basePath%>news/create" enctype="multipart/form-data" method="post" id="form2">
  <table id="Table1" width="898px" border="1" cellpadding="0" cellspacing="0" style="color: blue;" cellpadding="0" cellspacing="0">
  <tr>
        <td align="right">上传图片：</td>
        <td>
           <input name="upload" type="file" size="40" src="" id="upload"/>
           <input name="upload1" type="submit" size="40" value="上传" id="upload1"/>
           <div id="uploadTip" style="width:250px"></div>
        </td>
        <td>上传列表图片，此图片会在活动列表展示页面显示。</td>
      </tr>
      </table>
      </form>