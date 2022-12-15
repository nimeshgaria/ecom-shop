package com.nimesh.shop.productws.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BaseResponse {
    private int statusCode;
    private boolean success;
    private String message;
    private Object result;
}
