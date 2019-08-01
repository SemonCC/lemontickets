package com.wn.eurekaclient1.controller;
import javax.annotation.Resource;
import com.wn.eurekaclient1.entity.Result;
import com.wn.eurekaclient1.entity.Users;
import com.wn.eurekaclient1.service.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Value("${server.port}")
    private String port;

    @Resource
    private UserService us;
    
    @GetMapping("/getInfo/{name}")
    public String getInfo(@PathVariable String name){
        return "port:"+port+",name:"+name;
    }
    
    @GetMapping("/select")
    public Result select() throws Exception{
    	System.out.println("client1层查询");
    	Result result = new Result();
    	List<Users> list = us.select();
    	System.out.println(list.size());
    	if(list.size() > 0) {
    		result.setList(list);
    		result.setCode("success");
    	}else {
    		result.setMessage("error");
    	}
    	return result;
    }
    
    @GetMapping("/selectById/{uid}")
    public Result selectById(@PathVariable("uid") int uid) throws Exception{
    	System.out.println("uid= " + uid);
    	Result result = new Result();
    	Users users = us.selectById(uid);
    	if(users != null) {
    		result.setObject(users);
    		result.setCode("success");
    	}else {
    		result.setMessage("error");
    	}
    	return result;
    }
    
//    @GetMapping("/updateById/{password}/{uid}")
//    public Result updateById(@PathVariable("password") String password, @PathVariable("uid") int uid) throws Exception{
//    	Users users = new Users();
//    	users.setUid(uid);
//    	users.setPassword(password);
//    	Result result = new Result();
//    	us.updateById(users);
//    	result.setCode("success");
//    	return result;
//    }
//    @PostMapping("updateById")
//    public Result updateById(@RequestBody Users users) throws Exception{
//    	System.out.println(users.getUsername());
//    	Result result = new Result();
//    	us.updateById(users);
//    	result.setCode("success");
//    	return result;
//    }
    @PutMapping("updateById")
    public void updateById(@RequestBody Users users) throws Exception{
    	System.out.println(users.getUsername());
    	us.updateById(users);
    }
	@PostMapping("insert")
	public Result insert(@RequestBody Users users) throws Exception{
		System.out.println("新增" + users.getUsername());
		us.insert(users);
		Result result = new Result();
		result.setCode("success");
		return result;
	}
	@DeleteMapping("/deleteById/{uid}")
	public Result deleteById(@PathVariable("uid") int uid) throws  Exception{
		System.out.println("删除uid= " + uid);
		Result result = new Result();
		us.deleteById(uid);
		result.setCode("success");
		return result;
	}
}