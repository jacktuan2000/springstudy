package com.yonyou.up.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.yonyou.up.controller.PersonController;

//统一的异常返回json
@ControllerAdvice
public class ExceptionControllerHandler {
	private Logger logger = LoggerFactory.getLogger(PersonController.class);     
	@ExceptionHandler(value = Exception.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public ErrorResponse errorResponse(Exception exception) {
		logger.error(exception.getMessage());
        return new ErrorResponse(exception.getMessage());
    }
	 
}
