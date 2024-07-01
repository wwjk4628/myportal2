package himedia.myportal.repositories.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import himedia.myportal.repositories.vo.FileVo;

@Repository("FileDao")
public class FileDaoImpl implements FileDao{

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<FileVo> selectAll() {
		System.out.println("==============================");
		List<FileVo> list = sqlSession.selectList("file.selectAll");
		System.out.println(list);
		return list;
	}

	@Override
	public int insert(FileVo fileVo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Long no) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
