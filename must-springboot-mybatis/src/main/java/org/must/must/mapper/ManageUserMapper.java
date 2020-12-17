package org.must.must.mapper;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.must.must.model.ManageUser;

public interface ManageUserMapper {
	@Select("SELECT * FROM manage_user")
	List<ManageUser> getAll();

	@Select("SELECT * FROM manage_user WHERE user_id = #{userId} ORDER BY user_id DESC")
	ArrayList<ManageUser> getmanageuserById(@Param("userId") String userid);
}
