package hello;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class CrossFilter implements Filter {

    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) res;
        HttpServletRequest request = (HttpServletRequest) req;
        String origin = request.getHeader("Access-Control-Allow-Origin");
        response.setHeader("Access-Control-Allow-Origin", origin);
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE");
        response.setHeader("Access-Control-Allow-Headers", "accept, content-type");
        chain.doFilter(req, res);
        response.getHeader("origin");
//       // HeaderValues originHeader = exchange.getRequestHeaders().get("Origin");
//        ((HttpServletResponse) res).getHeaderNames().
//        String originHeaderValue = originHeader == null ? "*" : originHeader.getFirst();
//
//        next.handleRequest(exchange);
//        exchange.getResponseHeaders().add(new HttpString("Access-Control-Allow-Origin"), originHeaderValue)
//                .add(new HttpString("Access-Control-Allow-Credentials"), "true")
//                .add(new HttpString("Access-Control-Allow-Methods"), "POST, GET, OPTIONS, HEAD, PUT, DELETE")
//                .add(new HttpString("Access-Control-Allow-Headers"), "accept, content-type");
    }

    public void init(FilterConfig filterConfig) {}

    public void destroy() {}

}
