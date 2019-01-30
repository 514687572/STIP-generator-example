package com.stip.net.service;

import com.stip.mybatis.generator.plugin.IService;
import com.stip.net.entity.Test;
import com.stip.net.example.TestExample;

 /**
 * Extensible custom interface
 **/
public interface TestService extends IService<Test, TestExample, String> {
}