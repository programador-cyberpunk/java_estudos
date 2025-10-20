	<script src="https://code.jquery.com/jquery-3.6.0.min.js">
	
	//os sites que usei de referencia
	//https://www.devmedia.com.br/ajax-com-jquery-trabalhando-com-requisicoes-assincronas/37141
	//https://www-scrapingbee-com.translate.goog/blog/html-parsing-jquery/?_x_tr_sl=en&_x_tr_tl=pt&_x_tr_hl=pt&_x_tr_pto=tc
	//
	//
	
	$.get('httos://draft.dev/learn/how-to-use-markdown', function(html){
		alert($(html).find("#why-use-markdown".text()));
	});
	
	$.get('httos://draft.dev/learn/how-to-use-markdown', function(html){
		alert(html);
	});
	
	$.get('https://draft.dev/learn/how-to-use-markdown', function(html){
		$(html).find(".highlight").each(function(){
			alert(&(this).text());
			
		})
		
	})
	<!DOCTYPE html>
	<html lang="en">
	<head>    <meta charset="utf-8">  
	<title>How to Use Markdown | Draft.dev</title>
	<meta content="Draft.dev" property="og:site_name">
	<meta content="How to Use Markdown" property="og:title">
	<meta content="article" property="og:type">
	<meta content="If you don't know what Markdown is, or if you've only heard of it, it may seem confusing how a tool for writing can do these things and be held in such high regard by an entire community. This blog post will dive a bit deeper into why Markdown was developed, what exactly it is, and why you should use it. " property="og:description">
	<body>
	<script data-cfasync="false" src="/cdn-cgi/scripts/5c5dd728/cloudflare-static/email-decode.min.js">
	</script>
	</body>
	</html>
	</script>
	
