package kopo.poly.persistance.mapper;

import kopo.poly.dto.MailDTO;
import kopo.poly.dto.NoticeDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IMailMapper {

	//메일 리스트
	List<MailDTO> getMailList() throws Exception;
	
	//게시판 글 등록
	void insertSendMail(MailDTO pDTO) throws Exception;
	
}
