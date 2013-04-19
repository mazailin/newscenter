<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<script type="text/javascript">	
function delete_(state) {
	var ids = document.getElementsByName("ids");
	var idsParam = "";
	var checkedNum = 0;
	for (i = 0; i < ids.length; i++) {
		if (ids[i].checked) {
			checkedNum = checkedNum + 1;
			idsParam = idsParam + "ids=" + ids[i].value + "&";
		}
	}
	if (checkedNum == 0) {
		alert("请选择!");
		return;
	}
	
	if (state==0) {
		if(!window.confirm("确定关闭吗?")) {
			return;
		}
	} else if (state==1) {
		if(!window.confirm("确定打开吗?")) {
			return;
		}
	}
	var url = "/cmgr/news/deleteNews?"+idsParam+"state="+state;
	window.location.href = url;
}
//全选
function selectAll() {
	var thes = document.getElementById("thes");
	thes.checked =!thes.checked;
	
	var a = document.getElementsByTagName("input");
	for (var i=0; i<a.length; i++) {
		if (a[i].type == "checkbox") a[i].checked =!a[i].checked;
	}
}
</script>
<div class="space30"></div>
	<table border="0" cellpadding="0" cellspacing="0" width="100%">
		<tbody>
			<tr>
				<td style="padding: 2px 10px;">
					<form action="/cmgr/news/list" method="post">
						<div style="float: left;">
							<table border="0" cellpadding="2" cellspacing="2" width="100%">
								<tbody><tr>
									<td align="right">产品:</td>
									<td>
										<select id="productno" name="productno" style="width:100px">
											<option value="0" selected="selected">全部</option>
												<option value="2">如意彩</option>
										</select>
									</td>
									<td align="right">类别:</td>
									<td><select id="type" name="type" style="width:100px">
										<option value="0" selected="selected">全部</option>
										<option value="1">彩民趣闻</option>
										<option value="2">专家分析</option>
										<option value="3">足彩天地</option>
										<option value="4">如意活动</option>
										<option value="5">Top新闻</option>
									</select></td>
									<td align="right">彩种:</td>
									<td><select id="lotno" name="lotno" style="width:100px">
										<option value="" selected="selected">无</option>
										<option value="F47102">七乐彩</option>
										<option value="F47103">福彩3D</option>
										<option value="F47104">双色球</option>
										<option value="T01001">大乐透</option>
										<option value="T01002">排列三</option>
										<option value="T01011">排列五</option>
										<option value="T01009">七星彩</option>
										<option value="T01013">22选5</option>
									</select></td>
									<td align="right">状态:</td>
									<td><select id="state" name="state" style="width:100px">
										<option value="1" selected="selected">正常</option>
										<option value="0">关闭</option>
									</select></td>
									<td align="right">显示行数:</td>
									<td><select id="maxResult" name="maxResult" style="width:60px">
											<option value="15" selected="selected">15</option>
											<option value="30">30</option>
											<option value="50">50</option>
											<option value="100">100</option>
									</select></td>
									<td align="right" width="50px"><input value="查询" class="inputButton" type="submit">
									</td>
								</tr>
							</tbody></table>
						</div>
					</form>
				</td>
			</tr>
			<tr>
				<td style="padding: 2px 6px;">
					<table class="dataTable" cellpadding="2" cellspacing="0" width="100%">
						<tbody>
							<tr class="dataTableHead">
								<td class="thOver" height="30" width="3%">
								<input id="thes" onclick="javascript:selectAll()" type="checkbox"></td>
								<td class="thOver" width="8%"><strong>产品</strong></td>
								<td class="thOver" width="10%"><strong>资讯类别</strong></td>
								<td class="thOver" width="8%"><strong>彩种</strong></td>
								<td class="thOver" width="28%"><strong>标题</strong></td>
								<td class="thOver" width="14%"><strong>创建时间</strong></td>
								<td class="thOver" width="14%"><strong>修改时间</strong></td>
								<td class="thOver" width="3%"><strong>状态</strong></td>
								<td class="thOver" width="10%"><strong>作者</strong></td>
								<td class="thOver" width="3%"><strong>操作</strong></td>
							</tr>
		
								<tr class="DataAutoWidth">
									<td><input name="ids" value="19539" type="checkbox">1</td>
									<td>
										
											如意彩
									</td>
									<td>
										彩民趣闻
									</td>
									<td>
										无
									</td>
									<td>
										华人在美国买彩票中得100万 却仅兑5元(图)
									</td>
									<td>
										2013-02-22 11:00:03
									</td>
									<td>
										2013-02-22 11:00:03
									</td>
									<td>
										
										正常
									</td>
									<td>
										renhongyu
									</td>
									<td>
										<a href="http://192.168.0.118:8080/cmgr/news/editUI?id=19539">编辑</a>
									</td>
								</tr>
							
								<tr class="DataAutoWidth">
									<td><input name="ids" value="19538" type="checkbox">2</td>
									<td>
										
											如意彩
									</td>
									<td>
										彩民趣闻
									</td>
									<td>
										无
									</td>
									<td>
										中年男子现北京体彩中心 兑取大乐透476万大奖
									</td>
									<td>
										2013-02-22 10:49:37
									</td>
									<td>
										2013-02-22 10:49:37
									</td>
									<td>
										
										正常
									</td>
									<td>
										renhongyu
									</td>
									<td>
										<a href="http://192.168.0.118:8080/cmgr/news/editUI?id=19538">编辑</a>
									</td>
								</tr>
							<tr>
								<td colspan="8" align="left">
									
									<a href="#" onclick="delete_(0)">关闭</a>
								</td>
								<td colspan="2" align="left">
									<a href="http://192.168.0.118:8080/cmgr/news/pvUvStat?productno=0&amp;type=0">PvUv统计</a>
								</td>
							</tr>
							<tr>
								<td id="dg1_PageBar" colspan="10" align="left"><div style="float: right; font-family: Tahoma">
										
											
											
										第一页
									
										
										|&nbsp;
										
											
											
										上一页
									
										
										&nbsp;|&nbsp;
										
											
												<a href="http://192.168.0.118:8080/cmgr/news/list?productno=0&amp;type=0&amp;maxResult=15&amp;pageIndex=1">下一页</a>
											
											
										
										&nbsp;|&nbsp;
										
											
												<a href="http://192.168.0.118:8080/cmgr/news/list?productno=0&amp;type=0&amp;maxResult=15&amp;pageIndex=29">最末页</a>
											
											
										
										&nbsp;|&nbsp; &nbsp;&nbsp;转到第&nbsp;<input onkeyup="value=value.replace(/\D/g,'')" style="width: 40px;" class="inputText" id="_PageBar_Index" type="text">&nbsp;页&nbsp;&nbsp;<input value="跳转" class="inputButton" onclick="go()" type="button">
										<script type="text/javascript">
											function go() {
												var pageindex = parseInt($("#_PageBar_Index").val()) - 1;
												window.location.href="/cmgr/news/list?productno=0&type=0&maxResult=15&pageIndex=" + pageindex;
											}
										</script>
									</div>
									<div style="float: left; font-family: Tahoma">共
										448 条记录，每页 15 条，当前第
										1 / 30 页</div></td>
							</tr>
							
						</tbody>
					</table>
				</td>
			</tr>
			<tr>
				<td colspan="8" align="left"> &nbsp;<a style="font-size: 12px;" href="http://192.168.0.118:8080/cmgr/news/addUI">新增新闻</a>
			</td></tr>
		</tbody>
	</table>
