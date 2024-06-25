package himedia.myportal.repositories.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import himedia.myportal.repositories.vo.UserVo;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public int insert(UserVo vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public UserVo selectUser(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserVo selectUser(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}
