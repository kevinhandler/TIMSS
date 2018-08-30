package com.yc.tims;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.yc.tims.dao.TimsEmpMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TimsApplicationTests {
	@Autowired
	private TimsEmpMapper mapper;
	@Test
	public void contextLoads() {
//		System.out.println(mapper.selectByPrimaryKey(1));
	}

}
