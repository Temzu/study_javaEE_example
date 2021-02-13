//package com.temzu.filters;
//
//import javax.servlet.*;
//import javax.servlet.annotation.WebFilter;
//import java.io.IOException;
//
//@WebFilter(urlPatterns = "/*")
//public class HeaderFooterFilter implements Filter {
//
//    private transient FilterConfig filterConfig;
//
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//        this.filterConfig = filterConfig;
//    }
//
//    @Override
//    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
////        filterConfig.getServletContext().getRequestDispatcher("/header.html").include(request, response);
////        chain.doFilter(request, response);
////        filterConfig.getServletContext().getRequestDispatcher("/footer.html").include(request, response);
//    }
//
//    @Override
//    public void destroy() {
//
//    }
//}
