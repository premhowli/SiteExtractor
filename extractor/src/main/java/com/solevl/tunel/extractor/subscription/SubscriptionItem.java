package com.solevl.tunel.extractor.subscription;

import java.io.Serializable;

public class SubscriptionItem implements Serializable {
    private final int serviceId;
    private final String url, name;

    public SubscriptionItem(int serviceId, String url, String name) {
        this.serviceId = serviceId;
        this.url = url;
        this.name = name;
    }

    public int getServiceId() {
        return serviceId;
    }

    public String getUrl() {
        return url;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) +
                "[name=" + name + " > " + serviceId + ":" + url + "]";
    }
}
