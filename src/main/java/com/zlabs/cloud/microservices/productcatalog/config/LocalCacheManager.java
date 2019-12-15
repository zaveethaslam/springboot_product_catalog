package com.zlabs.cloud.microservices.productcatalog.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Service;

@Service
public class LocalCacheManager {

    @Autowired
    CacheManager cacheManager;

    public void evictAllCacheValues(String cacheName) {
        cacheManager.getCache(cacheName).clear();
    }
}
