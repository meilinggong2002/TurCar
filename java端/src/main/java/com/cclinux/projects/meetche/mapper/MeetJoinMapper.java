package com.cclinux.projects.meetche.mapper;

import com.cclinux.framework.core.mapper.ProjectBaseMapper;
import com.cclinux.projects.meetche.model.MeetJoinModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("MeetCheMeetJoinMapper")
@Mapper
public interface MeetJoinMapper extends ProjectBaseMapper<MeetJoinModel> {

}
