package Day07.EX05_BoardInterface;

// 질문라인번호 - 182번 잘못적은건가?

import java.util.Date;
import java.util.Scanner;

/*
 * 게시판 프로그램
 * - 메뉴판
 * - 게시글 목록
 * - 게시글 읽기
 * - 게시글 쓰기
 * - 게시글 수정
 * - 게시글 삭제
 */

// Main 클래스를 객체로 만들지 않고 static으로 선언되지 않았기 떄문에
// Main 클래스 안에 있는 변수들과 메소드는 전부 static으로 선언해서
// 객체를 생성하지 않아도 메모리가 할당되어 있기 때문에 사용이 가능하다.
// Main 클래스를 static으로 선언하고 변수들과 메소드를 
// static으로 선언하지 않아도 똑같이 동작을 할까????
public class Main {

	static int max = 10;							// 게시글 최대 개수
	static Text[] boardList = new Board[max];		// 게시글 목록
	static Text[] commentList = new Comment[max];	// 댓글 목록
	static Scanner sc = new Scanner(System.in);
	static DataService data = new BoardAccess(); 	//데이터베이스 접근 객체(게시글)
	static DataService data2 = new CommentAccess(); //데이터베이스 접근 객체(댓글)
	
	// 메뉴판
	public static void menu() {
		System.out.println("###### 게시판 ######");
		System.out.println("1. 게시글 목록");
		System.out.println("2. 게시글 읽기");
		System.out.println("3. 게시글 쓰기");
		System.out.println("4. 게시글 수정");
		System.out.println("5. 게시글 삭제");
		System.out.println("6 댓글 쓰기");
		System.out.println("7 댓글 수정");
		System.out.println("8 댓글 삭제");
		System.out.println("0. 프로그램 종료");
		System.out.print("######## 번호 입력 : ");
	}
	
	// 게시글 목록
	public static void list() {
		System.out.println("#### 게시글 목록 ####");
		boardList = data.selectList();
		for (Text board : boardList) {
			if(board == null) {
				System.out.println("(게시글 없음)");
				continue;		
			}
		
			int boardNo = board.getNo();		// getBoardNo 대신에 getNo를 쓴이유  
			String title = board.getTitle();	// : board변수는 board 자료형이 아니라 Text 자료형이기 떄문에	
			String writer = board.getWriter();	// getBoardNo 메소드를 사용하지 못하고
			Date regDate = board.getRegDate();  // getNo를 사용할 수 있어서 getNo를 통해서 boardNo를 알 수 있다.
			
			System.out.println("(" + boardNo + ") \t | " + title + " \t | " 
					+ writer + " \t | " + regDate);
		}
	}
	
	
	// 게시글 읽기 
	public static void read() {
		System.out.println("#### 게시글 읽기 ####");
		System.out.print("글 번호 : ");
		int boardNo = sc.nextInt();
		Text board = data.select(boardNo);
		
		String title = board.getTitle();
		String writer = board.getWriter();
		String content = board.getContent();
		Date regDate = board.getRegDate();
		Date upDate = board.getUpdDate();
		
		
		System.out.println("# 글번호 : " + boardNo + " ############# ");
		System.out.println("# 제목 : " + title);
		System.out.println("# 작성자 : " + writer);
		System.out.println("#" + content);
		System.out.println("# - 등록일자 : " + regDate);
		System.out.println("# - 수정일자 : " + upDate);
		System.out.println("###################################");
		System.out.println();
		
		// 해당 글의 댓글 목록
		commentList = data2.selectList(boardNo);
		
		System.out.println("------[댓글 목록]------");
		for (int i = 0; i < commentList.length; i++) {
			if(commentList[i] == null ) continue;		// break 써도 되지않나?
			
			int commentNo = commentList[i].getNo();
			String commentWriter = commentList[i].getWriter();
			String commentContent = commentList[i].getContent();
			Date commentRegDate = commentList[i].getRegDate();
			Date commentUpdDate = commentList[i].getUpdDate();
			
			
			System.out.println("=======================================");
			System.out.println("(" + commentNo + ") - [" + commentWriter + "]");
			System.out.println("# : " + commentContent);
			System.out.println("# - 등록일자 : " + commentRegDate);
			System.out.println("# - 수정일자 : " + commentUpdDate);
			System.out.println("=======================================");
		}
		
	}
	
