import com.reliable.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	public static void main(String[] args) {
		//用户实际调用的业务层，dao层不需要接触
//		UserService userService = new UserServiceImpl();
//		((UserServiceImpl) userService).setUserDao(new UserDaoOracleImpl());
//		userService.getUser();
		//获取CPX 解析xml文件 获得spring对象
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		//调用gerBean() 方法
		UserServiceImpl userServiceImpl= (UserServiceImpl) context.getBean("ServiceImpl");
		userServiceImpl.getUser();
	}
}
