package or.yonsai.mapper;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
import or.yonsai.domain.BoardVO;
import or.yonsai.domain.Criteria;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {
	
	@Setter(onMethod_ = {@Autowired} )
	private BoardMapper mapper;

//	@Test
//	public void testGetList() {
//		mapper.getList().forEach(board -> log.info(board));
//	}
//	
//	@Test
//	public void testInsert() {
//		BoardVO board = new BoardVO();
//		board.setTitle("새로 작성하는 글");
//		board.setContent("새로 작성하는 내용");
//		board.setWriter("newbie");
//		
//		mapper.insert(board);
//		
//		log.info(board);
//	}
//	
//	@Test
//	public void testInsertSelectKey() {
//		
//		BoardVO board = new BoardVO();
//		board.setTitle("새로 작성하는 글 select key");
//		board.setContent("새로 작성하는 내용 select key");
//		board.setWriter("newbie");
//		
//		mapper.insertSelectKey(board);
//		log.info(board);
//	}
//	
//	@Test
//	public void testRead() {
//		
//		//존재하는 게시물 번호로 테스트
//		BoardVO board = mapper.read(5);
//		
//		log.info(board);
//	}
//	
//	@Test
//	public void testDelete() {
//		
//		log.info("DELETE COUNT: " + mapper.delete(3));		//3번글 삭제
//	}

//	@Test
//	public void testUpdate() {
//		BoardVO board = new BoardVO();
//		board.setBno(5);
//		board.setTitle("update");
//		board.setContent("update");
//		board.setWriter("update");
//		
//		int count = mapper.update(board);
//		log.info("UPDATE COUNT: " + count);
//		
//	}
	
//	@Test
//	public void testPaging() {
//		
//		//Criteria cri = new Criteria();
//		//cri.setPageNum(2);
//		//cri.setAmount(5);
//		//cri.updateOffsetNum();
//		
//		Criteria cri = new Criteria(2,5);
//		
//		List<BoardVO> list = mapper.getListWithPaging(cri);
//		
//		list.forEach(board -> log.info(board.getBno()));
//	}
	
	@Test
	public void testSearch() {
		
		Criteria cri = new Criteria();
		cri.setKeyword("새로");
		cri.setType("TC");
		
		List<BoardVO> list = mapper.getListWithPaging(cri);
		
		list.forEach(board -> log.info(board));
	}
}
