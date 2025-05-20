package in.abc.Test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.abc.bean.EngCourse;

public class ClientApp {

	public static void main(String[] args) {

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		
		reader.loadBeanDefinitions("in/abc/cfg/applicationContext.xml");
				
		EngCourse course0 = factory.getBean("in.abc.bean.EngCourse#0", EngCourse.class);
		System.out.println(course0);
		
		System.out.println();
		
		EngCourse course1 = factory.getBean("in.abc.bean.EngCourse#1", EngCourse.class);
		System.out.println(course1);
		
		System.out.println();
		
		EngCourse course2 = factory.getBean("in.abc.bean.EngCourse#2", EngCourse.class);
		System.out.println(course2);
		
	}
}
