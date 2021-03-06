package p.g.p.dao;

import java.util.List;

import p.g.p.model.Manager;
import p.g.p.model.Notice;

public interface ManagerDao {

	public Manager loginSelect(String id);

	/*public int insertManager(Manager manager);*/
	
	//공지사항 입력하기 
	public int insertNotice(Notice notice);
	
	//공지사항 리스트 보여주기
	public List<Notice> selectNoticeList();
	
	//공지사항 글 중 하나 클릭하면 내용에 들어가기 위한 셀렉트 
	public Notice selectByNoticeIdx(int notice_idx);
}
