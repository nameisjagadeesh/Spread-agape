package com.xworkz.access.things;

public class BasketBall {
	public String brand="blueplay";
	public Ball ball=new Ball();
	
	public void play() {
		System.out.println(this.brand);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		if(this.ball!=null) {
			System.out.println(ball.getColor());
			ball.setColor("orange");
			System.out.println("updated color is"+ball.getColor());
			
			System.out.println(ball.getName());
			ball.setName("pink lady");
			System.out.println("updated color is"+ball.getName());
			
			System.out.println(ball.getTotalBalls());
			ball.setTotalBalls(123654L);
			System.out.println("updated total balls are"+ ball.getTotalBalls());

			System.out.println(ball.getType());
			ball.setType("juari");
			System.out.println("updated type is" + ball.getType());

			System.out.println(ball.isHard());
			ball.setHard(true);
			System.out.println("updated hard is" + ball.isHard());

			System.out.println(ball.getWeight());
			ball.setWeight(136);
			System.out.println("updated weight is" + ball.getWeight());

			System.out.println(ball.getPlace());
			ball.setPlace("ladhak");
			System.out.println("updated place is" + ball.getPlace());

			System.out.println(ball.getCode());
			ball.setCode('B');
			System.out.println("updated code is" + ball.getCode());

			System.out.println(ball.getCompany());
			ball.setCompany("vanball");
			System.out.println("updated type is" + ball.getCompany());

			System.out.println(ball.getBallTag());
			ball.setBallTag("beatit");
			System.out.println("updated weather is" + ball.getBallTag());

			System.out.println(ball.getQuantity());
			ball.setQuantity(236);
			System.out.println("updated quantity is" + ball.getQuantity());
		}
		else {
			System.out.println("ball is null");
		}
		
		}
	

}
