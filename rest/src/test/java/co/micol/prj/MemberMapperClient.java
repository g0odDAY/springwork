package co.micol.prj;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import co.micol.prj.member.mapper.MemberMapper;
import co.micol.prj.member.service.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/config/*-context.xml")
public class MemberMapperClient {
	@Autowired MemberMapper mapper;
	@Test
	public void listTest() {
		List<MemberVO> list=mapper.memberList();
		System.out.println(list);
	}
	
	//@Test
	public void insertTest() {
		MemberVO vo=new MemberVO();
		vo.setMemberId("77");
		vo.setMemberName("rbqhr");
		vo.setMemberPw("1234");
		vo.setMemberAddress("gumi");
		vo.setMemberTel("054548768564");
		int i=mapper.memberInsert(vo);
		System.out.println(i);
	}
	@Test
	public void selectTest() {
		MemberVO vo=new MemberVO();
		vo.setMemberId("zz");
		MemberVO id=mapper.memberSelect(vo);
		System.out.println(id);
	}
}
