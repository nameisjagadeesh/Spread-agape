package com.xworkz.springautowired.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springautowired.bean.Engine;
import com.xworkz.springautowired.bean.Ghost;
import com.xworkz.springautowired.bean.NewsPaper;
import com.xworkz.springautowired.bean.Snake;

public class BeanRunner {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AutowiredConfiguration.class);
		// here context will call the tostring

		NewsPaper news = context.getBean(NewsPaper.class);
		System.out.println(news);
		System.out.println("~~~~~snake~~~~~");
		Snake snake = context.getBean(Snake.class);
		System.out.println(snake);
		System.out.println("~~~~~engine~~~~~");
		Engine engine = context.getBean(Engine.class);
		System.out.println(engine);
		System.out.println("~~~~~ghost~~~~~");
		Ghost ghost = context.getBean(Ghost.class);
		System.out.println(ghost);
	}

}
