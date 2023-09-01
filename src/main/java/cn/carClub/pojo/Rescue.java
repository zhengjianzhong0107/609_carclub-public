package cn.carClub.pojo;

import java.util.Date;

/**
 * 救援信息
 * 用于救援服务
 * 与汽车、会员相关
 * Created by Kuexun on 2018/6/20.
 */
public class Rescue {
    private String rescueId;
    private String rescueTime;
    private String rescuePlace;
    private String rescueStatus;
    private String memberId;
    private String memberName;
    private String carId;

    @Override
    public String toString() {
        return "Rescue{" +
                "rescueId='" + rescueId + '\'' +
                ", rescueTime='" + rescueTime + '\'' +
                ", rescuePlace='" + rescuePlace + '\'' +
                ", rescueStatus='" + rescueStatus + '\'' +
                ", memberId='" + memberId + '\'' +
                ", memberName='" + memberName + '\'' +
                ", carId='" + carId + '\'' +
                '}';
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getRescueId() {
        return rescueId;
    }

    public void setRescueId(String rescueId) {
        this.rescueId = rescueId;
    }

    public String getRescueTime() {
        return rescueTime;
    }

    public void setRescueTime(String rescueTime) {
        this.rescueTime = rescueTime;
    }

    public String getRescuePlace() {
        return rescuePlace;
    }

    public void setRescuePlace(String rescuePlace) {
        this.rescuePlace = rescuePlace;
    }

    public String getRescueStatus() {
        return rescueStatus;
    }

    public void setRescueStatus(String rescueStatus) {
        this.rescueStatus = rescueStatus;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }
}
