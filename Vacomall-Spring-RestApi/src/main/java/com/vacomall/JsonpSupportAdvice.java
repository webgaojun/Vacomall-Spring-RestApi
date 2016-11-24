package com.vacomall;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.AbstractJsonpResponseBodyAdvice;

@ControllerAdvice
public class JsonpSupportAdvice extends AbstractJsonpResponseBodyAdvice {
    public JsonpSupportAdvice() {
        //参数包含callback的时候 使用jsonp的反馈形式
        super("callback");
    }
}