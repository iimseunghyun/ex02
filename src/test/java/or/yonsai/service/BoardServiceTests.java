package or.yonsai.service;

import static org.junit.Assert.*;

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
public class BoardServiceTests {
	
	@Setter(onMethod_ = {@Autowired})
	private BoardService service;
	
//	@Test
//	public void test() {
//		log.info(service);
//		assertNotNull(service);
//	}
//
//	@Test
//	public void testRegister() {
//		
//		BoardVO board = new BoardVO();
//		board.setTitle("새로작성하는글");
//		board.setContent("새로 작성하는 내용");
//		board.setWriter("newbie");
//		
//		service.register(board);
//		
//		log.info("new content bno: " + board.getBno());
//	}
//	
	@Test
	public void testGetList() {
		
//		service.getList().forEach(board -> log.info(board));
		service.getList(new Criteria(2,5)).forEach(board ->log.info(board));
	}
	
//	@Test
//	public void testGet() {
//		
//		log.info(service.get(1));
//	}
//	
//	@Test
//	public void testDelete() {
//		
//		log.info("remove result: " + service.remove(15));
//	}
//	
//	@Test
//	public void testModify() {
//		
//		BoardVO board = service.get(14);
//		
//		if(board == null) {
//			return;
//		}
//		
//		board.setTitle("modified title");
//		log.info("modify result: " + service.modify(board));
//	}
}
