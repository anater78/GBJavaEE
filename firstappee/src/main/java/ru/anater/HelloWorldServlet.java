package ru.anater;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import java.io.IOException;
import java.io.Serializable;

public class HelloWorldServlet implements Servlet, Serializable {
    private Logger logger = LoggerFactory.getLogger( HelloWorldServlet.class);
    private transient ServletConfig config;

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.config = servletConfig;
        logger.info(config.toString());
    }

    @Override
    public ServletConfig getServletConfig() {
        return this.config;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        logger.info("service start");
        servletResponse.getWriter().println("<h1>Servlet start</h1>");

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

        logger.info("destroy servlet");

    }
}
