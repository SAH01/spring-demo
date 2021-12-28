import com.reliable.y.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test05 {
	public static void main(String[] args) {

	}
	@Test
	public void test05(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		User user = context.getBean("user", User.class);
		System.out.println(user.name);
	}
}

