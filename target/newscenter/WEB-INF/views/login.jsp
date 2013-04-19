<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
	<form id="fm1" class="fm-v clearfix" action="" method="post">
		<table height="100%" width="100%">
			<tbody><tr>
				<td align="center" valign="middle">
					<table style="height:100px; width: 620px; background: url(resources/images/HomeLogo.gif;) no-repeat scroll 0px 0px transparent;">
						<tbody><tr>
							<td>
								<div style="height: 100px; width: 620px;"></div>
								<div style="height: 70px; width: 620px; margin: 0px auto 0px auto;">
									<table style="margin-top: 8px;" align="center" border="0" cellpadding="0" cellspacing="0" width="95%">
										<tbody><tr>
											<td align="center">
											<label for="username" class="fl-label">用户名:</label>  
											<input id="username" name="username" class="required" tabindex="1" accesskey="n" size="25" autocomplete="false" type="text">
												&nbsp;
											<label for="password" class="fl-label">密　码:</label>
											<input id="password" name="password" class="required" tabindex="2" accesskey="p" value="" size="25" autocomplete="off" type="password"> <span id="spanVerifyCode"></span>
												&nbsp;
											<input class="btn-submit" name="submit" accesskey="l" value="登录" 
											tabindex="4" type="submit"> 
											<input class="btn-reset" name="reset" accesskey="c" value="重置" 
											tabindex="5" type="reset"></td>
										</tr>
									</tbody></table>
								</div>
							</td>
						</tr>
					</tbody></table> <br>
				</td>
			</tr>
		</tbody></table>
	</form>
