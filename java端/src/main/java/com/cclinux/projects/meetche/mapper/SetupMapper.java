package com.cclinux.projects.meetche.mapper;

import com.cclinux.framework.core.mapper.ProjectBaseMapper;
import com.cclinux.projects.meetche.model.SetupModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository("MeetCheSetupMapper")
@Mapper
public interface SetupMapper extends ProjectBaseMapper<SetupModel> {
}
