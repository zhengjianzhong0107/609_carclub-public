package cn.carClub.pojo;

import cn.carClub.util.DateUtils;

import java.util.Arrays;
import java.util.Date;

/**
 * 车务信息
 * 用于显示会员请求的代办车务
 * Created by Kuexun on 2018/6/20.
 */
public class Train {
    private String trainId;
    private String trainTime;
    private String[] trainMessage;
    private String memberId;
    private String memberName;
    private String message;

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTrainId() {
        return trainId;
    }

    public void setTrainId(String trainId) {
        this.trainId = trainId;
    }

    public String getTrainTime() {
        return trainTime;
    }

    public void setTrainTime(String trainTime) {
        this.trainTime = trainTime;
    }

    public String[] getTrainMessage() {
        return trainMessage;
    }

    public void setTrainMessage(String[] trainMessage) {
        this.trainMessage = trainMessage;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    @Override
    public String toString() {
        return "Train{" +
                "trainId='" + trainId + '\'' +
                ", trainTime='" + trainTime + '\'' +
                ", trainMessage=" + Arrays.toString(trainMessage) +
                ", memberId='" + memberId + '\'' +
                ", memberName='" + memberName + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
