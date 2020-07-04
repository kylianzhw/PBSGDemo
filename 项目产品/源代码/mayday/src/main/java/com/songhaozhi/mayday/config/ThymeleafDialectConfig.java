package com.songhaozhi.mayday.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.songhaozhi.mayday.config.thymeleaf.dialect.ThSysDialect;

/**
 * Thymeleaf配置
 */
@Configuration
public class ThymeleafDialectConfig {
	@Bean
	public ThSysDialect thSysDialect() {
		return new ThSysDialect();
	}
}
