package board.model.vo;

import java.util.Comparator;

public class DescBoardTitle implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		int result=0;
		if(o1 instanceof Board && o2 instanceof Board)
			result = ((Board)o1).getBoardTitle().compareTo( ((Board)o2).getBoardTitle() );
		
		return -result;
	}

}
