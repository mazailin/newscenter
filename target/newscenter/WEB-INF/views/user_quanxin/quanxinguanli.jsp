<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<table width="100%" cellspacing="0" cellpadding="0">
		<tbody>
		<tr>
			<td style="padding: 2px 10px;">
				<form method="post" action="">
					<div style="float: left;">
						<table width="100%" cellspacing="2" cellpadding="2" border="0">
							<tbody><tr>
								<td align="right">用户名:</td>
								<td><input type="text" onfocus="this.select();" class="inputText" value="" style="width: 110px" name="username">
								</td>
								<td></td>
								<td></td>
								<td align="center">
								<input type="submit" class="inputButton" value="查询">
							</tr>
						</tbody></table>
					</div>
				</form></td>
		</tr>
		<tr>
			<td style="padding-top: 2px; padding-left: 6px; padding-right: 6px; padding-bottom: 2px;">
				<table width="100%" cellspacing="0" cellpadding="2" class="dataTable">
					<tbody>
						<tr class="dataTableHead">
							<td width="3%" height="30" class="thOver"></td>
							<td width="33%" class="thOver"><strong>用户名</strong>
							</td>
							<td width="34%" class="thOver"><strong>状态</strong>
							</td>
							<td width="30%" class="thOver"><strong>修改</strong>
							</td>
						</tr>
						<tr>
								<td title="1">1</td>
								<td title="qujinlong">qujinlong</td>
								<td title="1">
									正常</td>
								<td>
								<a href="">编辑权限</a>|
								<a style="cursor:hand;" onclick="_delete('23')">删除</a>
								</td>
							</tr>
					</tbody>
				</table></td>
		</tr>
		<tr>
			<td style="padding-top: 2px; padding-left: 6px; padding-right: 6px; padding-bottom: 2px; font-size: 14px;"><a href="/mgr/tpermissions/addUI">新增用户</a>
			</td>
		</tr>
		</tbody>
	</table>