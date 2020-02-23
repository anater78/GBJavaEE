package ru.anater;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "FirsHttpServlet", urlPatterns = "fhs")
public class FirsHttpServlet extends HttpServlet {

    Logger logger = LoggerFactory.getLogger(FirsHttpServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.getWriter().println("<h1>httpservlet "+req.getRequestURI()+"</h1>");

        logger.info("doGet run");



    }
}
