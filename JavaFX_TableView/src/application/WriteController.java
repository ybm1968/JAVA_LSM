package application;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class WriteController {

	@FXML
	private TextArea writeContent;

	@FXML
	private TextField writeTitle;

	@FXML
	private TextField writeWriter;

	private Stage stage;
	private Scene scene;
	private Parent root;

	List<Board> boardList = new ArrayList<>();
	Board board;
	
	Date now = new Date();
	// 날짜/시간 문자
	// yyyy : 년도,	MM : 월, 	dd : 일
	// hh 	: 시,	mm : 분,		ss : 초
	String dateFormat = "yyyy-MM-dd";
	SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
	String nowStr = sdf.format(now);
	
	
//	// 데이터 등록
//	public int insert(Board board) {
//		int result = 0;
//
//		String sql = " INSERT INTO board( title, writer, content ) " + " VALUES( ?, ?, ? ) ";
//
//		try {
//			psmt = con.prepareStatement(sql);
//			psmt.setString(1, board.getTitle());
//			psmt.setString(2, board.getWriter());
//			psmt.setString(3, board.getContent());
//
//			result = psmt.executeUpdate();
//
//		} catch (SQLException e) {
//			System.err.println("게시글 등록 시, 에러 발생");
//			e.printStackTrace();
//		}
//		return result;
//	}

	
	
	public void inputDate(ActionEvent event) throws Exception {
		
		String title = writeTitle.getText();
		String writer = writeWriter.getText();
		String content = writeContent.getText();
		
//		Board board = new Board(title, writer, content);
//		insert(board);
		
		// Main.fxml 읽어오기
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Main.fxml"));
		root = loader.load();  // Main 씬 가져옴
		
		// Main.fxml 에 연결된 MainController 가져오기
		MainController mainController =  loader.getController();
		mainController.boardWrite(MainController.no, title, writer, content, nowStr, nowStr);		// SubController 를 통해서 Main 씬에서 입력한 name(이름)을 Sub 씬에 넘김
		
		// Main -> Sub  화면 전환
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchScnene(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
		scene = new Scene(root);
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		stage.setScene(scene); 				
		stage.show();
	}
}
