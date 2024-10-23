package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.view.validator.InputValidator;

public class InputView {

    private final String INITIAL_INPUT_CAR_NAME = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private final String INITIAL_INPUT_TRY_COUNT = "시도할 횟수는 몇 회인가요?";

    InputValidator inputValidator = new InputValidator();

    public String inputCarName() {
        System.out.println(INITIAL_INPUT_CAR_NAME);
        String carName = Console.readLine();

        inputValidator.checkEmptyString(carName);
        inputValidator.checkSingleCar(carName);

        return carName;
    }

    public String inputTryCount() {
        System.out.println(INITIAL_INPUT_TRY_COUNT);
        String tryCount = Console.readLine();

        inputValidator.checkEmptyString(tryCount);

        return tryCount;
    }

    public void close() {
        Console.close();
    }
}
