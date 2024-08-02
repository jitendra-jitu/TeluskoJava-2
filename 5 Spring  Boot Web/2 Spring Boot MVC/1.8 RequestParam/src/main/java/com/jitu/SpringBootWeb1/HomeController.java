package com.jitu.SpringBootWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return  "index.jsp";
    }

    @RequestMapping("add")
    public String add(@RequestParam("num1") int a,@RequestParam("num2") int b, HttpSession session){

//        int num1= Integer.parseInt(req.getParameter("num1"));
//        int num2= Integer.parseInt(req.getParameter("num2"));

        int result=a+b;
        session.setAttribute("result",result);
        System.out.println(result);
        return "result.jsp";

//        <h2>Result is <%= session.getAttribute("result") %> </h2>
    }
}
