package himedia.myportal.services;

import java.util.List;


import himedia.myportal.repositories.vo.PhonebookVo;

public interface PhonebookService {
	public List<PhonebookVo> getMessageList();
	public boolean writeMessage(PhonebookVo vo);
	public boolean deleteMessage(PhonebookVo vo);
	public List<PhonebookVo> getSearchList(String name);
}