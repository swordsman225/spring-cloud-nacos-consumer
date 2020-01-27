package com.huawei.hicloud.modules.exception;

import com.huawei.hicloud.model.vo.ResultVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler
    public ResultVO<Object> exceptionHandler(Exception e) {
        logger.info("Global exception handler, exception message: {}", e.getMessage());
        return ResultVO.builder()
                .code(ResultVO.RESULT_CODE_INTERNAL_SERVER_ERROR)
                .msg(e.getMessage())
                .build();
    }

}
