package com.xworkz.access.boot;

import com.xworkz.access.things.Guitar;
import com.xworkz.access.things.Music;

public class guitarRunner {

	public static void main(String[] args) {
          Music music=new Music();
          Guitar guitar=new Guitar();
          System.out.println(music.name);
  		System.out.println(music.guitar);
  		System.out.println(guitar.getCode());
  		System.out.println(guitar.getColor());
  		System.out.println(guitar.getGuitarName());
  		System.out.println(guitar.getPrice());
  		System.out.println(guitar.getType());
  		System.out.println(guitar.isDurable());
  		System.out.println(guitar.getWeight());
  		System.out.println(guitar.getPoducer());
  		System.out.println(guitar.getLocation());
  		System.out.println(guitar.getBrand());
  		System.out.println(guitar.getStrings());
  		music.playMusic();
	}

}
