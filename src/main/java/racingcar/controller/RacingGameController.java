package racingcar.controller;

import java.util.ArrayList;
import racingcar.model.RacingCar;
import racingcar.model.RacingCarName;
import racingcar.model.RacingCarMove;
import racingcar.model.RandomNumber;
import racingcar.model.Winner;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RacingGameController {

    final InputView inputView = new InputView();
    final RandomNumber randomNumber = new RandomNumber();
    final Winner winner = new Winner();

    private ArrayList<RacingCar> racingCarList = new ArrayList<>();
    private int tryCount;

    public void initCarName() {
        for (String carNames : RacingCarName.getList(inputView)) {
            final RacingCar racingCar = new RacingCar(carNames);
            racingCarList.add(racingCar);
        }
    }

    // 추후 수정
    public void initTryCount() {
        String inputTryCount = inputView.inputTryCount();
        tryCount = inputView.convertStringToInt(inputTryCount);
    }

    public void printRoundResult() {
        final RacingCarMove racingCarMove = new RacingCarMove();
        for (int i = 0; i < tryCount; i++) {
            printCarPosition(racingCarMove, randomNumber);
            System.out.println();
        }
    }

    public void startGame() {
        initCarName();
        initTryCount();
    }

    private void printCarPosition(RacingCarMove racingCarMove, RandomNumber randomNumber) {
        for (RacingCar car : racingCarList) {
            car.move(racingCarMove, randomNumber);
            OutputView.printRoundResult(car);
        }
    }

    private void endGame() {
        OutputView.printInitResult();
        printRoundResult();
        String winners = winner.getList(racingCarList, winner.maxPosition(racingCarList));
        OutputView.printEndResult(winners);
    }

    public void run() {
        startGame();
        endGame();
        inputView.close();
    }

    // currentPosition 에 move() 더하는 방식 - 이동했으면 +1 안했으면 +0
}
