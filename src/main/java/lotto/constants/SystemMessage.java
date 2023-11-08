package lotto.constants;

public enum SystemMessage {

    INPUT_MONEY("구입금액을 입력해 주세요.\n"),
    INPUT_WINNING_NUMBER("당첨 번호를 입력해 주세요.\n"),
    INPUT_BONUS_NUMBER("보너스 번호를 입력해 주세요.\n"),
    LOTTO_AMOUNT("%d개를 구매했습니다.\n"),
    EMPTY_STRING("\n");

    ;

    private final String message;

    private SystemMessage(String message) {
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
