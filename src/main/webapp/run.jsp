<%@ page import="javax.servlet.RequestDispatcher" %>
<%@ page import="javax.servlet.ServletContext" %>
<%@ page import="ru.ncd.Converter" %>
<%@ page import="ru.ncd.OverFlowException" %>
<%@ page import="ru.ncd.InputException" %>

<%
    try{
        String number = request.getParameter("number");
        int a = Integer.parseInt(request.getParameter("a"));
        int b = Integer.parseInt(request.getParameter("b"));
        String result = Converter.countResult(number, a, b);
        ServletConfig servletConfig = getServletConfig();
        ServletContext servletContext = servletConfig.getServletContext();
        servletContext.setAttribute("number", number);
        servletContext.setAttribute("a", a);
        servletContext.setAttribute("b", b);
        servletContext.setAttribute("result", result);
        RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher("/mainPage.jsp");
        requestDispatcher.forward(request, response);
    }catch(OverFlowException e){
        RequestDispatcher requestDispatcher = getServletConfig().getServletContext().getRequestDispatcher("/overFlowExceptionPage.jsp");
        requestDispatcher.forward(request, response);
    }catch(InputException e){
        RequestDispatcher requestDispatcher = getServletConfig().getServletContext().getRequestDispatcher("/inputExceptionPage.jsp");
        requestDispatcher.forward(request, response);
    }catch(NumberFormatException e){
        RequestDispatcher requestDispatcher = getServletConfig().getServletContext().getRequestDispatcher("/numberFormatExceptionPage.jsp");
        requestDispatcher.forward(request, response);
    }
%>