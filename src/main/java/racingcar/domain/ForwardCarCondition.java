package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.Map;

public class ForwardCarCondition {

    public Map<String, Integer> racingCarCount() {
        CarListPutInMap carName = new CarListPutInMap();
        Map<String, Integer> carMap = carName.getCarList();
        carMap.forEach((key, value) -> {
            int count = forwardControl(getRandomNumber());
            carMap.put(key, value + count);
        });
        return carMap;
    }

    public final int getRandomNumber() {
        return Randoms.pickNumberInRange(0, 9);
    }

    public final int forwardControl(int RandomNumber) {
        if (RandomNumber >= 4) {
            return 1;
        }
        return 0;
    }
}
