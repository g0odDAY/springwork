package co.micol.prj.member.mapper;

import java.util.List;

import co.micol.prj.member.service.MemberVO;


public interface MemberMapper {
	List<MemberVO> memberList();
	MemberVO memberSelect(MemberVO vo);
	int memberDelete(MemberVO vo);
	int memberInsert(MemberVO vo);
	int memberUpdate(MemberVO vo);
}
