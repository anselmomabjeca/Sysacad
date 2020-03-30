// Now we can make the script
		
			  // First of all, we will capture all the steps with the DOM (you can also work with jQuery, but I will post the solution with DOM in case you do not have your code prepared to jQuery)
			  var step1 = document.getElementById("menuform:step1");
			  var step2 = document.getElementById("menuform:step2");
			  var step3 = document.getElementById("menuform:step3");
			  var step4 = document.getElementById("menuform:step4");
			
			  // Then, we are going to set the attributes href and onclick, and give them some style to make the elements look like proper links
			  step1.setAttribute("href", "[url]");
			  step1.setAttribute("onclick", true);
			  step1.style.cursor = "pointer";
			
			  step2.setAttribute("href", "[url]");
			  step2.setAttribute("onclick", true);
			  step2.style.cursor = "pointer";
			
			  step3.setAttribute("href", "[url]");
			  step3.setAttribute("onclick", true);
			  step4.style.cursor = "pointer";
			
			  step4.setAttribute("href", "[url]");
			  step4.setAttribute("onclick", true);
			  step4.style.cursor = "pointer";
		