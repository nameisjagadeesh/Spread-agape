package com.xworkz.access.things;

public class BillBoard {
	public String name="kvm posters";
	public Board board=new Board("school", "printed", true, 'B', "printedboard", "good morning", 62);
	
	public void printIt() {
		System.out.println(this.name);
		if (this.board != null) {

			System.out.println(this.board);
			System.out.println(board.name);
			System.out.println(board.type);
			System.out.println(board.longetivity);
			
			System.out.println(board.code);
			System.out.println(board.boardName);
			System.out.println(board.getTotalWords());
			System.out.println(board.totalBoards);
			
			

			System.out.println(board.getColor());
			board.setColor("blue");
			System.out.println("after modifying " + board.getColor());

			System.out.println(board.getTotalWords());
			board.setTotalWords(226541L);
			System.out.println("after modifying " + board.getTotalWords());

			System.out.println(board.getWidth());
			board.setWidth(52);

			System.out.println("after modifying " + board.getWidth());
			
			System.out.println(board.getPlace());
			board.setPlace("andrapradesh");

			System.out.println("after modifying " + board.getPlace());
			
		} else {
			System.out.println("board is null");
		}

	
	}

}
