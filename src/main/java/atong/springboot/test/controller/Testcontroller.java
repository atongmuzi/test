package atong.springboot.test.controller;

import atong.springboot.test.mapper.BannerMapper;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import atong.springboot.test.dto.testDTO;


@Api(tags = {"测试管理","教学管理"})
@Controller
public class Testcontroller {
    @Autowired
    HttpServletRequest request;
    @Resource
    BannerMapper bannerMapper;
    @Resource
    ApplicationContext applicationContext;
    @Resource
    Environment environment;

    @PostMapping(value = "/postbean")
    @ResponseBody
    public String postbean(User user){
        request.setAttribute("user",user);
        return "{\n" +
                " \"code\":1,\n" +
                " \"httpCode\":200,\n" +
                " \"responseEntity\":{\n" +
                "  \"currentPage\":1,\n" +
                "  \"first\":true,\n" +
                "  \"hasNext\":false,\n" +
                "  \"hasPrev\":false,\n" +
                "  \"last\":true,\n" +
                "  \"nextPage\":1,\n" +
                "  \"pageCount\":1,\n" +
                "  \"pageData\":[\n" +
                "   {\n" +
                "    \"id\":13,\n" +
                "    \"isAll\":true,\n" +
                "    \"limitName\":\"s2\",\n" +
                "    \"limitNum\":10.0,\n" +
                "    \"limitUnit\":\"s\"\n" +
                "   },\n" +
                "   {\n" +
                "    \"id\":12,\n" +
                "    \"isAll\":true,\n" +
                "    \"limitName\":\"s1\",\n" +
                "    \"limitNum\":10.0,\n" +
                "    \"limitUnit\":\"s\"\n" +
                "   }]}}\n" +
                "\n";
    }
//    @RequestMapping(value = "/getId")
//    @ResponseBody
//    public String getId(){
//        testDTO t = new testDTO();
//       t.setName("atong");
//       Integer id= bannerMapper.findId();
//       Integer insertId = bannerMapper.insert(t);
//       Boolean port = this.environment.containsProperty("server.port");
//       String url1 = this.environment.getProperty("spring.my-list.url[0]");
//       String url2 = this.environment.getProperty("spring.my-list.url[1]");
//        return id+" hahaha"+" "+insertId;
//    }
}
