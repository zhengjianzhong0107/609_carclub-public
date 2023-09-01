package cn.carClub.dto;

/**
 * Created by Kuexun on 2018/6/26.
 */
public class TrainTmp {
    private String trainId;
    private String trainTime;
    private String trainMessage;
    private String memberId;
    private String memberName;
    private String message;

    @Override
    public String toString() {
        return "TrainTmp{" +
                "trainId='" + trainId + '\'' +
                ", trainTime='" + trainTime + '\'' +
                ", trainMessage='" + trainMessage + '\'' +
                ", memberId='" + memberId + '\'' +
                ", memberName='" + memberName + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
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

    public String getTrainMessage() {
        return trainMessage;
    }

    public void setTrainMessage(String trainMessage) {
        this.trainMessage = trainMessage;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
