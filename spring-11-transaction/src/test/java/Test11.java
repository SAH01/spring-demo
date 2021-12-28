import com.kuang.mapper.UserMapper;
import com.kuang.pojo.User;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test11 {
	public static void main(String[] args) {

	}
	@Test
	public void test01(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
		for (User user : userMapper.selectUser()) {
			System.out.println(user);
		}
	}
}
