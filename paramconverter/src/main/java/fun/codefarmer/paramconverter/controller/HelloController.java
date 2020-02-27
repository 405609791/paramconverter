package fun.codefarmer.paramconverter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @ @ClassName HelloController
 * @ Descriotion TODO
 * @ Author admin
 * @ Date 2020/2/27 16:19
 **/
@RestController
public class HelloController {

    @GetMapping("/hello")
    public void hello(Date date) {
        System.out.println(date);
    }

    @GetMapping("/hello2")
    public void hello2(String s) {
        System.out.println(s);
    }
}
