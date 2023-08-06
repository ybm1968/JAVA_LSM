package Day07.EX05_BoardInterface;

public interface DataService {
	
	Text[] selectList();				// 데이터 목록 조회
	
	Text[] selectList(int boardNo);		// 특정 글에 해당하는 댓글 데이터 목록 조회
	
	Text select(int no); 				// 데이터 조회
	
	int insert(Text text);				// 데이터 등록
	 
	int update(Text text);				// 데이터 수정
	
	int delete(int no);					// 데이터 삭제
}
