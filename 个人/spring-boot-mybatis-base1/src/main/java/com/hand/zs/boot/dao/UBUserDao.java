package com.hand.zs.boot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hand.zs.boot.entity.UBUser;

@Mapper
public interface UBUserDao {

	/**
	 * 查找所有用户
	 * 
	 * @return
	 */
	public List<UBUser> findAllUser();

	/**
	 * 根据用户ID查找用户
	 * 
	 * @param userId
	 * @return
	 */
	public UBUser findUserById(Integer userId);

	/**
	 * 根据用户id修改用户信息
	 * 
	 * @param userId
	 * @return
	 */
	public int updateUserInfoById(UBUser userEn);

	/**
	 * 新增用户
	 * 
	 * @param userEn
	 * @return
	 */
	public int insertNewUser(UBUser userEn);
}
