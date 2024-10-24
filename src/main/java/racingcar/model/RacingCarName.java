package racingcar.model;

import java.util.HashSet;
import racingcar.view.InputView;

public class RacingCarName {

    private static final String DUPLICATE_NAMES = "자동차 이름이 중복되었습니다.";

    public static String[] getList(final InputView inputView) {
        String[] carNames = inputView.splitCarName(inputView.inputCarName());
        validateDuplicateNames(carNames);
        return carNames;
    }

    public static void validateDuplicateNames(final String[] carNames) {
        var nameSet = new HashSet<String>();
        for (String name : carNames) {
            if (!nameSet.add(name)) {
                throw new IllegalArgumentException(DUPLICATE_NAMES);
            }
        }
    }
}
