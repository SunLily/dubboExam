package boot.dubboProvider;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest   
{
    public static void main(String[] args) throws IOException {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"dubbo-provider.xml"});
        context.start();
        System.out.println("启动成功");
        System.in.read(); // 按任意键退出
	}
}
