package com.spring.springV2cleanStructure.filters;

import org.slf4j.MDC;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;
import java.util.UUID;

@Component
@Order(1) // 1 means higher priority and is implemented first if there is more than one filter
public class logFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        String correlationId = UUID.randomUUID().toString();
        MDC.put("IP-Address", request.getRemoteAddr());
        MDC.put("USER-Host", request.getRemoteHost());
        MDC.put("-Request-Attrs", request.getAttributeNames().toString());
        MDC.put("correlationId-from-filter",correlationId);
        filterChain.doFilter(request,response);
        MDC.clear();
    }
}
