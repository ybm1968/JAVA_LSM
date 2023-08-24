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
	private Stage stage;
	private Scene scene;
	ObservableList<Board> observableList;
	static ArrayList<Board> boardList = new ArrayList<>();
	
	public void boardWrite(int boardNo, String title, String writer,
			String content, String regDate, String updDate) {
		Board board = new Board(boardNo, title, writer, content, regDate, updDate);
		boardList.add(board);
		observableList.addAll(boardList);
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
//		Board board1 = new Board(1, "제목1", "작성자1", "내용1", "2023-08-18", "2023-08-18");
//		Board board2 = new Board(2, "제목2", "작성자2", "내용2", "2023-08-18", "2023-08-18");
//		Board board3 = new Board(3, "제목3", "작성자3", "내용3", "2023-08-18", "2023-08-18");
//		Board board4 = boardWrite(null, null, null)
//		ArrayList<Board> boardList = new ArrayList<Board>();
//		boardList.add(board1);
//		boardList.add(board2);
//		boardList.add(board3);
//		
//		ObservableList<Board> list = FXCollections.observableArrayList(
//				boardList
//		);
		
		observableList = FXCollections.observableArrayList();
				
		
		
		// TableColum 에 열과 추가할 아이템 객체의 게터(getXXX) 이름 지정하기 
		// - setCellValueFactory() : 셀의 값을 지정하는 메소드
		// - PropertyValueFactory("게터이름")
		// * 게터이름: get을 제외한 게터 메소드의 이름
		// ex) getBoardNo -> BoardNo
		// * module - info.java --> java.base 모듈 추가
		colBoardNo.setCellValueFactory(new PropertyValueFactory<>("BoardNo"));
		colTitle.setCellValueFactory(new PropertyValueFactory<>("Title"));
		colWriter.setCellValueFactory(new PropertyValueFactory<>("Writer"));
		colRegDate.setCellValueFactory(new PropertyValueFactory<>("RegDate"));
		colUpdDate.setCellValueFactory(new PropertyValueFactory<>("UpdDate"));
		
		// TableView에 데이터 리스트를 지정
		// - 미리 매핑된 TableColum 에 리스트의 요소 객체의 변수값이 지정됨
		boardTableView.setItems(observableList);
				
	}
	
//	boardTableView.setOnMouseClicked(new EventHandler<MouseEvent>() {
//
//		@Override
//		public void handle(MouseEvent event) {
//			// 더블 클릭 이벤트
//			if(event.getClickCount() == 2) {
//				System.out.println("더블 클릭");
//				selectedItem = boardTableView.getSelectionModel().getSelectedItem();
//				
//				System.out.println("선택한 아이템 : " + selectedItem);
//				
//				
//				stage = (Stage) ( (Node) event.getSource() ).getScene().getWindow();
//				
//				// 메뉴 아이템의 번호를 넘기기
//				// 아메리카노(0)
//				// 카페라뗴(1)
//				// 헤이즐넛(2)
//				int index = listView.getSelectionModel().getSelectedIndex();
//				System.out.println(index);
//				// Sub씬 을 가져오기
//				FXMLLoader loader = new FXMLLoader(getClass().getResource("Sub.fxml"));
//				
//				
//				try {
//					
//					root = loader.load();		// load() 메소드를 호출해야 loader에 Sub 씬 인스턴스를 가져온다.
//												// 호출해야 Controller 도 null이 되지 않는다.
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//				
//				// Sub.fxml 에 연결된 SubController 가져오기
//				SubController subController = loader.getController();
//				
//				if( subController != null ) {
//					// inputItemIndex 메소드 정의
//					subController.inputItemIndex(index);
//				}
//				// 화면 이동
//				switchScene(stage, root, "Sub.fxml");
//	
//			}
//		}
//			
//	});
	
	

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
}
