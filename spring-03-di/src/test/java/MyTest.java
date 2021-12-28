import com.reliable.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	public static void main(String[] args) {
//		ApplicationContext context= new ClassPathXmlApplicationContext("beans03.xml");
//		Student student = (Student)context.getBean("Student");
//		System.out.println(student.toString());
	}

	@Test
	public void test2(){
		ApplicationContext context=new ClassPathXmlApplicationContext("beans03.xml");
		User user = context.getBean("user", User.class);
		System.out.println(user);
		User user2 = context.getBean("user2", User.class);
		System.out.println(user2);
	}

}
