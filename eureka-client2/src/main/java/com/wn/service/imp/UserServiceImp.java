/**
 <p>Title: UserServiceImp.java</p>  
* <p>Description: </p>  
* <p>Company: www.woniuixy.com</p>  
* @author zhangjian
* @date 2019年7月20日  
 */
package com.wn.service.imp;

import com.wn.entity.Users;
import com.wn.mapper.UsersMapper;
import com.wn.service.UserService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
* @ClassName	UserServiceImp.java
* <p>Description： 请简单描述这是干什么的</p>  
* @author	zhangjian  
* @version		1.0
* @date 2019年7月20日  
 */
@Service
public class UserServiceImp implements UserService {
	@Resource
	private UsersMapper usersMapper;

	@Override
	public List<Users> select() throws Exception {
		System.out.println("数据层查询");
		return usersMapper.selectByExample(null);
	}

	@Override
	public Users selectById(int uid) throws Exception {
		return usersMapper.selectByPrimaryKey(uid);
	}

	@Override
	public void updateById(Users users) throws Exception {
		usersMapper.updateByPrimaryKeySelective(users);
	}

	@Override
	public void insert(Users users) throws Exception {
		usersMapper.insertSelective(users);
	}

	@Override
	public void deleteById(int uid) throws Exception {
		usersMapper.deleteByPrimaryKey(uid);
	}
}
