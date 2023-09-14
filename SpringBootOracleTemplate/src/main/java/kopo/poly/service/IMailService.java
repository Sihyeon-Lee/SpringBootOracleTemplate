package kopo.poly.service;

import kopo.poly.dto.MailDTO;
import kopo.poly.dto.NoticeDTO;

import java.util.List;

public interface IMailService {

    // 메일 리스트
    List<MailDTO> getMailList() throws Exception;

    // 메일 발송
    int doSendMail(MailDTO pDTO) throws Exception;
}
