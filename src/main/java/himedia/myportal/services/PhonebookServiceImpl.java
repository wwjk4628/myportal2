package himedia.myportal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import himedia.myportal.repositories.dao.GuestbookDao;
import himedia.myportal.repositories.dao.PhonebookDao;
import himedia.myportal.repositories.vo.GuestbookVo;
import himedia.myportal.repositories.vo.PhonebookVo;

@Service("PhonebookService")
public class PhonebookServiceImpl implements PhonebookService{
	@Autowired
	PhonebookDao phonebookDao;
	
	@Override
	public List<PhonebookVo> getMessageList() {
		List<PhonebookVo> list = phonebookDao.selectAll();
		System.out.println(list);
		return list;
	}

	@Override
	public boolean writeMessage(PhonebookVo vo) {
		int insertedCount = phonebookDao.insert(vo);
		return insertedCount == 1;
	}

	@Override
	public boolean deleteMessage(PhonebookVo vo) {
		return 1 == phonebookDao.delete(vo);
	}

	@Override
	public List<PhonebookVo> getSearchList(String name) {
		List<PhonebookVo> list = phonebookDao.searchAll(name);
		System.out.println(list);
		return list;
	}
	
	

}
