package racingcar.controller;

import java.util.Scanner;
import racingcar.model.RacingCar;
import racingcar.view.InputView;
import racingcar.view.validator.InputValidator;

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
            RacingCar racingCar = new RacingCar(getCarName()[i], 0);
        }
    }
}
