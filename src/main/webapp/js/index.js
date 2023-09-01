$(function(){
    var index=0;

	$(".childNav a").click(function()
    {
    	index = $(this).index(".childNav a");
    	//alert(index);
        $.ajax({
            url:("aa"),
            type:"post",
			data:{"index":index},
            dataType:"json"
        });

    });

	index=$("#index").html();

	 if( index!=1)
	 {
         index=0;
	 }
    $(".content-left ul li").eq(index).css({"background": "#ed6c2c"});
    $(".content-left ul li").eq(index).find("a").css({"color": "#fff", "text-decoration": "none"});
    $(".content-right").css({"display": "none"});
    $(".content-right").eq(index).css({"display": "block"});
	//$(".content-right:eq(0)").css({"display":"block"});
		 $(".content-left ul li").click(function(){
			 $(this).css({"background":"#ed6c2c"});
			 $(this).find("a").css({"color":"#fff","text-decoration":"none"});
			 $(".content-left ul li").not($(this)).css({"background":"#f9fafc"});
			 $(".content-left ul li").not($(this)).find("a").css({"color":"#333"});
			 $(".content-right").css({"display":"none"});
			 index = $(this).index(".content-left ul li");
			 $(".content-right").eq(index).css({"display":"block"});
		 });
	
})