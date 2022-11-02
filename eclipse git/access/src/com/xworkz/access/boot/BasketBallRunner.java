package com.xworkz.access.boot;

import com.xworkz.access.things.Ball;
import com.xworkz.access.things.BasketBall;

public class BasketBallRunner {

	public static void main(String[] args) {
		BasketBall basketBall = new BasketBall();
		Ball ball = new Ball();
		System.out.println(basketBall.brand);
		System.out.println(basketBall.ball);
		System.out.println(ball.getCode());
		System.out.println(ball.getColor());
		System.out.println(ball.getName());
		System.out.println(ball.getTotalBalls());
		System.out.println(ball.getType());
		System.out.println(ball.isHard());
		System.out.println(ball.getWeight());
		System.out.println(ball.getPlace());
		System.out.println(ball.getBallTag());
		System.out.println(ball.getCompany());
		System.out.println(ball.getQuantity());
		basketBall.play();
	}

}
