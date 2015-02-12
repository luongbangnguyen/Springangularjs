$(document).ready(function() {
	var $btnSets = $('#responsive'), $btnLinks = $btnSets
			.find('a');
	
	$btnLinks.click(function(e) {
		e.preventDefault();
		$(this).siblings('a.active').removeClass("active");
		$(this).addClass("active");
		var index = $(this).index();
		$("div.user-menu>div.user-menu-content")
				.removeClass("active");
		$("div.user-menu>div.user-menu-content").eq(index)
				.addClass("active");
	});
	
	 var panels = $('.user-infos');
	    var panelsButton = $('.dropdown-user');
	    panels.hide();
	
	    //Click dropdown
	    panelsButton.click(function() {
	        //get data-for attribute
	        var dataFor = $(this).attr('data-for');
	        var idFor = $(dataFor);
	
	        //current button
	        var currentButton = $(this);
	        idFor.slideToggle(400, function() {
	            //Completed slidetoggle
	            if(idFor.is(':visible'))
	            {
	                currentButton.html('<i class="glyphicon glyphicon-chevron-up text-muted"></i>');
	            }
	            else
	            {
	                currentButton.html('<i class="glyphicon glyphicon-chevron-down text-muted"></i>');
	            }
	        })
	    });
	
	
	    $('[data-toggle="tooltip"]').tooltip();
	
	    $('button').click(function(e) {
	        e.preventDefault();
	        alert("This is a demo.\n :-)");
	    });
	    
	    $("[rel='tooltip']").tooltip();
	
		$('.view').hover(function() {
			$(this).find('.caption').slideDown(250); //.fadeIn(250)
		}, function() {
			$(this).find('.caption').slideUp(250); //.fadeOut(205)
		});
});