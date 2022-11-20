package springBootJpaTest.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class memberConroller {

    @GetMapping("memberPage")
    public String MemberPage() {
        return "Member/MemberPage.html";
    }
}
