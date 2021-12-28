import com.kuang.dao.UserMapper;
import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test10 {
	public static void main(String[] args) {

	}
	@Test
	public void selectUser() throws IOException {
		SqlSession sqlSession = MybatisUtils.getSession();
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		List<User> userList = mapper.selectUser();
		for (User user: userList){
			System.out.println(user);
		}
		sqlSession.close();
	}

	@Test
	public void test2(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserMapper mapper = (UserMapper) context.getBean("userMapper");
		List<User> user = mapper.selectUser();
		System.out.println(user);
	}

	@Test
	public void test3(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserMapper mapper = (UserMapper) context.getBean("userMapper2");
		List<User> user = mapper.selectUser();
		System.out.println(user);
	}
}
