package cn.carClub.mapper;

import cn.carClub.dto.TrainTmp;
import cn.carClub.pojo.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Kuexun on 2018/6/20.
 */
@Repository
public interface MemberMapper {
    List<TrainTmp> getAllTrain();
    List<Train> getTrainByMemberId(String memberId);
    Train getTrainByTrainId(String trainId);
    int addTrain(TrainTmp train);
    int deleteTrain(String trainId);
    int modifyTrain(Train train);


    List<Travel> getAllTravel();
    List<Travel> getTravelByMemberId(String memberId);
    Travel getTravelByTravelId(String travelId);
    int addTravel(Travel travel);
    int deleteTravel(String travelId);
    int modifyTravel(Travel travel);


    List<Rescue> getAllRescue();
    List<Rescue> getRescueByMemberId(String memberId);
    Rescue getRescueByRescueId(String rescueId);
    int addRescue(Rescue rescue);
    int deleteRescue(String rescueId);
    int modifyRescue(Rescue rescue);


    List<Member> getAllMember();
    Member getMemberById(String memberId);
    int deleteMember(String memberId);
    int addMember(Member member);
    int modifyMember(Member member);



    int carStatusChange(@Param("carId") String carId, @Param("carStatus") String carStatus);

    List<Car> getAllCar();
    Car getCarById(String carId);
}
