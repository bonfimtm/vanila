package com.bonfimtm.vanila;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MessageServlet extends HttpServlet {

    private static final long serialVersionUID = 4963200424853227201L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        response.setContentType("application/json");
        Message message1 = new Message(1L, "Roger", "Welcome my son.");
        Message message2 = new Message(2L, "David", "Welcome to the machine!");
        Message allMesages[] = { message1, message2 };
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        pw.println(gson.toJson(allMesages));
        pw.close();
    }

}
