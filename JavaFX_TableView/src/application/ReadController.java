package application;

import java.io.IOException;

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

public class ReadController {

	@FXML
	private TextArea textContent;

	@FXML
	private TextField textNo;

	@FXML
	private TextField textRegDate;

	@FXML
	private TextField textTiltle;

	@FXML
	private TextField textUpdDate;

	@FXML
	private TextField textWriter;

	@FXML
	private Button toMainButton;

	private Stage stage;
	private Scene scene;

	Board board;

	public void readBoard(int index) {
		board = MainController.boardList.get(index);
		
		textNo.setText(board.getBoardNo() + "");
		textTiltle.setText(board.getTitle());
		textWriter.setText(board.getWriter());
		textContent.setText(board.getContent());
		textRegDate.setText(board.getRegDate());
		textRegDate.setText(board.getUpdDate());
	}

	public void switchScnene(ActionEvent event, String fxml) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource(fxml));
		scene = new Scene(root);
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		stage.setScene(scene);
		stage.show();
	}
}
