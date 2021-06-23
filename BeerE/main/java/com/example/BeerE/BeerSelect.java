package com.example.BeerE;

import javax.servlet.RequestDispatcher;
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
        BeerExpert be = new BeerExpert();
        List result =be.getBeer(c);
        request.setAttribute("styles",result);

        RequestDispatcher view =
                request.getRequestDispatcher("result.jsp");

        view.forward(request,response);

    }
    }