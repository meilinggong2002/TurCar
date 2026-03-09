package com.cclinux.projects.meetche.mapper;

import com.cclinux.framework.core.mapper.ProjectBaseMapper;
import com.cclinux.projects.meetche.model.NewsModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository("MeetCheNewsMapper")
@Mapper
public interface NewsMapper extends ProjectBaseMapper<NewsModel> {
}
