// Generated by HybirdPB CodeGenerator(1.2.0). DO NOT EDIT!
// Generation date is 2020-03-02 06:36:45

package com.aliyun.mpaas.demo.android60.launcher;

import com.alipay.mobile.framework.service.ext.annotation.CheckLogin;
import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;

import com.aliyun.mpaas.demo.android60.launcher.request.PathMpaasMgsHttpPostEncryptrequestbodySm2PostReq;
   
public interface Demo_BackendServerClient {

    @SignCheck
    @OperationType("op_mPaaS_Mgs_Http_Post_EncryptRequestBody_SM2") 
    public String pathMpaasMgsHttpPostEncryptrequestbodySm2Post(PathMpaasMgsHttpPostEncryptrequestbodySm2PostReq requestParam);


}