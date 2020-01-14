package life.majiang.community.controller;

        import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RequestParam;

@Controller //Controller meaning 允许该类接受前端请求
public class IndexController {
    @GetMapping("/")
    public String index(){
        return "index";
    }
}
