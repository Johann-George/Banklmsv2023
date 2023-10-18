package com.johann.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.johann.Repo.ILoginRepo;
import com.johann.common.APIResponse;
import com.johann.model.Login;

@Service
public class LoginServiceImplementation implements ILoginService{
	@Autowired
	private ILoginRepo loginRepository;
	@Autowired
	private APIResponse apiResponse;
	
	@Override
	public APIResponse findUserByNameAndPassword(String userName,String password) {
		Login login=loginRepository.findUserByNameAndPassword(userName,password);
		if(login==null) {
			apiResponse.setStatus(401);
			apiResponse.setData("Invalid Credentials!!");
			return apiResponse;
		}
		
		Map<String, Object> data = new HashMap<String, Object>();
//		data.put("ACCESSTOKEN", token);
		data.put("roleId", login.getRole().getRoleID());
		data.put("RoleName", login.getRole().getRoleName());
		data.put("LoginName", login.getLoginName());

		apiResponse.setStatus(200);
		apiResponse.setData(data);
		
		return apiResponse;
	}
}