	// 게시글 쓰기
	public static void write() {
		System.out.println("#### 게시글 쓰기 ####");
		
		Board board = input();
		
		int result = data.insert(board);
		if(result > 0) {
			System.out.println("게시글이 작성되었습니다.");
		}
	}
	
	// 게시글 수정
	public static void update() {
		System.out.println("#### 게시글 수정 ####");
		System.out.print("게시글 번호 : ");
		int boardNo = sc.nextInt();
		sc.nextLine();
		
		Board board = input();
		board.setBoardNo(boardNo);
		
		int result = data.update(board);
		
		if(result > 0) {
			System.out.println("게시글이 수정되었습니다.");
		}
	}
	
	// 게시글 삭제
	public static void delete() {
		System.out.println("#### 게시글 삭제 ####");
		System.out.print("게시글 번호 : ");
		int boardNo = sc.nextInt();
		sc.nextLine();
		
		int result = data.delete(boardNo);
		if(result > 0) {
			System.out.println("게시글이 삭제되었습니다.");
		}
	}
	
	// 게시글 정보 입력
	public static Board input() {
		System.out.print("제목 : ");
		String title = sc.nextLine();
		
		System.out.print("작성자 : ");
		String writer = sc.nextLine();
		
		System.out.print("내용 : ");
		String content = sc.nextLine();
		
		Board board = new Board(title, writer, content);
		return board;
	}
	
	// 댓글 쓰기
	public static void commentWrite() {
		System.out.println("#### 댓글 쓰기 ####");
		System.out.print("글 번호 :");
		int boardNo = sc.nextInt();
		sc.nextLine();
		
		Comment comment = inputComment();
		comment.setNo(boardNo);				// no <- 게시글 번호(boardNo)
		
		// data2.insert(comment); 잘못적은건가??
		int result = data2.insert(comment);
		if(result > 0) {
			System.out.println("댓글이 작성되었습니다.");
		}
	}
	
	// 댓글 정보 입력
	public static Comment inputComment() {
		System.out.print("작성자 : ");
		String writer = sc.nextLine();
		
		System.out.print("내용 : ");
		String content = sc.nextLine();
		
		Comment comment = new Comment(writer, content);
		return comment;
	}
	
	// 댓글 수정
	public static void commentUpdate() {
		System.out.println("#### 댓글 수정 ####");
		System.out.print("댓글 번호 : ");
		int commentNo = sc.nextInt();
		sc.nextLine();
		
		Comment comment = inputComment();
		comment.setNo(commentNo);
		
		int result = data2.update(comment);
		if(result > 0) {
			System.out.println("댓글을 수정하였습니다.");
		}
	}
	
	//댓글 삭제
	public static void commentDelete( ) {
		System.out.println("#### 댓글 삭제 ####");
		System.out.print("댓글 번호 : ");
		int commentNo = sc.nextInt();
		sc.nextLine();
		
		int result = data2.delete(commentNo);
		if(result > 0) {
			System.out.println("댓글을 삭제하였습니다.");
		}
		
		
	}
	
	
	// 게시판 프로그램 시작
	public static void main(String[] args) {
	
		int menuNo = 0;
		
		do {
			menu();						// 메뉴판 출력
			menuNo = sc.nextInt();		// 메뉴번호 입력
			sc.nextLine();				// 엔터를 입력버퍼에서 제거
			
			if(menuNo == 0) break;
			
			// 메뉴선택
			switch (menuNo) {
			case 1:
				list();		// 게시글 목록
				break;
			case 2:
				read();		// 게시글 읽기
				break;
			case 3:
				write(); 	// 게시글 쓰기
				break;
			case 4:
				update();	// 게시글 수정
				break;
			case 5: 
				delete();	// 게시글 삭제
				break;
			case 6: 
				commentWrite();		// 댓글 쓰기
				break;
			case 7: 
				commentUpdate();	// 댓글 수정
				break;
			case 8: 
				commentDelete();	// 댓글 삭제
				break;
			default: 
				System.out.println("(0~8) 사이의 숫자를 입력해주세요.");
				break;
			}
		} while(menuNo != 0        );
		
		System.out.println("프로그램을 종료합니다....");
	}
}

