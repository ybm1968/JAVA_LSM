package Day07.EX05_BoardInterface;


public class Board extends Text {

	private int boardNo;

	
	// 생성자
	public Board() {
		this("제목없음", "글쓴이없음", "내용없음");
	}
	
	public Board(String title, String writer, String content) {
		
		super(title, writer, content);
		
	}

	// getter, setter
	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
		setNo(boardNo);
		// boardAccess 에서 매개변수를 Text값으로 받아서 text(board객체) 변수를 이용해서 데이터 베이스에 접근하기 때문에 		
		// setNo로 boardNo를 넘겨주지 않으면 text변수에서 boardNo와 같은 값이 no에 없기 떄문에ㅉ
		// setBoardNo를 하면서 boardNo 를 넘겨줄 때 같이 Text에 boardNo 를 같이 넘겨주면서 Text에 no변수에 저장한다
	}
	
}
