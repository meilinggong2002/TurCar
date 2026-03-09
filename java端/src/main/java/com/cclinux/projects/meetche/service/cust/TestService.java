package com.cclinux.projects.meetche.service.cust;

import cn.hutool.core.util.RandomUtil;
import cn.hutool.crypto.digest.DigestUtil;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.cclinux.framework.core.mapper.UpdateWhere;
import com.cclinux.framework.core.mapper.Where;
import com.cclinux.framework.helper.FakerHelper;
import com.cclinux.framework.helper.TimeHelper;
import com.cclinux.projects.meetche.mapper.MeetJoinMapper;
import com.cclinux.projects.meetche.mapper.MeetMapper;
import com.cclinux.projects.meetche.mapper.NewsMapper;
import com.cclinux.projects.meetche.mapper.UserMapper;
import com.cclinux.projects.meetche.model.MeetJoinModel;
import com.cclinux.projects.meetche.model.MeetModel;
import com.cclinux.projects.meetche.model.NewsModel;
import com.cclinux.projects.meetche.model.UserModel;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Notes: 活动模块业务逻辑
 * @Author: cclinux0730 (weixin)
 * @Ver: ccminicloud-framework 3.2.1
 */

@Service("MeetCheTestService")
public class TestService extends BaseMyCustService {

    @Resource(name = "MeetCheMeetMapper")
    private MeetMapper meetMapper;

    @Resource(name = "MeetCheMeetJoinMapper")
    private MeetJoinMapper meetJoinMapper;

    @Resource(name = "MeetCheUserMapper")
    private UserMapper userMapper;

    @Resource(name = "MeetCheNewsMapper")
    private NewsMapper newsMapper;


    public void mockMeetChe() {


    }


}
