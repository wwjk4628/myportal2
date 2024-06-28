package himedia.myportal.repositories.dao;

import java.util.List;


import himedia.myportal.repositories.vo.PhonebookVo;

public interface PhonebookDao {
	public List<PhonebookVo> selectAll();	//	게시물 목록
	public int insert(PhonebookVo vo);	//	게시물 작성
	public int delete(PhonebookVo vo);	//	게시물 삭제
	public List<PhonebookVo> searchAll(String name);
}
