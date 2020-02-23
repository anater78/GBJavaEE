package ru.anater.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;


@WebFilter(filterName = "fn",urlPatterns = "/fhs")
public class HeaderFooter implements Filter {

    private FilterConfig filterConfig;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletResponse.getWriter().println("<h1>FromFilterFooter</h1>");
        filterChain.doFilter(servletRequest,servletResponse);
        servletResponse.getWriter().println("<h1>FromFilterHeader</h1>");
    }

    @Override
    public void destroy() {

    }
}
