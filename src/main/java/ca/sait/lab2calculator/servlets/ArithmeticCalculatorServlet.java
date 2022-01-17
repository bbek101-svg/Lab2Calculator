/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package ca.sait.lab2calculator.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author admin
 */
@WebServlet(name = "ArithmeticCalculatorServlet", urlPatterns = {"/arithmetic"})
public class ArithmeticCalculatorServlet extends HttpServlet {

    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("message", " --- ");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String operation = (String)request.getParameter("ope");
         
       if(request.getParameter("first") != "" && request.getParameter("second") != ""){
                String firString = request.getParameter("first");
                String secString = request.getParameter("second");
                try{
                    int first = Integer.parseInt(firString);
                    int second = Integer.parseInt(secString);
                    
                    if(operation.equals("add")){
                        
                        request.setAttribute("message", first+second);
                    }else if(operation.equals("mul")){
                        
                        request.setAttribute("message", first*second);
                    }else if(operation.equals("sub")){
                        
                        request.setAttribute("message", first-second);
                    }else if(operation.equals("mod")){
                        
                        request.setAttribute("message", (double)first%second);
                    }
                    
                }catch(NumberFormatException e){
                    request.setAttribute("message", "Invalid");
                }
            }else{
                request.setAttribute("message", " Invalid");
       }
       getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
