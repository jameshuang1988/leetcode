package org.must.must.mapper;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.must.must.model.ManageUser;

@Mapper
public interface ManageUserMapper {
	@Select("SELECT * FROM manage_user")
	List<ManageUser> getAll();
	
	@Select("SELECT * FROM manageuser WHERE user_id = #{userid,jdbcType=VARCHAR} ORDER BY id DESC")
	ArrayList<ManageUser> getmanageuserById(@Param("userid") String userid);
}
