var removeurl = "#";
var toolbar = [{
            text:'添加',
            iconCls:'icon-add',
            handler:function(){
            	 $('#dlg').dialog('open').dialog('center').dialog('setTitle','新增');
            	 $('#fm').form('clear');
            	 $('#cc').combobox('select', 1);
            }
        },{
            text:'编辑',
            iconCls:'icon-edit',
            handler:function(){
            	var row = $('#dg').datagrid('getSelected');
                if (row){
                    $('#dlg').dialog('open').dialog('center').dialog('setTitle','编辑');
                    $('#fm').form('load',row);
                }else{
//                 	$.messager.alert('提示','请先选中一行!','info');
                	$.messager.show({
                		title:'提示',
                		msg:'<span style="color: red;">请选择一行...</span><br/>消息将在2秒后关闭。',
                		timeout:1500,
                		showType:'slide',
                		width:150
                	});
                }
            }
        },'-',{
            text:'刷新',
            iconCls:'icon-reload',
            handler:function(){
            	$('#dg').datagrid('load');
            }
        },{
            text:'移除',
            iconCls:'icon-remove',
            handler:function(){
            	var row = $('#dg').datagrid('getSelected');
                if (row){
                    $.messager.confirm('确认','你确定要删除这条数据吗？',function(r){
                        if (r){
                            $.post(removeurl,{id:row.id},function(result){
                                if (result.success){
                                    $('#dg').datagrid('reload');    // reload the user data
                                } else {
                                    $.messager.show({    // show error message
                                        title: '错误',
                                        msg: result.message
                                    });
                                }
                            },'json');
                        }
                    });
                }else{
                	$.messager.show({
                		title:'提示',
                		msg:'<span style="color: red;">请选择一行...</span><br/>消息将在2秒后关闭。',
                		timeout:1500,
                		showType:'slide',
                		width:150
                	});
                }
            }
        }];