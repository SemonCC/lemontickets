/**
 <p>Title: UserService.java</p>  
* <p>Description: </p>  
* <p>Company: www.woniuixy.com</p>  
* @author zhangjian
* @date 2019年7月20日  
 */
package com.wn.eurekaclient1.service;


import com.wn.eurekaclient1.entity.Users;

import java.util.List;

/**
* @ClassName	UserService.java
* <p>Description： 请简单描述这是干什么的</p>  
* @author	zhangjian  
* @version		1.0
* @date 2019年7月20日  
 */
public interface UserService {
	//查询所有
	public List<Users> select() throws Exception;
	//根据主键查询
	public Users selectById(int uid) throws Exception;
	//根据主键修改
	public void updateById(Users users) throws Exception;
	//新增
	public void insert(Users users) throws Exception;
	//根据主键删除
	public void deleteById(int uid) throws Exception;
}
