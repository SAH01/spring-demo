import com.reliable.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test04 {
	public static void main(String[] args) {
		//main
	}
	@Test
	public void test04(){
		ApplicationContext context = new ClassPathXmlApplicationContext("beans_zhujie.xml");
		People people = context.getBean("people",People.class);
		System.out.println(people.toString());
		people.getCat().shout();
		people.getDog().shout();
	}
}
