function ajaxFileUpload(upload,divId)
    {
	    var fileName=$("#upload").val();
	    if(fileName == ""){
	    	alert("您选择一张活动图片！");
			return;
		}
		$.ajaxFileUpload({
                 url: _context+'/upload/doUploadFile', //你处理上传文件的服务端
                 type:"POST",//数据发送方式
                 secureuri:false,
                 fileElementId:upload,
                 dataType: 'text',
                 success: function (data){
                	 alert("图片上传成功！");
                	 $("#"+divId).html(data);
                	 $("#uploadpic").val(data);
                 }
           		 });
		return false;
 }
