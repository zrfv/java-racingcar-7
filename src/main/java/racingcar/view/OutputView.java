package racingcar.view;

public class OutputView {

    public static void printInitResult() {
        System.out.println();
        System.out.println("실행 결과");
    }

    public static void printRoundResult(Object object) {
        System.out.println(object.toString());
    }

    public static void printEndResult(String winners) {
        System.out.println("최종 우승자 : " + winners);
    }
}
