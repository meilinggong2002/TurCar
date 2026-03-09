package com.cclinux.projects.meetche.mapper;

import com.cclinux.framework.core.mapper.ProjectBaseMapper;
import com.cclinux.projects.meetche.model.UserModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository("MeetCheUserMapper")
@Mapper
public interface UserMapper extends ProjectBaseMapper<UserModel> {
}
