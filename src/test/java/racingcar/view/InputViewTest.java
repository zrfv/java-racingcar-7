package racingcar.view;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import racingcar.view.InputView;

public class InputViewTest {
    @Test
    void 문자열을_숫자로_바꾸는_테스트() {
        InputView inputView = new InputView();
        assertEquals(inputView.convertStringToInt("12345"),12345);
    }
}
