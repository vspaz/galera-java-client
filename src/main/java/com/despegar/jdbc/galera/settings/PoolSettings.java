package com.despegar.jdbc.galera.settings;

public class PoolSettings {
    public final int maxConnectionsPerHost;
    public final int minConnectionsIdlePerHost;
    public final long connectTimeout;
    public final long connectionTimeout;
    public final long readTimeout;
    public final long idleTimeout;
    public final boolean autocommit;

    public PoolSettings(int maxConnectionsPerHost, int minConnectionsIdlePerHost, long connectTimeout, long connectionTimeout, long readTimeout,
                        long idleTimeout, boolean autocommit) {
        this.maxConnectionsPerHost = maxConnectionsPerHost;
        this.minConnectionsIdlePerHost = (minConnectionsIdlePerHost <= 0) ? maxConnectionsPerHost : minConnectionsIdlePerHost;
        this.connectTimeout = connectTimeout;
        this.connectionTimeout = connectionTimeout;
        this.readTimeout = readTimeout;
        this.idleTimeout = idleTimeout;
        this.autocommit = autocommit;
    }
}
