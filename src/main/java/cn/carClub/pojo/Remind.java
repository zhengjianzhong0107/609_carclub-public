package cn.carClub.pojo;

/**
 * 提醒信息
 * 用于首页展示和后台修改
 * Created by Kuexun on 2018/6/20.
 */
public class Remind {
    private String remindId;
    private String remindMessage;
    private String remindTime;
    private String employeeId;
    private String employeeName;
    private String remindStatus;

    @Override
    public String toString() {
        return "Remind{" +
                "remindId='" + remindId + '\'' +
                ", remindMessage='" + remindMessage + '\'' +
                ", remindTime='" + remindTime + '\'' +
                ", employeeId='" + employeeId + '\'' +
                ", remindStatus='" + remindStatus + '\'' +
                '}';
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getRemindStatus() {
        return remindStatus;
    }

    public void setRemindStatus(String remindStatus) {
        this.remindStatus = remindStatus;
    }

    public String getRemindId() {
        return remindId;
    }

    public void setRemindId(String remindId) {
        this.remindId = remindId;
    }

    public String getRemindMessage() {
        return remindMessage;
    }

    public void setRemindMessage(String remindMessage) {
        this.remindMessage = remindMessage;
    }

    public String getRemindTime() {
        return remindTime;
    }

    public void setRemindTime(String remindTime) {
        this.remindTime = remindTime;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
}
