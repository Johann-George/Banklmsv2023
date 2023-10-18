package com.johann.service;

import com.johann.common.APIResponse;

public interface ILoginService {
	public APIResponse findUserByNameAndPassword(String userName,String password);
}
