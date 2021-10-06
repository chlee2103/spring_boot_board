package sty.s01.demo.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@ToString
public class RestResponse<T> {
    @Getter
    @AllArgsConstructor
    enum ResultCode{ // 생성자가 없을 때 에러 발생.
        SUCCESS("00","성공")
        , FAIL("01", "실패");
        private String resultCode;     // 00, 01
        private String resultMessage;  // 성공, 실패
    }
    private String code = ResultCode.SUCCESS.getResultCode();
    private String message = ResultCode.SUCCESS.getResultMessage();
    private T data;  // Generic에 T를 하면 나중에 쓸 WrapperClass를 넣어주면됨.
}
