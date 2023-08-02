package Board;

public interface DataService {

	Board[] selectList();
	
	Board select(int boardNo);
	
	int insert(Board board);
	
	int update(Board board);
	
	int delete(int boardNo);
}
