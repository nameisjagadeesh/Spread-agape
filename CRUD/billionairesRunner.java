class billionairesRunner{
	public static void main(String[] rudra)
	{
		billionaires.save("warrenBuffet");
		billionaires.save("elonMusk");
		billionaires.save("anilambani");
		billionaires.save("gauthamadani");
		billionaires.save("jeffbezos");
		billionaires.save("billgates");
		billionaires.save("larryellison");
		billionaires.save("sergeybrin");
		billionaires.save("jimwalton");
		billionaires.save("steveballmer");
		billionaires.display();
		billionaires.find("elonMusk");
		billionaires.update("rob","alice");
		billionaires.update1(2,"christian");
		billionaires.delete("jeffbezos");
		billionaires.delete1(6,"larryellison");
		billionaires.display();
	}
	
	
}