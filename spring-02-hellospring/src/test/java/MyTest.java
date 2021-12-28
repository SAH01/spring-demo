import com.reliable.pojo.Hello;
import com.reliable.pojo.User;
import com.reliable.pojo.User1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	public static void test(){
		//解析beans.xml文件 , 生成管理相应的Bean对象
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		//getBean : 参数即为spring配置文件中bean的id值
//		Hello hello = (Hello) context.getBean("Hello");
//		hello.show();
		User user= (User) context.getBean("new_user");
		user.show();
		User1 user1 = (User1) context.getBean("User1");
		user1.show();
	}
	public static void main(String[] args) {
		MyTest.test();
	}
}
