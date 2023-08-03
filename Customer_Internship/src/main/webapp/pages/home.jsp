<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h>            <b> Customer Details   </b>    </h> <br><br>
      
     <form         action   ="addCustomer">
 
   <input type="text"      name="firstname" placeholder= "Firstname"  >
 
   <input type="text"      name="lastname"  placeholder="Lastname"><br><br> 
   <input type="text"      name="street"    placeholder="Street">
   <input type="text"      name="address"   placeholder="Address"><br><br>
   <input type="text"      name="city"      placeholder="City">
   <input type="text"      name="state"     placeholder="State"><br><br>
   <input type="text"      name="email"     placeholder="Email">
   <input type="text"      name="phone"     placeholder="Phone"><br><br>
   <input type="submit">
   </form>
   
   
   <h1><b> Fetch Customer By ID</b></h1><br><br>
   
   <form      action   ="getCustomer1">
   
      <input type="text"      name="ID"      placeholder= "ID"><br>
       <input type="submit">
   </form>
   
</body>
</html>