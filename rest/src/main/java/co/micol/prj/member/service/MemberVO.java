package co.micol.prj.member.service;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
public class MemberVO {
	private String memberId;
	@JsonIgnore
	private String memberPw;
	private String memberName;
	private String memberTel;
	private String memberAddress;
	private String memberAuthor;
}
