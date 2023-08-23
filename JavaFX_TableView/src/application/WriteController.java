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
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class WriteController {

	@FXML
	private TextArea writeContent;

	@FXML
	private TextField writeTitle;

	@FXML
	private TextField writeWriter;
	
	@FXML
	private Button completeButton;

	private Stage stage;
	private Scene scene;
	private Parent root;

//	ArrayList<Board> boardList = new ArrayList<>();
//	Board board;
	
	Date now = new Date();
	// 날짜/시간 문자
	// yyyy : 년도,	MM : 월, 	dd : 일
	// hh 	: 시,	mm : 분,		ss : 초
	String dateFormat = "yyyy-MM-dd";
	SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
	String nowStr = sdf.format(now);

	
	@FXML
	public void inputDate(ActionEvent event) throws Exception {
		
		String title = writeTitle.getText();
		String writer = writeWriter.getText();
		String content = writeContent.getText();
		
//		Board board = new Board(MainController.no, title, writer, content, nowStr, nowStr);
//		boardList.add(board);
//		insert(board);
		
		// Main.fxml 읽어오기
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Main.fxml"));
		root = loader.load();  // Main 씬 가져옴
		
		// Main.fxml 에 연결된 MainController 가져오기
		MainController mainController =  loader.getController();
//		mainController.boardList.add(board);
		mainController.boardWrite(MainController.no, title, writer, content, nowStr, nowStr);
		MainController.no++;
		
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
