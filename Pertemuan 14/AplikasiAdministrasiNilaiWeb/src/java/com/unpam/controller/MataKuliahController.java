package com.unpam.controller;

import com.unpam.view.MainForm;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "MataKuliahController", urlPatterns = {"/MataKuliahController"})
public class MataKuliahController extends HttpServlet {

    protected void processRequest(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        String konten =
                "<h2>Data Mata Kuliah</h2>"
                + "<table border='1'>"
                + "<tr>"
                + "<th>Kode</th>"
                + "<th>Mata Kuliah</th>"
                + "</tr>"
                + "<tr>"
                + "<td>IF001</td>"
                + "<td>Pemrograman Java</td>"
                + "</tr>"
                + "</table>";

        new MainForm().tampilkan(konten, request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}