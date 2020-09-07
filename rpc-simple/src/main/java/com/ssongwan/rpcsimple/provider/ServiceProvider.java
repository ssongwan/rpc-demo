package com.ssongwan.rpcsimple.provider;

import com.ssongwan.rpccommon.entity.RpcServiceProperties;

public interface ServiceProvider {

    void addService(Object service, Class<?> serviceClass, RpcServiceProperties rpcServiceProperties);

    Object getService(RpcServiceProperties rpcServiceProperties);

    void publishService(Object service, RpcServiceProperties rpcServiceProperties);

    void publicService(Object service);
}
