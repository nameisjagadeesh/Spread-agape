<<<<<<< HEAD
package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configuration.BeanInititalisationSConfig;
import com.xworkz.spring.things.Actor;
import com.xworkz.spring.things.Rocket;
import com.xworkz.spring.things.Season;

public class BeanInititRunner {

	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(BeanInititalisationSConfig.class);
		Actor refOfActor = container.getBean("actor", Actor.class);
		System.out.println(refOfActor);
		System.out.println(refOfActor.getLanguage());
		System.out.println(refOfActor.getName());
		System.out.println(refOfActor.getAge());
		System.out.println("~~~~~~~~");
		Actor refOfActor2 = container.getBean("act", Actor.class);
		System.out.println(refOfActor2);
		System.out.println(refOfActor2.getLanguage());
		System.out.println(refOfActor2.getName());
		System.out.println(refOfActor2.getAge());
		System.out.println("~~~~~~~~");
		Rocket refOfRocket = container.getBean("rocket", Rocket.class);
		System.out.println(refOfRocket);
		System.out.println(refOfRocket.getCountry());
		System.out.println(refOfRocket.getName());
		System.out.println(refOfRocket.getBudget());
		System.out.println("~~~~~~~~");
		Rocket refOfRocket2 = container.getBean("launch", Rocket.class);
		System.out.println(refOfRocket2);
		System.out.println(refOfRocket2.getCountry());
		System.out.println(refOfRocket2.getName());
		System.out.println(refOfRocket2.getBudget());
		System.out.println("~~~~~~~~~");
		Season refOfSeason = container.getBean("shower", Season.class);
		System.out.println(refOfSeason);
		System.out.println(refOfSeason.getName());
		System.out.println(refOfSeason.getStartinMonth());
		System.out.println(refOfSeason.getDuration());
		System.out.println("~~~~~~~~~~");
		Season refOfSeason2 = container.getBean("season", Season.class);
		System.out.println(refOfSeason2);
		System.out.println(refOfSeason2.getName());
		System.out.println(refOfSeason2.getStartinMonth());
		System.out.println(refOfSeason2.getDuration());
	}

}
=======
package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configuration.BeanInititalisationSConfig;
import com.xworkz.spring.things.Actor;
import com.xworkz.spring.things.Rocket;
import com.xworkz.spring.things.Season;

public class BeanInititRunner {

	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(BeanInititalisationSConfig.class);
		Actor refOfActor = container.getBean("actor", Actor.class);
		System.out.println(refOfActor);
		System.out.println(refOfActor.getLanguage());
		System.out.println(refOfActor.getName());
		System.out.println(refOfActor.getAge());
		System.out.println("~~~~~~~~");
		Actor refOfActor2 = container.getBean("act", Actor.class);
		System.out.println(refOfActor2);
		System.out.println(refOfActor2.getLanguage());
		System.out.println(refOfActor2.getName());
		System.out.println(refOfActor2.getAge());
		System.out.println("~~~~~~~~");
		Rocket refOfRocket = container.getBean("rocket", Rocket.class);
		System.out.println(refOfRocket);
		System.out.println(refOfRocket.getCountry());
		System.out.println(refOfRocket.getName());
		System.out.println(refOfRocket.getBudget());
		System.out.println("~~~~~~~~");
		Rocket refOfRocket2 = container.getBean("launch", Rocket.class);
		System.out.println(refOfRocket2);
		System.out.println(refOfRocket2.getCountry());
		System.out.println(refOfRocket2.getName());
		System.out.println(refOfRocket2.getBudget());
		System.out.println("~~~~~~~~~");
		Season refOfSeason = container.getBean("shower", Season.class);
		System.out.println(refOfSeason);
		System.out.println(refOfSeason.getName());
		System.out.println(refOfSeason.getStartinMonth());
		System.out.println(refOfSeason.getDuration());
		System.out.println("~~~~~~~~~~");
		Season refOfSeason2 = container.getBean("season", Season.class);
		System.out.println(refOfSeason2);
		System.out.println(refOfSeason2.getName());
		System.out.println(refOfSeason2.getStartinMonth());
		System.out.println(refOfSeason2.getDuration());
	}

}
>>>>>>> 70f14a1768c537cc2a80f7c209f7829cf6dc8834
