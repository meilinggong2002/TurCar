package com.cclinux.projects.meetche.mapper;

import com.cclinux.framework.core.mapper.ProjectBaseMapper;
import com.cclinux.projects.meetche.model.FavModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("MeetCheFavMapper")
@Mapper
public interface FavMapper extends ProjectBaseMapper<FavModel> {
}
