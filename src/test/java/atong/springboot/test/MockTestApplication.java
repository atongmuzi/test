package atong.springboot.test;

import atong.springboot.test.controller.UserController;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@SpringBootTest
public class MockTestApplication  extends AbstractTestNGSpringContextTests {

    private MockMvc mvc;

    @BeforeClass
    public void setUp(){
        mvc = MockMvcBuilders.standaloneSetup(new UserController()).build();
    }

    @Test
    public void testUserController() throws Exception{

    }
}
