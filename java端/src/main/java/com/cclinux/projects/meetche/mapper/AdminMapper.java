package com.cclinux.projects.meetche.mapper;

import com.cclinux.framework.core.mapper.ProjectBaseMapper;
import com.cclinux.projects.meetche.model.AdminModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository("MeetCheAdminMapper")
@Mapper
public interface AdminMapper extends ProjectBaseMapper<AdminModel> {
}
