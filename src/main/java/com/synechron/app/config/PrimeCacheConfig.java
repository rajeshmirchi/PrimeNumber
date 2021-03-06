package com.synechron.app.config;

import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import net.sf.ehcache.CacheManager;
import net.sf.ehcache.config.CacheConfiguration;

@Configuration
@EnableCaching
public class PrimeCacheConfig extends CachingConfigurerSupport {
	
	@Bean
	public net.sf.ehcache.CacheManager ehCacheManager(){ 
		
		CacheConfiguration tenSecondsCache = new CacheConfiguration();
		tenSecondsCache.setName("ten-seconds-cache");
		tenSecondsCache.setMemoryStoreEvictionPolicy("LRU");
		tenSecondsCache.setMaxEntriesLocalHeap(100);
		tenSecondsCache.setTimeToLiveSeconds(10);
		
		net.sf.ehcache.config.Configuration config = new net.sf.ehcache.config.Configuration();
		config.addCache(tenSecondsCache);
		
		return CacheManager.newInstance(config);
	}
	
	@Bean
	public org.springframework.cache.CacheManager cacheManager()
	{
		return new EhCacheCacheManager(ehCacheManager());
	}
}
