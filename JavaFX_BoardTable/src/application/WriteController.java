package application;

import java.io.IOException;
import java.text.SimpleDateFormat;
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

	Stage stage;
	Scene scene;
	Parent root;

	Date now = new Date();	
	String dateFormat = "yyyy-MM-dd";
	SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
	String nowStr = sdf.format(now);

	
	@FXML
	public void inputDate(ActionEvent event) throws Exception {
		
		String title = writeTitle.getText();
		String writer = writeWriter.getText();
		String content = writeContent.getText();
		
		// Main.fxml 읽어오기
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Main.fxml"));
		root = loader.load();  // Main 씬 가져옴
		

		// Main.fxml 에 연결된 MainController 가져오기
		MainController mainController =  loader.getController();
		mainController.boardWrite(MainController.no, title, writer, content, nowStr, nowStr);
		MainController.no++;
		
		// Main -> Sub  화면 전환
		Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchScnene(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
//		FXMLLoader loader = new FXMLLoader(getClass().getResource("Main.fxml"));
//		root = loader.load();  // Main 씬 가져옴
		
//		List<Board> boardList = MainController.boardList;
//		for (Board board : boardList) {
//			System.out.println(board);
//		}
		
		scene = new Scene(root);
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		stage.setScene(scene); 				
		stage.show();
	}
}
