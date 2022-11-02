package com.xworkz.access.boot;

import com.xworkz.access.things.BillBoard;
import com.xworkz.access.things.Board;

public class BillBoardRunner {

	public static void main(String[] args) {
		BillBoard billBoard=new BillBoard();
		Board board=new Board("school", "printed", true, 'B', "printedboard", "good morning", 62);
		System.out.println(billBoard.name);
		System.out.println(billBoard.board);
		System.out.println(board.getColor());
		System.out.println(board.getPlace());
		System.out.println(board.getTotalWords());
		System.out.println(board.getWidth());
		
		billBoard.printIt();
	}

}
