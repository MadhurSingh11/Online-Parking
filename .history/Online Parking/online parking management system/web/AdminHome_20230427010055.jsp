

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
       <head>
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>Admin| Home </title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Motel Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="applijewelleryion/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- Custom Theme files -->
<link href="css/style.css" rel='stylesheet' type='text/css' />	
<script src="js/jquery-1.11.1.min.js"></script>
<!--webfonts-->
<link href='//fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300italic,300,600' rel='stylesheet' type='text/css'>
   <!--//webfonts-->
<script type="text/javascript" src="js/bootstrap.js"></script>

    </head>
    
    <body>
         <%
        HttpSession st=request.getSession();
        String user=(String)st.getAttribute("user2");
        String pass=(String)st.getAttribute("pass2");
        
        if(user==null||pass==null)
          response.sendRedirect("adminlogin.jsp?msg=Please login first!!!!");  
        %>

               <!-- banner -->
	
		<div class="header">
			<div class="container">
				<div class="logo">
                                    <h1><a href="AdminHome.jsp">Admin Home </a></h1>
				</div>
					<nav class="navbar navbar-default" role="navigation">
						<div class="navbar-header">
							<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
								<span class="sr-only">Toggle navigation</span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
							</button>
						</div>
						<!--/.navbar-header-->
						<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
							<ul class="nav navbar-nav">
								<li><a href="AdminHome.jsp">Home</a></li>
                                                                <li><a href="view_parking.jsp">View Parking Member</a></li>
								<li class="active"><a href="achangepass.jsp">Change Password</a></li>
								<li><a href="alogout">Logout</a></li>
                                                                
				
							</ul>
						</div>
						<!--/.navbar-collapse-->
					</nav>
								<div class="clearfix"> </div>

				<!-- search-scripts -->
					<script src="js/classie.js"></script>
					<script src="js/uisearch.js"></script>
					<script>
						new UISearch( document.getElementById( 'sb-search' ) );
					</script>
				<!-- //search-scripts -->

			</div>
		</div>
						<!---strat-date-piker---->
						
						
					<div class="clearfix"> </div>
				</div>
			</div>
		</div>
			
	<!-- banner -->
	<!-- hod -->
		<!-- hod -->
	<!-- tels -->
		<!-- tels -->
	<!-- special -->
	<div class="special">
		<div class="container">
		
		</div>
	</div>
	<!-- special -->
	<!-- quick -->
	
	<!-- quick -->
<!-- footer -->
	<div class="footer">
		<div class="container">
			<div class="col-md-2 deco">
				<h4>Navigation</h4>
				<li><a href="home.jsp">Home</a></li>
	
				<li><a href="sigin.jsp">Sign in</a></li> 
				<li><a href="contact.jsp">Contact</a></li>
			</div>
			<div class="col-md-2 deco">
				<h4>Links</h4> 
				<li><a href="#">Qui Sommes-Nous ?</a></li>
				<li><a href="#">Mentions Légales </a></li>
				<li><a href="#">Conditions D'Utilisation </a></li>
			</div>
			<div class="col-md-2 deco">
				<h4>Social</h4>
				<div class="soci">
					<li><a href="#"><i class="f-1"> </i></a></li>
					<li><a href="#"><i class="t-1"> </i></a></li>
					<li><a href="#"><i class="g-1"> </i></a></li>
				</div>
			</div>
			<div class="col-md-3 cardss">
				<h4>Payment Sécure</h4>
				<li><i class="visa"></i></li>
				<li><i class="ma"></i></li>
				<li><i class="paypal"></i></li>
				<div class="clearfix"> </div>
			</div>
			<div class="col-md-3 pos">
			<h4>NewsLetter</h4>
					   <form method="post">
						 <input type="text" class="textbox" value="Email" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Email';}">
						 <div class="smt">
							<input type="submit" value="Subscribe">
						 </div>
					   </form>
			</div>
			<div class="clearfix"> </div>
		</div>
	</div>
	<div class="footer-bottom">
			<div class="container">
				<p>© 2016 . All Rights Reserved | Design by  <a href="http://" target="_blank">Analyze Info-tech </a> </p>
			</div>
		</div>
	<!-- footer -->

    </body>
</html>

