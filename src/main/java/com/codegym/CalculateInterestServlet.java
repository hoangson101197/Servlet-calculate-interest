package com.codegym;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CalculateInterestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        float loan = Float.parseFloat(request.getParameter("loan"));
        float rate = Float.parseFloat(request.getParameter("monthlyinterestrate"));
        float term = Float.parseFloat(request.getParameter("termbymonth"));

        float totalMoney = (loan * (rate / 100) * term) + loan;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("Total Money: " + totalMoney);
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }
}
