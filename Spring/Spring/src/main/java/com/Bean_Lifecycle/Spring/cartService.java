package com.Bean_Lifecycle.Spring;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class cartService implements BeanNameAware,ApplicationContextAware /*implements InitializingBean   DisposableBean*/{

    Map<Integer, String> mp;
    
    public cartService(){
        mp = new HashMap<>();
        System.out.println("cartService constructor called");
    }

    public void addToCart(){
        System.out.println("Added to cart");
    }

    // @Override
    // public void afterPropertiesSet() throws Exception{
    //     System.out.println("Initiallization callback.");
    //     mp.put(1,"krishna");
    //     mp.put(2,"kanhaiya");
    // }
    @PostConstruct
    public void start2(){
        System.out.println("Bean is ready");
        mp.put(1,"Nani");
        mp.put(2,"Nana");
    }

    // public void start(){
    //     mp.put(1,"Rahul");
    //     mp.put(2,"Riya");
    // }
    public String getvalue(int key){
        return mp.get(key);
    }
    @Override
    public void setBeanName(String name) {
        System.out.println("Bean name is: " + name);
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException{
        System.out.println(applicationContext.getDisplayName());
    }

    // @Override
    // public void destroy(){
    //     mp.clear();
    //     System.out.println("Bean destroy");
    // }
    // public void stop(){
    //     mp.clear();
    //     System.out.println("bean destroy");
    // }

    @PreDestroy
    public void stop(){
        mp.clear();
        System.out.println("Bean is getting destroyed");
    }

}
