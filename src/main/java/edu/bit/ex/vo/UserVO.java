package edu.bit.ex.vo;

import org.springframework.security.crypto.password.PasswordEncoder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.log4j.Log4j;

/*
이름       NULL       유형            
-------- -------- ------------- 
USERNAME NOT NULL VARCHAR2(50)  
PASSWORD NOT NULL VARCHAR2(100) 
ENABLED           CHAR(1)   // 1이면 활성화 0이면 비활성화
*/

@Log4j
@Getter
@Setter
@AllArgsConstructor
@ToString
public class UserVO{
	private String username;
	private String password;
	private int enabled;
	
	public UserVO() {
		this("user", "1111", 1);
	}

}