package com.wn.serviceribbon1.controller;

import javax.annotation.Resource;
import com.wn.serviceribbon1.entity.Result;
import com.wn.serviceribbon1.entity.Users;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {
    @Resource
    private RestTemplate restTemplate;
    
    @GetMapping("/ribbon1/{name}")
    public String getInfo(@PathVariable String name){
    	return restTemplate.getForObject("http://eureka-client1/getInfo/"+name,String.class);
    }
    
    @GetMapping("/user")
    public Result select() throws Exception{
    	System.out.println("ribbon层查询");
    	return restTemplate.getForObject("http://eureka-client1/select/", Result.class);
    }
    
    @GetMapping("/selectById/{uid}")
    public Result selectById(@PathVariable("uid") int uid) throws Exception{
    	System.out.println("ribbon层id查询");
    	return restTemplate.getForObject("http://eureka-client1/selectById/" + uid, Result.class);
    }


    @GetMapping("/updateById")
    public Result updateById(Users users) throws Exception{
    	System.out.println("ribbon层修改");
    	restTemplate.put("http://eureka-client1/updateById", users, Result.class);
    	Result result = new Result();
    	result.setCode("success");
    	return result;
    }

    @PostMapping("/insert")
    public Result insert(Users users) throws Exception{
        System.out.println("ribbon层新增");
        return restTemplate.postForObject("http://eureka-client1/insert",users, Result.class);
    }

    @DeleteMapping("/deleteById/{uid}")
    public Result deleteById(@PathVariable("uid") int uid) throws Exception{
        System.out.println("ribbon层删除uid=" + uid);
        restTemplate.delete("http://eureka-client1/deleteById/" + uid);
        Result result = new Result();
        result.setCode("success");
        return result;
    }
}
