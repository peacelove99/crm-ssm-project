package com.yyp.crm.workbench.service;

import com.yyp.crm.workbench.domain.Activity;

import java.util.List;
import java.util.Map;

/**
 * 作者: 元昱鹏
 * 时间: 2023-01-23
 */
public interface ActivityService {
    int saveCreateActivity(Activity activity);

    List<Activity> queryActivityByConditionForPage(Map<String,Object> map);

    int queryCountOfActivityByCondition(Map<String,Object> map);

    int deleteActivityByIds(String[] ids);

    Activity queryActivityById(String id);

    int saveEditActivity(Activity activity);

    List<Activity> queryAllActivitys();

    List<Activity> queryActivityByIds(String[] ids);

    int saveCreateActivityByList(List<Activity> activityList);
}
