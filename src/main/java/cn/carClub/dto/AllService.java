package cn.carClub.dto;

import cn.carClub.pojo.Member;

/**
 * Created by Kuexun on 2018/6/27.
 */
public class AllService {
    private String memberId;
    private String memberName;
    private String serviceId;
    private String serviceName;
    private String serviceTime;
    private String serviceMessage;

    @Override
    public String toString() {
        return "AllService{" +
                "memberId='" + memberId + '\'' +
                ", memberName='" + memberName + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", serviceTime='" + serviceTime + '\'' +
                ", serviceMessage='" + serviceMessage + '\'' +
                '}';
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceTime() {
        return serviceTime;
    }

    public void setServiceTime(String serviceTime) {
        this.serviceTime = serviceTime;
    }

    public String getServiceMessage() {
        return serviceMessage;
    }

    public void setServiceMessage(String serviceMessage) {
        this.serviceMessage = serviceMessage;
    }
}
