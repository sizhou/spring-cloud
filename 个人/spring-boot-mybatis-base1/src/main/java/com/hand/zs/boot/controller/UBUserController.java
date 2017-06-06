package com.hand.zs.boot.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.jboss.logging.Logger;

import com.hand.zs.boot.entity.UBUser;
import com.hand.zs.boot.service.UBUserService;

@Controller
@RequestMapping("/user")
public class UBUserController {

	@Autowired
	private UBUserService ubUserService;

	@RequestMapping(value = "/findAllUser", method = RequestMethod.GET, produces = "application/json;charset=utf-8")
	@ResponseBody
	public String findAllUser() {
		List<UBUser> resultList = ubUserService.findAllUsers();
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(SerializationConfig.Feature.INDENT_OUTPUT,
				Boolean.TRUE);
		try {
			String json = mapper.writeValueAsString(resultList);
			return json;
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;

	}

}
