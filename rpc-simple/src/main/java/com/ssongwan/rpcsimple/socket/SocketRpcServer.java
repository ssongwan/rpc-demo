package com.ssongwan.rpcsimple.socket;

import com.ssongwan.rpccommon.factory.SingletonFactory;
import com.ssongwan.rpccommon.utils.ThreadPoolFactoryUtils;
import com.ssongwan.rpcsimple.provider.ServiceProvider;
import com.ssongwan.rpcsimple.provider.ServiceProviderImpl;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;

@Slf4j
public class SocketRpcServer {

    private final ExecutorService threadPool;
    private final ServiceProvider serviceProvider;

    public SocketRpcServer() {
        threadPool = ThreadPoolFactoryUtils.createCustomThreadPoolIfAbsent("socket-server-rpc-pool");
//        SingletonFactory.getInstance(ServiceProviderImpl.class);
        serviceProvider = SingletonFactory.getInstance(ServiceProviderImpl.class);
    }

    public void registerService(Object service) {
        serviceProvider.publicService(service);
    }


}
