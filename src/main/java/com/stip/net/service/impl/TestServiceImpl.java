package com.stip.net.service.impl;

import com.stip.mybatis.generator.plugin.BaseService;
import com.stip.net.entity.Test;
import com.stip.net.example.TestExample;
import com.stip.net.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl extends BaseService<Test, TestExample, String> implements TestService {
}