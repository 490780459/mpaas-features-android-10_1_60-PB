// Generated by HybirdPB CodeGenerator(1.2.0). DO NOT EDIT!
// Generation date is 2020-02-29 20:11:36

package com.aliyun.mpaas.demo.android60.launcher;

import com.alipay.mobile.framework.service.ext.annotation.CheckLogin;
import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;

import com.aliyun.mpaas.demo.android60.launcher.request.PathMpaasMgsHttpGetQuerystrGetReq;
   
public interface Demo_BackendServerClient {

    @SignCheck
    @OperationType("op_mPaaS_Mgs_Http_Get_QueryStr") 
    public String pathMpaasMgsHttpGetQuerystrGet(PathMpaasMgsHttpGetQuerystrGetReq requestParam);


}