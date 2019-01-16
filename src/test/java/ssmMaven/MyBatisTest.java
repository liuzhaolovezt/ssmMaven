package ssmMaven;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lz.service.IStationService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring.xml", "classpath*:spring-mybatis.xml" })
public class MyBatisTest {

	@Autowired
	private IStationService sta;
	//ctrl +alt +1
	@Test
	public void  startToEndProce(){
		//ClassPathXmlApplicationContext beans = new ClassPathXmlApplicationContext(new String[]{"spring.xml","spring-mybatis.xml"});
		//System.err.println(beans+"-------------------");
		//IStationService sta =(IStationService) beans.getBean("stationService");
		System.err.println(sta+"================");
		Double dou = sta.startToEndProce("k339", "秦皇岛", "哈尔滨");
		System.out.println(dou);
	};
}
