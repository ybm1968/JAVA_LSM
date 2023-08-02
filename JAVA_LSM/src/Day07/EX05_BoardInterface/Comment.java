package Day07.EX05_BoardInterface;

import java.util.Date;

public class Comment extends Text {
	
	private int commentNo;
	
	public Comment() {
		this("글쓴이없음" , "내용없음");
	}

	public Comment(String writer, String content) {
		super(writer, content);
	}

	public int getCommentNo() {
		return commentNo;
	}

	public void setCommentNo(int commentNo) {
		this.commentNo = commentNo;
	}

	
}
