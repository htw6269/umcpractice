package umc.spring.apiPayload.code.status;

public enum SuccessStatus {
    _OK("OK", "요청이 성공했습니다.");
    // 다른 성공 상태 정의...

    private final String code;
    private final String message;

    SuccessStatus(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
    }
