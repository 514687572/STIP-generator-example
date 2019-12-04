package com.stip.net.controller;

import com.stip.mybatis.generator.plugin.BaseExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stip.net.base.StipResponse;
import com.stip.net.service.TestService;

@RequestMapping("/test")
@RestController
public class TestController {
	
	@Autowired
	private TestService testService;
	
	@GetMapping("/getUserInfo")
    public StipResponse getUserInfo() {
		BaseExample example=new BaseExample();
		example.createCriteria().addCriterion(" test_id =1");
		testService.selectByExample(example);
		
		return StipResponse.success("success");
    }

}
