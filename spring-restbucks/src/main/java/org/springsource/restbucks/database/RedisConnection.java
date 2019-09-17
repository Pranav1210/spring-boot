package org.springsource.restbucks.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisConnection {
	private StringRedisTemplate connections;

	@Autowired
	public RedisConnection(StringRedisTemplate connections) {
		this.connections = connections;
	}
}
