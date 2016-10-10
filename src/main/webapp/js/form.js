function formOne(){
        	$('#fm').form('submit', {
        	    success: function(data){
	       	        var data = eval('(' + data + ')');  
	       	        if (data.success){
	       	        	$("#dlg").dialog("close");
					        	$('#dg').datagrid('reload');
					        	$.messager.show({
		                		title:'提示',
		                		msg:'<span style="color: red;">修改成功 ...</span><br/>消息将在2秒后关闭。',
		                		timeout:1500,
		                		showType:'slide',
		                		width:150
		                	});
	       	        }else{
	       	         	$.messager.show({
                         title: '错误',
                         msg: data.message
                    });
	       	        }   
        	    }    
        	});
        };