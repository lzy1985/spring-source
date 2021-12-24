package com.study.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author lzy
 * @version 1.0.0
 * @date 2021/12/23 下午5:03
 * @Description
 */
public class Book implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    private String bookName;

    public Book(){
        System.out.println("Book constract invoke ");
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
        System.out.println("setBookName: Book name has set.");
    }


    @Override
    public void setBeanName(String name) {
        System.out.println("Book setBeanName invoke ");

    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Book setBeanFactory invoke ");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Book afterPropertiesSet.invoke ");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Book setApplicationContext.invoke ");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Book destroy invoke ");

    }

    // 自定义初始化方法
    @PostConstruct
    public void springPostConstruct(){
        System.out.println("@PostConstruct");
    }

    public void myPreDestory(){
        System.out.println("Book.myPreDestory invoke");
        System.out.println("---------------destroy-----------------");
    }

    // 自定义销毁方法
    @PreDestroy
    public void springPreDestory(){
        System.out.println("@PreDestory");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("------inside finalize-----");
    }
}
