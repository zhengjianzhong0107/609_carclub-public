package cn.carClub.pojo;

/**
 * 俱乐部内部的车辆，用于救援车辆管理
 * 救援服务需要
 * Created by Kuexun on 2018/6/20.
 */
public class Car {
    private String carId;
    private String carBrand;
    private String carModel;
    private String carStatus;

    @Override
    public String toString() {
        return "Car{" +
                "carId='" + carId + '\'' +
                ", carBrand='" + carBrand + '\'' +
                ", carModel='" + carModel + '\'' +
                ", carStatus='" + carStatus + '\'' +
                '}';
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarStatus() {
        return carStatus;
    }

    public void setCarStatus(String carStatus) {
        this.carStatus = carStatus;
    }
}
