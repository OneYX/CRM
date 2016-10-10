//为分页条加上中文提示
$(function() {
	$('.pagination').find('a.l-btn').tooltip({
		content : function() {
			var cc = $(this).find('span.l-btn-icon').attr('class').split(' ');
			var icon = cc[1].split('-')[1];
			if (icon == 'first') {
				return '首页';
			}
			if (icon == 'prev') {
				return '上一页';
			}
			if (icon == 'next') {
				return '下一页';
			}
			if (icon == 'last') {
				return '末页';
			}
			if (icon == 'load') {
				return '刷新';
			}
		}
	});
});