package racingcar.controller;

import racingcar.model.RacingCar;
import racingcar.model.RacingCarMove;
import racingcar.model.RandomNumber;
import racingcar.view.InputView;


public class RacingGameController {

    public String[] getCarName() {
        InputView inputView = new InputView();
        return inputView.splitCarName(inputView.inputCarName());
    }

    public int getTryCount() {
        InputView inputView = new InputView();
        return inputView.convertStringToInt(inputView.inputTryCount());
    }

    public void initRacingGame() {
        for (int i = 0; i < getCarName().length; ++i) {
            RacingCarMove racingCarMove = new RacingCarMove();
            RandomNumber randomNumber = new RandomNumber();
            RacingCar racingCar = new RacingCar(getCarName()[i], racingCarMove.move(randomNumber));
        }
    }

    // RacingCar 객체는 한번만 만들고 RacingCarMove 매번 생성하여 랜덤값 대입
    // currentPosition 에 move() 더하는 방식 - 이동했으면 +1 안했으면 +0
}
