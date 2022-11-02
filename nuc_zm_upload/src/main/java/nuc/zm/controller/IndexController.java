package nuc.zm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 指数控制器
 * 路由
 * @author zm
 * @date 2022/10/26
 */
@Controller
public class IndexController {

    @GetMapping("/upload-index")
    public String upload() {
        return "upload";
    }
}
