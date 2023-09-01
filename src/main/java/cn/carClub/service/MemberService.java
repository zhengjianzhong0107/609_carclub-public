package cn.carClub.service;

import cn.carClub.dto.TrainTmp;
import cn.carClub.mapper.MemberMapper;
import cn.carClub.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Kuexun on 2018/6/20.
 */
@Service
public class MemberService {

    @Autowired
    private MemberMapper memberMapper;

    /**
     * 对车务信息进行操作
     * @return
     */
    public List<TrainTmp> getAllTrain() {

        return memberMapper.getAllTrain();
    }

    public List<Train> getTrainByMemberId(String memberId) {
        return memberMapper.getTrainByMemberId(memberId);
    }

    public Train getTrainByTrainId(String trainId) {
        return memberMapper.getTrainByTrainId(trainId);
    }

    public int addTrain(TrainTmp train){
        return memberMapper.addTrain(train);
    }

    public int deleteTrain(String trainId) {
        return memberMapper.deleteTrain(trainId);
    }

    public int modifyTrain(Train train) {
        return memberMapper.modifyTrain(train);
    }

    /**
     * 对旅行信息进行操作
     * @return
     */

    public List<Travel> getAllTravel() {
        return memberMapper.getAllTravel();
    }

    public List<Travel> getTravelByMemberId(String memberId) {
        return memberMapper.getTravelByMemberId(memberId);
    }

    public Travel getTravelByTravelId(String travelId) {
        return memberMapper.getTravelByTravelId(travelId);
    }

    public int addTravel(Travel travel){
        return memberMapper.addTravel(travel);
    }

    public int deleteTravel(String travelId) {
        return memberMapper.deleteTravel(travelId);
    }

    public int modifyTravel(Travel travel) {
        return memberMapper.modifyTravel(travel);
    }


    /**
     * 对救援信息进行操作
     * @return
     */
    public List<Rescue> getAllRescue() {
        return memberMapper.getAllRescue();
    }

    public List<Rescue> getRescueByMemberId(String memberId) {
        return memberMapper.getRescueByMemberId(memberId);
    }

    public Rescue getRescueByRescueId(String rescueId) {
        return memberMapper.getRescueByRescueId(rescueId);
    }

    public int addRescue(Rescue rescue){
        return memberMapper.addRescue(rescue);
    }

    public int deleteRescue(String rescueId) {
        return memberMapper.deleteRescue(rescueId);
    }

    public int modifyRescue(Rescue rescue) {
        return memberMapper.modifyRescue(rescue);
    }

    /**
     * 会员信息管理
     * @return
     */
    public List<Member> getAllMember() {
        return memberMapper.getAllMember();
    }

    public Member getMemberById(String memberId) {
        return memberMapper.getMemberById(memberId);
    }

    public int deleteMember(String memberId) {
        return memberMapper.deleteMember(memberId);
    }

    public int addMember(Member member) {
        return memberMapper.addMember(member);
    }

    public int modifyMember(Member member) {
        return memberMapper.modifyMember(member);
    }

    /**
     * 救援车辆管理，仅用于更改状态
     * @param carId
     * @return
     */
    public int carStatusChange(String carId) {
        Car car = memberMapper.getCarById(carId);
        String carStatus = car.getCarStatus();
        System.out.println(car);
        if(carStatus.equals("救援中"))
        {
            return memberMapper.carStatusChange(carId,"空闲");
        }else if(carStatus.equals("空闲"))
        {
            System.out.println("空闲的车");
            return memberMapper.carStatusChange(carId,"救援中");
        }else {
            return -1;
        }
    }

    public List<Car> getAllCar() {
        return memberMapper.getAllCar();
    }

    public Car getCarById(String carId){
        return memberMapper.getCarById(carId);
    }
}
