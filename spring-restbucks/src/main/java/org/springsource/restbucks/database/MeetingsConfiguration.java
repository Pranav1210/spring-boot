package org.springsource.restbucks.database;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.ReactiveRedisConnectionFactory;
import org.springframework.data.redis.core.ReactiveRedisOperations;
import org.springframework.data.redis.core.ReactiveRedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializationContext;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springsource.restbucks.model.Meetings;

@Configuration
public class MeetingsConfiguration {
	@Bean
	ReactiveRedisOperations<String, Meetings> redisOperations(ReactiveRedisConnectionFactory factory) {
		Jackson2JsonRedisSerializer<Meetings> serializer =
				new Jackson2JsonRedisSerializer<>(Meetings.class);
		RedisSerializationContext.RedisSerializationContextBuilder<String, Meetings> builder =
				RedisSerializationContext.newSerializationContext(new StringRedisSerializer());
		RedisSerializationContext<String, Meetings> context = builder.value(serializer).build();
		return new ReactiveRedisTemplate<>(factory, context);
	}
}
