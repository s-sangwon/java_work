package board.model.vo;

import java.util.Comparator;

public class AscBoardNo implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		int b1 = ((Board)o1).getBoardNo();
		int b2 = ((Board)o2).getBoardNo();
		
		return b1-b2;
	}

}
