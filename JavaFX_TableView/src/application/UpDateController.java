package application;

import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class UpDateController implements Initializable {
	
	@FXML
    private TextArea textContent;

    @FXML
    private TextField textTiltle;

    @FXML
    private TextField textWriter;
	
	private Stage stage;
	private Scene scene;
	Parent root;
	Board board;
	
	
	Date now = new Date();	
	String dateFormat = "yyyy-MM-dd";
	SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
	String nowStr = sdf.format(now);
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		board = MainController.boardList.get(MainController.index2);
		
		textTiltle.setText(board.getTitle());
		textWriter.setText(board.getWriter());
		textContent.setText(board.getContent());		
	}

	@FXML
    void upDateBoard(ActionEvent event) throws IOException {
		
		String title = textTiltle.getText();
		String writer = textWriter.getText();
		String content = textContent.getText();
		
	
		Board board = new Board();
		board.setBoardNo(MainController.no);
		board.setTitle(title);
		board.setWriter(writer);
		board.setContent(content);
		board.setRegDate(nowStr);
		board.setUpdDate(nowStr);
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Main.fxml"));
		root = loader.load();  // Main 씬 가져옴
		MainController mainController =  loader.getController();
		mainController.boardUpDate(board, MainController.index2);
		
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
