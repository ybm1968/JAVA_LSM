package Day07.EX05_BoardInterface;

public interface DataService {
	
	Text[] selectList();
	
	Text select(int no); 
	
	int insert(Text text);
	 
	int update(Text text);
	
	int delete(int no) ;
}
