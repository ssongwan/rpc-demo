package com.ssongwan.rpccommon.entity;

import java.util.Objects;

public class RpcServiceProperties {

    private String version;

    private String group;

    private String serviceName;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public RpcServiceProperties(String version, String group, String serviceName) {
        this.version = version;
        this.group = group;
        this.serviceName = serviceName;
    }

    public RpcServiceProperties() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RpcServiceProperties that = (RpcServiceProperties) o;
        return Objects.equals(version, that.version) &&
                Objects.equals(group, that.group) &&
                Objects.equals(serviceName, that.serviceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, group, serviceName);
    }

    @Override
    public String toString() {
        return "RpcServiceProperties{" +
                "version='" + version + '\'' +
                ", group='" + group + '\'' +
                ", serviceName='" + serviceName + '\'' +
                '}';
    }
}
