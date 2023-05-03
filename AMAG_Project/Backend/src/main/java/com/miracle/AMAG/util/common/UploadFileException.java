package com.miracle.AMAG.util.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UploadFileException extends RuntimeException {
    private final ErrorCode errorCode;
}
