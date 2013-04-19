<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<script type="text/javascript">
function changePassword() {
	window.parent.content.location = "/cmgr/frame/blank";
}
function logout() {
	if(window.confirm("确定退出?")) {
				window.parent.location = "/cmgr/j_spring_security_logout";
	}
}
</script>
</head>
<div style="min-width: 1003px;">
	<table id="_TableHeader" class="bluebg" style="background: url(resources/images/vistaBlue.jpg) repeat-x scroll left top rgb(51, 136, 187);" border="0" cellpadding="0" cellspacing="0" width="100%">
		<tbody><tr>
			<td height="70" valign="bottom">
			<table style="position: relative;" border="0" cellpadding="0" cellspacing="0" height="70">
				<tbody><tr>
					<td style="padding: 0pt;"><img src="resources/images/logo.png"></td>
				</tr>
			</tbody></table>
			</td>
			<td valign="bottom">
			<div style="text-align:right; margin:0 20px 15px 0;">当前用户：<b>renhongyu</b>
			&nbsp;[&nbsp;<a href="javascript:void(0);" onclick="logout();">退出登录</a> | <a href="javascript:changePassword();">修改密码</a> ]</div>
			</td>
		</tr>
	</tbody></table>
</div>