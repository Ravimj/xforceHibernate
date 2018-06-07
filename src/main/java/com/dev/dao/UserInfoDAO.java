package com.dev.dao;

import com.dev.beans.UserInfo;

public interface UserInfoDAO {

	boolean  CreateProfile(UserInfo user);
	UserInfo login(int id,String pass);
	boolean UpdatePassword(int id,String Opassword,String npass, String npass2);
	boolean DeleteUser(int id,String password);
}
