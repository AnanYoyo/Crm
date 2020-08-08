package per.zqa.crm.workbench.service;

import per.zqa.crm.exception.AjaxRequestException;
import per.zqa.crm.vo.ActivityVo;
import per.zqa.crm.vo.PageVo;
import per.zqa.crm.workbench.domain.Activity;
import per.zqa.crm.workbench.domain.ActivityRemark;

import java.util.List;

public interface ActivityService {

    boolean saveActivity(Activity activity) throws AjaxRequestException;

    PageVo<Activity> selectActivity(ActivityVo activityVo);

    boolean deleteActivity(String[] ids);

    Activity getActivityById(String id);

    boolean updateActivity(Activity activity);

    Activity getActivityDetailById(String id);

    List<ActivityRemark> getRemarkListByAId(String aId);

    boolean deleteRemark(String id);

    boolean saveRemark(ActivityRemark activityRemark);

    boolean updateRemark(ActivityRemark activityRemark);
}
