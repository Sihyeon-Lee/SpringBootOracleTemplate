package kopo.poly.service;

import kopo.poly.dto.NoticeDTO;
import kopo.poly.dto.UserInfoDTO;

import java.util.List;

public interface IUserInfoService {

    // 아이디 중복 체크
    UserInfoDTO getUserIdExists(UserInfoDTO pDTO) throws Exception;

    // 이메일 주소 중복 체크 및 인증 값
    UserInfoDTO getEmailExists(UserInfoDTO pDTO) throws Exception;

    // 회원 가입하기(회원정보 등록하기)
    int insertUserInfo(UserInfoDTO pDTO) throws Exception;

    // 회원 리스트
    List<UserInfoDTO> getUserList() throws Exception;

    /**
     * 회원정보 상세보기
     *
     * @param pDTO 상세내용 조회할 userId 값
     * @param type 조회수 증가여부(수정보기는 조회수 증가하지 않음)
     * @return 조회 경과
     */
    UserInfoDTO getUserInfo(UserInfoDTO pDTO, boolean type) throws Exception;

}
