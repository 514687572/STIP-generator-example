package com.stip.net.dao;

import com.stip.mybatis.generator.plugin.GenericMapper;
import com.stip.net.entity.Test;
import com.stip.net.example.TestExample;

 /**
 * 可添加自定义查询语句，方便后续扩展
 **/
public interface TestDao extends GenericMapper<Test, TestExample, Integer> {
}