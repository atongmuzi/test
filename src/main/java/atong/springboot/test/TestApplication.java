package atong.springboot.test;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@EnableSwagger2Doc
@SpringBootApplication
public class TestApplication {

//    @Resource
//    BannerTestService bannerTestService;

//    public void test(){
//        bannerTestService.testcase();
//    }

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);


    }

}
