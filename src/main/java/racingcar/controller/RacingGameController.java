package racingcar.controller;

import java.util.ArrayList;
import java.util.List;
import racingcar.model.GameTryCount;
import racingcar.model.RacingCar;
import racingcar.model.RacingCarName;
import racingcar.model.RacingCarMove;
import racingcar.model.RandomNumber;
import racingcar.model.Winner;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RacingGameController {

    final InputView inputView = new InputView();

    private ArrayList<RacingCar> racingCarList = new ArrayList<>();

    public void initCarName() {
        for (String carNames : RacingCarName.getList(inputView)) {
            RacingCar racingCar = new RacingCar(carNames);
            racingCarList.add(racingCar);
        }
    }

    // 분리 필요
    public void initTryCount() {
        RacingCarMove racingCarMove = new RacingCarMove();
        RandomNumber randomNumber = new RandomNumber();
        GameTryCount gameTryCount = new GameTryCount();

        int tryCount = gameTryCount.get();
        OutputView.printInitResult();

        for (int i = 0; i < tryCount; i++) {
            printRoundResult(racingCarMove, randomNumber);
            System.out.println();
        }
    }

    public void startGame() {
        initCarName();
        initTryCount();
    }

    private void printRoundResult(RacingCarMove racingCarMove, RandomNumber randomNumber) {
        for (RacingCar car : racingCarList) {
            car.move(racingCarMove, randomNumber);
            OutputView.printRoundResult(car);
        }
    }

    private void endGame() {
        Winner winner = new Winner();
        List<String> winnersList = winner.getList(racingCarList, winner.maxPosition(racingCarList));
        String winners = String.join(",", winnersList);
        OutputView.printEndResult(winners);
    }

    public void run() {
        startGame();
        endGame();
        inputView.close();
    }

    // currentPosition 에 move() 더하는 방식 - 이동했으면 +1 안했으면 +0
}
