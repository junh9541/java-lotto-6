package lotto.constants;

public enum ErrorMessage {

    ERROR_NOT_INT("[ERROR] 숫자를 입력해 주세요."),
    ERROR_NOT_POSITIVE("[ERROR] 양수를 입력해 주세요."),
    ERROR_MONEY_LACK("[ERROR] 1000 이상의 수를 입력해 주세요."),
    ERROR_MONEY_DIV("[ERROR] 1000 단위로 입력해 주세요."),
    ERROR_LOTTO_RANGE("[ERROR] 로또 번호는 1부터 45 사이의 수로 입력해 주세요."),
    ERROR_LOTTO_DUPLICATE("[ERROR] 로또 번호는 중복되지 않도록 입력해 주세요."),
    ERROR_LOTTO_SIZE("[ERROR] 로또 번호는 6개 수로 입력해 주세요."),;
    private final String message;

    private ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
