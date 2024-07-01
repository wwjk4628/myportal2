package himedia.myportal.repositories.vo;

public class FileVo {
	private Long no;
	private String originalName;
	private String saveName;
	
	
	
	public FileVo(String originalName, String saveName) {
		super();
		this.originalName = originalName;
		this.saveName = saveName;
	}



	public Long getNo() {
		return no;
	}



	public void setNo(Long no) {
		this.no = no;
	}



	public String getOriginalName() {
		return originalName;
	}



	public void setOriginalName(String originalName) {
		this.originalName = originalName;
	}



	public String getSaveName() {
		return saveName;
	}



	public void setSaveName(String saveName) {
		this.saveName = saveName;
	}



	@Override
	public String toString() {
		return "FileVo [no=" + no + ", originalName=" + originalName + ", saveName=" + saveName + "]";
	}
	
	
}
