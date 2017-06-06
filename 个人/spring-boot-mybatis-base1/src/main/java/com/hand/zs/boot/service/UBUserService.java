package com.hand.zs.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hand.zs.boot.dao.UBUserDao;
import com.hand.zs.boot.entity.UBUser;

@Service
public class UBUserService {
	@Autowired
	private UBUserDao uBUserDao;

	public List<UBUser> findAllUsers() {

		return uBUserDao.findAllUser();
	}

}
