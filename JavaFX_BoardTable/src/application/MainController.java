package application;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class MainController implements Initializable{

	@FXML    
	private TableColumn<Board, Integer> colBoardNo;

	@FXML
	private TableColumn<Board, String> colRegDate;

	@FXML
	private TableColumn<Board, String> colTitle;

	@FXML
	private TableColumn<Board, String> colUpdDate;

	@FXML
	private TableColumn<Board, String> colWriter;

	@FXML
	private TableView<Board> boardTableView;
	
	static int no = 1;
	static int index2;
	Stage stage;
	Scene scene;
	Parent root;
	ObservableList<Board> observableList;
	static ArrayList<Board> boardList = new ArrayList<>();
	
	public void boardWrite(int boardNo, String title, String writer,
		String content, String regDate, String updDate) throws IOException {
		Board board = new Board(boardNo, title, writer, content, regDate, updDate);
		boardList.add(board);
//		observableList.addAll(boardList);
	}
	
	public void boardUpDate(Board board, int index) {
		boardList.set(index, board);
//		observableList.addAll(boardList);
	}
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
//		List<Board> boadList = boardDAO.list();
//		observableList.addAll(boardList);
		
		observableList = FXCollections.observableArrayList();
		
		observableList.addAll(boardList);
		
		colBoardNo.setCellValueFactory(new PropertyValueFactory<>("BoardNo"));
		colTitle.setCellValueFactory(new PropertyValueFactory<>("Title"));
		colWriter.setCellValueFactory(new PropertyValueFactory<>("Writer"));
		colRegDate.setCellValueFactory(new PropertyValueFactory<>("RegDate"));
		colUpdDate.setCellValueFactory(new PropertyValueFactory<>("UpdDate"));	
		
		boardTableView.setItems(observableList);
		
		boardTableView.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				
				// 더블 클릭 이벤트
				if( event.getClickCount() == 2 ) {
					stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
					
					int index = boardTableView.getSelectionModel().getSelectedIndex();
					// Sub 씬을 가져오기
					FXMLLoader loader = new FXMLLoader(getClass().getResource("Read.fxml"));
					
					try {
						root = loader.load();		// load() 메소드를 호출해야 loader 에 Sub 씬 인스턴스를 가져온다.
													// 호출해야 Controller 도 null 이 되지 않는다
					} catch (IOException e) {
						e.printStackTrace();
					}
					
					ReadController subController =  loader.getController();
					
					if( subController != null) {
						subController.readBoard(index);
					}			
					switchRead(stage, root, "Read.fxml");
					
				}
				if(event.getClickCount() == 1 ) {
//					index2 = boardTableView.getSelectionModel().getSelectedItem().getBoardNo();
					index2 = boardTableView.getSelectionModel().getSelectedIndex();
				}
				}
			
			});
		
		
	}
	@FXML
	public void boardDelete() {
		System.out.println(index2);
		boardList.remove(index2);
		
		observableList = FXCollections.observableArrayList();
		observableList.addAll(boardList);
		
		boardTableView.setItems(observableList);
	}
	
	public void switcTohWrite(ActionEvent event) throws IOException {
		switchScnene(event, "Write.fxml");
	}
		
	public void switcTohUpDate(ActionEvent event) throws IOException {
		switchScnene(event, "UpDate.fxml");
	}
	
	public void switchScnene(ActionEvent event, String fxml) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource(fxml));
		scene = new Scene(root);
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		stage.setScene(scene); 				
		stage.show();
	}
	
	public void switchRead(Stage stage, Parent root, String fxml) {
			scene = new Scene(root);
			stage.setScene(scene); 				
			stage.show();
	}


}
