package himedia.myportal.repositories.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import himedia.myportal.exceptions.PhonebookDaoException;

import himedia.myportal.repositories.vo.PhonebookVo;

@Repository("PhonebookDao")
public class PhonebookDaoImpl implements PhonebookDao {
	@Autowired
	SqlSession sqlSession;

	@Override
	public List<PhonebookVo> selectAll() {
		List<PhonebookVo> list = sqlSession.selectList("phonebook.selectAll");
		System.out.println("========================" + list);
		return list;
	}

	@Override
	public int insert(PhonebookVo vo) {
		try {
			int insertedCount = sqlSession.insert("phonebook.insert", vo);
			return insertedCount;
//		} catch (PersistenceException e) {
		} catch (Exception e) {
			// Dao의 Exception은 구체적인 사용자 정의 예외로 전환하여서 throw 한다
			throw new PhonebookDaoException("방명록 기록 중 예외 발생!", vo);
		}
	}

	@Override
	public int delete(PhonebookVo vo) {
		try {
			return sqlSession.delete("phonebook.delete", vo);
		} catch (Exception e) {
			throw new PhonebookDaoException("방명록 삭제 중 예외 발생!", vo);
		}
	}

	@Override
	public List<PhonebookVo> searchAll(String name) {
		List<PhonebookVo> list = sqlSession.selectList("phonebook.search", name);
		return list;
	}
	
	

}