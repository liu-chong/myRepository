package com.example.demo.response;

import com.example.demo.response.WebResponse;

public final class WebResponseUtils {
    public static <T> WebResponse<T> successWebResponse(T t) {
        return (WebResponse<T>) WebResponse.builder().code(0).message("OK").data(t).build();
    }

//    public static <T> WebPageResponse<T> errorWebResponse(IBizCode iBizCode) {
//        return (WebPageResponse<T>) WebPageResponse.builder()
//                .code(iBizCode.getCode())
//                .message(iBizCode.getMessage())
//                .build();
//    }
//    public static  WebPageResponse errorWebResponse(int code , String message) {
//        return  WebPageResponse.builder()
//                .code(code)
//                .message(message)
//                .build();
//    }
//    public static <T extends List> WebPageResponse<T> successWebResponse(T t, PageInfo pageInfo) {
//        return (WebPageResponse<T>) WebPageResponse.builder().code(0).message("OK").pageList(t).pageInfo(pageInfo).build();
//    }
//
//    public static <T> WebResponse<T> errorResponse(String message) {
//        return (WebResponse<T>) WebResponse.builder()
//                .code(ResponseStatusEnum.BUSINESS_ERROR.getCode())
//                .message(message)
//                .build();
//    }
//    public static <T> WebResponse<T> itemAddErrorResponse(String message) {
//        return (WebResponse<T>) WebResponse.builder()
//                .code(ResponseStatusEnum.ITEM_ERROR.getCode())
//                .message(message)
//                .build();
//    }

    public static <T> WebResponse<T> errorResponse(int code,String message,Object data) {
        return (WebResponse<T>) WebResponse.builder()
                .code(code)
                .message(message)
                .data(data)
                .build();
    }
//    public static <T> WebResponse<T> errorResponse(IBizCode iBizCode) {
//        return (WebResponse<T>) WebResponse.builder()
//                .code(iBizCode.getCode())
//                .message(iBizCode.getMessage())
//                .build();
//    }
}
