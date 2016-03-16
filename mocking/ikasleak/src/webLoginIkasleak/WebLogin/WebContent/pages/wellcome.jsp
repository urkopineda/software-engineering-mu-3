<head>
         <meta http-equiv="Content-Type" 
            content="text/html; charset=windows-1256">
         <title>User Logged Successfully</title>
      </head>

      <body>

	<center>
    	<% edu.mondragon.mgep.tdd.weblogin.model.User currentUser = (edu.mondragon.mgep.tdd.weblogin.model.User) (session.getAttribute("currentSessionUser"));%>
		Welcome <%= currentUser.getFirstName() + " " + currentUser.getLastName() %>
	</center>
</body>

