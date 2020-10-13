package atong.springboot.test;
import atong.springboot.test.dto.testDTO;
import atong.springboot.test.mapper.BannerMapper;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.annotation.Resource;


@SpringBootTest
public class TestApplicationTests extends AbstractTestNGSpringContextTests {
//
//    @Resource
//    BannerMapper bannerMapper;
//    @Resource
//    Environment env;

    @BeforeClass
    public void setParam(){

    }
    @Test
    public void contextLoads() {
//        Integer id= bannerMapper.findId();
//        System.out.println(id+"hahaha");
//        testDTO t = new testDTO();
//        t.setName("hahaha1");
//    //    Integer insertId = bannerMapper.insert(t);
//        Boolean isPort =this.env.containsProperty("server.port");
//        String url1 = this.env.getProperty("spring.my-list.url[0]");
//        String url2 = this.env.getProperty("spring.my-list.url[1]");
//        System.out.println(isPort + " " + url1 + " "+url2);
        System.out.println("ahhahha");
        System.out.println("ahhahha");
        System.out.println("ahhahha");
        System.out.println("ahhahha");
        System.out.println("ahhahha");





    }
}
