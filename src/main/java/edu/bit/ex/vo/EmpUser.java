package edu.bit.ex.vo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
principal.member.username
principal.member.password
principal.member.enabled
principal.member.authority
*/

@Setter
@Getter
@ToString
public class EmpUser extends User {
	
	
	private EmpVO emp; // username, password, enables, authority 정보를 가지고 있음
	   
	   //기본적으로 부모의 생성자를 호출해야만 정상적으로 작동
	
	public EmpUser(String username, String password, Collection<? extends GrantedAuthority> authorities) {
		super(username, password, authorities);
	}

	public EmpUser(EmpVO empVO) {

		super(empVO.getEname(), empVO.getEmpno(), getAuth(empVO));

		this.emp = empVO;
	}

	// 유저가 갖고 있는 권한 목록
	// 생성자가 함수를 갖기 위해서는 static을 사용해야 함
	public static Collection<? extends GrantedAuthority> getAuth(EmpVO empVO) {
		
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority(empVO.getAuthority()));

		return authorities;
	}
}
