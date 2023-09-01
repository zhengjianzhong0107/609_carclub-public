package cn.carClub.pojo;

/**
 * 旅行信息
 * 用于显示会员的往期旅行信息
 * Created by Kuexun on 2018/6/20.
 */
public class Travel {
    private String travelId;
    private String travelTime;
    private String travelAddress;
    private String memberId;
    private String memberName;
    private String travelPrice;

    @Override
    public String toString() {
        return "Travel{" +
                "travelId='" + travelId + '\'' +
                ", travelTime='" + travelTime + '\'' +
                ", travelAddress='" + travelAddress + '\'' +
                ", memberId='" + memberId + '\'' +
                ", memberName='" + memberName + '\'' +
                ", travelPrice='" + travelPrice + '\'' +
                '}';
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getTravelPrice() {
        return travelPrice;
    }

    public void setTravelPrice(String travelPrice) {
        this.travelPrice = travelPrice;
    }

    public String getTravelId() {
        return travelId;
    }

    public void setTravelId(String travelId) {
        this.travelId = travelId;
    }

    public String getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(String travelTime) {
        this.travelTime = travelTime;
    }

    public String getTravelAddress() {
        return travelAddress;
    }

    public void setTravelAddress(String travelAddress) {
        this.travelAddress = travelAddress;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }
}
