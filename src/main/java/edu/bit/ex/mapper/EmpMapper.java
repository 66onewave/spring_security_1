package edu.bit.ex.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.security.crypto.password.PasswordEncoder;

import edu.bit.ex.vo.EmpVO;
import edu.bit.ex.vo.MemberVO;
import edu.bit.ex.vo.UserVO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.log4j.Log4j;

@Mapper
public interface EmpMapper {
   
   @Select("select * from emp where ename = #{ename}")
   public EmpVO getEmp(String ename);   
}