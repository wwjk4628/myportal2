package himedia.myportal.exceptions;


import himedia.myportal.repositories.vo.PhonebookVo;

public class PhonebookDaoException extends RuntimeException {
	private PhonebookVo phonebookVo = null;
	
	//	생성자 
	public PhonebookDaoException() {
		
	}
	
	public PhonebookDaoException(String message) {
		super(message);
	}
	
	public PhonebookDaoException(String message, PhonebookVo vo) {
		super(message);
		this.phonebookVo = vo;
	}

	//	Getter 
	public PhonebookVo getPhonebookVo() {
		return phonebookVo;
	}

}
