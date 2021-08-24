package cn.spring.debugger;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @desc：
 * @author：xiaojingyu
 * @ClassName：SpringDebugger
 * @ProjectName：springSource
 * @date：Created in 2021/5/20 16:36
 * @Copyright(c)：tellyes tech. inc. co.,ltd
 */

public class SpringDebugger {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");

        RefectTest refectTest = (RefectTest) ac.getBean("refectTest");
        refectTest.test();
    }

}
