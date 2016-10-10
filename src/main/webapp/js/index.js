$(function() {
	var hometabs = $("#hometabs").tabs({
		fit : true,
		border : false,
		plain : true,
		tabWidth:100
//		tabHeight:100 //这里也可以调节选项卡的高度
	});
	$("#menuTree").tree({
		url : 'tree_data1.json',
		method : 'get',
		animate : true,
		lines : true,//定义是否显示树控件上的虚线。
		onClick : function(node) {
			var url = node.url;
			if (url) {
				var text = node.text;
				if (hometabs.tabs("exists", text)) {
					hometabs.tabs("select", text);
				}else{
					hometabs.tabs("add", {
						title : text,
						closable : true,
						content:'<iframe src="'+url+'" frameborder="0" style="height: 100%;width: 100%"></iframe>'
					});
				}
			}
		}
	});
});