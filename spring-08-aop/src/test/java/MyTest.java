import com.reliable.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	@Test
	public void test(){
		//动态代理接口
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		UserService userService = (UserService) context.getBean("userService");
		userService.add();
	}
}