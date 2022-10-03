package spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;


public class myApp {
	private static ApplicationContext context1;

	public static void main(String[] args) {
		context1 = new ClassPathXmlApplicationContext("beans.xml");
		
		tamgiac tg = (tamgiac) context1.getBean("tamgiac");
		tg.inra();

		Hello msgHello = (Hello) context1.getBean("msgHello");
		msgHello.Inra();
		
		triangle mytamgiac = (triangle) context1.getBean("triangle");
		mytamgiac.inra();
		
		trianglepoint tgdiem = (trianglepoint) context1.getBean("pointTriangle");
		tgdiem.Inra();
		
		dstamgiac dstg=(dstamgiac) context1.getBean("dstg");
		dstg.inra();
		
		// TODO Auto-generated method stub

	}

}
