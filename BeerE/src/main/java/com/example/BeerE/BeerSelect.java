package com.example.BeerE;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

@WebServlet("/SelectBeer.do")
public class BeerSelect extends HttpServlet{

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException,
            ServletException {
        String c = request.getParameter("color");
        BeerExpert expert = new BeerExpert();
        List result=expert.getBrands(c);
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.println("Beer Selection Advice<br>");
        Iterator it=result.iterator();
        while(it.hasNext())
        {
            out.println("<br>try: "+it.next());
        }

    }
    }