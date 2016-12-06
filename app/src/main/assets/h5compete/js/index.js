

	function show(data) {		
			allData = JSON.parse(data);
			$.each(allData, function(index, data) {
				var color;
				if(data < 60) {
					data = 21;
					color = "linear-gradient(to top,#03ff90,#4dffb9)";
				} else if(data >= 60 && data < 130) {
					data = 42;
					color = "linear-gradient(to top,#02cef0,#57f4fe)";
				} else if(data >= 130 && data < 150) {
					data = 63;
					color = "linear-gradient(to top,#068eff,#50bdfd)";

				} else if(data >= 150 && data < 160) {
					data = 84;
					color = "linear-gradient(to top,#fca70f,#fbeb5b)";
				} else if(data >= 160 && data < 170) {
					data = 105;
					color = "linear-gradient(to top,#f26916,#fec638)";

				} else if(data >= 170 && data < 200) {
					data = 126;
					color = "linear-gradient(to top,#e11311,#ee716a)";
				}
				$("#list li").eq(index).find("p").css({
					"height": data + "px",
					"background": color
				});
			})		
	}
