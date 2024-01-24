package sg.edu.nus.iss.cicddemo;


import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.apache.catalina.core.ApplicationContext;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CicdDemoApplicationTests {

	@Autowired
    private CicdDemoApplication applicationContext;
 
	@Test
	void contextLoads() {
		assertNotNull(applicationContext, "Application context should not be null");
	    }

}
