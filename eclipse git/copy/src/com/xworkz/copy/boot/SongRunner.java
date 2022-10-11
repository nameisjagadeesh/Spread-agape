package com.xworkz.copy.boot;

import com.xworkz.copy.examples.Song;

public class SongRunner {

	public static void main(String[] args) {

		Song gana = new Song();
		System.out.println(gana.nameplay);
		gana.nameplay = "so long";
		System.out.println(gana.nameplay);

		Song bhashe = new Song();
		System.out.println(bhashe.language);
		gana.language = "English";
		System.out.println(gana.language);

		Song sungby = new Song();
		System.out.println(sungby.singer);
		sungby.singer = "Thomas pentz";
		System.out.println(sungby.singer);

		Song lyric = new Song();
		System.out.println(lyric.lyrics);
		lyric.lyrics = "so long been waiting for the day";
		System.out.println(lyric.lyrics);

		Song ref = new Song();
		System.out.println(ref.type);
		ref.type = "patho";
		System.out.println(ref.type);

	}

}
