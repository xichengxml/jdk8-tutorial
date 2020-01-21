package com.xicheng.jdk8.chapter14;

import lombok.extern.slf4j.Slf4j;

import java.time.Instant;

/**
 * description Instant
 *
 * @author liubin52
 * @date 2020-01-16 13:26:20
 */
@Slf4j
public class Code077_04 {

	public static void main(String[] args) {
		Instant now = Instant.now();
		Instant parse = Instant.parse("1969-01-01T00:00:00.00Z");
		log.info("now: {}", now.getEpochSecond());
		log.info("parse: {}", parse.getEpochSecond());
	}
}
