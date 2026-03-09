package com.cclinux.projects.meetche.mapper;

import com.cclinux.framework.core.mapper.ProjectBaseMapper;
import com.cclinux.projects.meetche.model.MeetModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("MeetCheMeetMapper")
@Mapper
public interface MeetMapper extends ProjectBaseMapper<MeetModel> {
}
