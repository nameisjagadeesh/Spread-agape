package com.xworkz.spring.configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringConfigurtionOfColor {

	@Bean
	public String usecolor() {
		System.out.println("ruuning the use");
		String string = new String();
		return string;

	}

	@Bean("send")
	public String send() {
		System.out.println("ruuning the send");
		String string = new String();
		return string;

	}

	@Bean
	public String buyColor() {
		System.out.println("ruuning the buy");
		String string = new String();
		return string;

	}

	@Bean
	public String gift() {
		System.out.println("ruuning the giftIphone");
		String string = new String();
		return string;

	}

	@Bean
	public String looseColor() {
		System.out.println("ruuning the looseColor");
		String string = new String();
		return string;

	} 
	@Bean
	public Boolean isSafe() {
		System.out.println("ruuning the isSafe");
		Boolean ref = new Boolean(true);
		return ref;
	}

	@Bean
	public boolean isSecure() {
		System.out.println("ruuning the isSecure");
		Boolean ref2 = new Boolean(true);
		return ref2;
	}

	@Bean
	public boolean isCheap() {
		System.out.println("ruuning the isCheap");
		Boolean ref3 = new Boolean(true);

		return ref3;
	}

	@Bean
	public boolean isCopy() {
		System.out.println("ruuning the isCopy");
		Boolean ref4 = new Boolean(true);

		return ref4;
	}

	@Bean
	public boolean istoxic() {
		System.out.println("ruuning the toxic");
		Boolean ref5 = new Boolean(true);

		return ref5;
	}

	@Bean ("name")
	public StringBuilder colorName() {
		System.out.println("ruuning the colorName");
		StringBuilder build = new StringBuilder();
		return build;
	}

	@Bean
	public StringBuilder brandName() {
		System.out.println("ruuning the brandName");
		StringBuilder build1 = new StringBuilder();
		return build1;
	}

	@Bean
	public StringBuilder drawingName() {
		System.out.println("ruuning the drawingName");
		StringBuilder build2 = new StringBuilder();
		return build2;
	}

	@Bean
	public StringBuilder countryName() {
		StringBuilder build3 = new StringBuilder();
		System.out.println("ruuning the countryName");
		return build3;
	}

	@Bean
	public StringBuilder shopName() {
		StringBuilder build4 = new StringBuilder();
		System.out.println("ruuning the shopName");
		return build4;
	}
	@Bean
	public StringBuffer play() {
		System.out.println("ruuning the play");
		StringBuffer ref1 = new StringBuffer();
		return ref1;
	}
	@Bean
	public StringBuffer sing() {
		System.out.println("ruuning the sing");
		StringBuffer ref2 = new StringBuffer();
		return ref2;
	}
	@Bean
	public StringBuffer write() {
		System.out.println("ruuning the write");
		StringBuffer ref3 = new StringBuffer();
		return ref3;
	}
	@Bean
	public StringBuffer see() {
		System.out.println("ruuning the see");
		StringBuffer ref4 = new StringBuffer();
		return ref4;
	}
	@Bean
	public StringBuffer display() {
		System.out.println("ruuning the display");
		StringBuffer ref5 = new StringBuffer();
		return ref5;
	}
	@Bean ("rate")
	public Double rate() {
		System.out.println("running the rate");
		Double a = new Double(2);
		return a;
	}
	@Bean("stock")
	public Double stock() {
		System.out.println("running the stock");
		Double b = new Double(22);
		return b;
	}
	@Bean
	public Double free() {
		System.out.println("running the free");
		Double c = new Double(15);
		return c;
	}
	@Bean
	public Double won() {
		System.out.println("running the won");
		Double d = new Double(62);
		return d;
	}
	@Bean
	public Double buy() {
		System.out.println("running the buy");
		Double e = new Double(7);
		return e;
	}
	@Bean
	public ArrayList<String> list() {
		ArrayList<String> ref = new ArrayList<String>();
		ref.add("a");
		ref.add("b");
		ref.add("c");
		ref.add("d");
		ref.add("e");
		System.out.println(ref.size());
		return ref;

	}
	@Bean
	public Map<String, String> mapped() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("type", "ground");
		map.put("brand", "hexa");
		map.put("size", "large");
		map.put("bought via", "shop");
		map.put("total colors", "five");
		System.out.println(map.size());
		return map;

	}
}
