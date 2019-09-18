<%-- 
    Document   : index
    Created on : 30/08/2019, 19:18:27
    Author     : eduim
--%>

<%@page import="javax.swing.JOptionPane"%>
<%@page import="calculosalario.CalcularSalario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <%
           Double salario= Double.parseDouble(request.getParameter("salario") );
           Double salhora= Double.parseDouble(request.getParameter("salhora") );
           
           if (salario<= 0 || salhora<=0){
               JOptionPane.showMessageDialog(null, "Valores negativos, calculos errados.");
               response.sendRedirect("index.html");   
           }

           
           CalcularSalario C = new CalcularSalario();
           
          C.setJsalario(salario);
          C.setJsalhora(salhora);
       
                   
          out.println("Seu salario bruto é  "+C.getConta());
          out.println("Seu salario liquido é  "+C.getLiquido());
       
       
       
       %>
    </body>
</html>
