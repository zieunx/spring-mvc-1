package hello.servlet.basic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "HelloServlet", urlPatterns = "/hello") // 중복되지 않도록 주의
public class HelloServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        super.service(req, resp);
        System.out.println("HelloServlet.service");
        System.out.println("request = " + request);
        System.out.println("response = " + response);

        String username = request.getParameter("username");
        System.out.println("username = " + username);

        // response header setting
        response.setContentType("text/plain");
        response.setCharacterEncoding("utf-8");

        // response content writing
        response.getWriter().write("hello " + username);
    }

    /*
    * 서블릿이 http 요청을 개발자가 직접 파싱하지 않아도 접근할 수 있도록 만들어졌다.
    * */
}
