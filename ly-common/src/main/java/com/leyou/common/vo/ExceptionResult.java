package com.leyou.common.vo;

import com.leyou.common.enums.ExceptionEnum;
import lombok.Getter;

@Getter
public class ExceptionResult {
    private int status;
    private String message;
    private Long timestamp;

    public ExceptionResult(ExceptionEnum em) {
        this.status = em.getCode();
        this.message = em.getMsg();
        this.timestamp = System.currentTimeMillis();
    }
}
