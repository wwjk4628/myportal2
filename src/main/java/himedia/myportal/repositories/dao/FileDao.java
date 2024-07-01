package himedia.myportal.repositories.dao;

import java.util.List;

import himedia.myportal.repositories.vo.BoardVo;
import himedia.myportal.repositories.vo.FileVo;

public interface FileDao {
	public List<FileVo> selectAll();
	public int insert(FileVo fileVo);
	public int delete(Long no);
}
