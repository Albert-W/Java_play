<html>
<head>
    <title>Hello World - JSP</title>
</head>
<body>
    <%-- JSP Comment --%>
    <h1>Hello World!</h1>
    <p>
	    <%
	         out.println("Your IP address is ");
	    %>
	    <span style="color:red">
	        <%= request.getRemoteAddr() %>
	    </span>
    </p>
    <%@ page import="java.time.LocalDateTime" %>
    <p> The date and time is 
	    <span>
	    	<%	
	    		out.println(LocalDateTime.now().toString());
			 %>
	    </span>
    </p>
</body>
</html>
