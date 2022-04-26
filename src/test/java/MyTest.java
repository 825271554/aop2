import com.kuang.service.UserServierImpl;
import com.kuang.service.UserSevice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserSevice bean = (UserSevice) context.getBean("userService");
        bean.add();

    }


}
