package kr.co.meatbox.claim;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class ClaimApplicationTests {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	@Test
	void contextLoads() {
	}

	@Test
	public void testsqlSession() throws Exception {
		System.out.println("////////////"+sqlSessionTemplate.toString());
	}

}
