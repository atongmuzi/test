package atong.springboot.test.controller;


import atong.springboot.test.dto.UserDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.*;

@Api(tags = {"用户管理"})
@RestController
@RequestMapping(value="/users")     // 通过这里配置使下面的映射都在/users下
public class UserController {
    // 创建线程安全的Map
    static Map<Long, UserDTO> users = Collections.synchronizedMap(new HashMap<Long, UserDTO>());

//    @RequestMapping(value="/", method= RequestMethod.GET)
//    @ApiOperation(value = "获取用户列表")
//    public List<UserDTO> getUserList() {
//        // 处理"/users/"的GET请求，用来获取用户列表
//        // 还可以通过@RequestParam从页面中传递参数来进行查询条件或者翻页信息的传递
//        List<UserDTO> r = new ArrayList<UserDTO>(users.values());
//        return r;
//    }

    @RequestMapping(value="/", method=RequestMethod.POST)
    @ApiOperation(value = "创建用户", notes = "根据User对象创建用户",tags = "教学管理")
    public String postUser(@Valid @ModelAttribute UserDTO user) {
        // 处理"/users/"的POST请求，用来创建User
        // 除了@ModelAttribute绑定参数之外，还可以通过@RequestParam从页面中传递参数
        users.put(user.getId(), user);
        return "success";
    }

    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    @ApiImplicitParam(paramType = "path", dataType = "Long", name = "id", value = "用户编号", required = true, example = "1")
    @ApiOperation(value = "更新用户详细信息", notes = "根据url的id来指定更新对象，并根据传过来的user信息来更新用户详细信息")
    public UserDTO getUser(@PathVariable Long id) {
        // 处理"/users/{id}"的GET请求，用来获取url中id值的User信息
        // url中的id可通过@PathVariable绑定到函数的参数中
        return users.get(id);
    }

    @RequestMapping(value="/{id}", method=RequestMethod.PUT)
    public String putUser(@PathVariable Long id, @ModelAttribute UserDTO user) {
        // 处理"/users/{id}"的PUT请求，用来更新User信息
        UserDTO u = users.get(id);
        u.setName(user.getName());
        u.setAge(user.getAge());
        users.put(id, u);
        return "success";
    }

    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    @ApiOperation(value = "删除用户", notes = "根据url的id来指定删除对象")
    public String deleteUser(@PathVariable Long id) {
        // 处理"/users/{id}"的DELETE请求，用来删除User
        users.remove(id);
        return "success";
    }
}
