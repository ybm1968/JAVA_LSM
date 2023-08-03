package Day07_EX05_BoardInterface2;

public interface DataService {
	
	Text[] selectList();
	
	Text select(int no);
	
	int insert(Text text);
	
	int update(Text text);
	
	int delete(int no);

}
