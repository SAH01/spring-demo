import com.reliable.config.YConfig;
import com.reliable.y.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test06 {
	public static void main(String[] args) {
		//如果完全使用配置类方法去做，就要使用AnnotationConfigApplicationContext去获取对象加载
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(YConfig.class);
		User user = (User) context.getBean("getUser");
		System.out.println(user.toString());
	}
}
