package com.xicheng.jdk8.chapter14;

import lombok.extern.slf4j.Slf4j;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 * description Duration
 *
 * @author xichengxml
 * @date 2020-01-21 15:58:27
 */
@Slf4j
public class Code079_01 {

	public static void main(String[] args) {
		LocalDateTime d1 = LocalDateTime.parse("2014-12-03T10:15:30");
		LocalDateTime d2 = LocalDateTime.parse("2016-03-05T23:15:00");
		Duration duration = Duration.between(d1, d2);
		log.info("duration: {}", duration);

		long toHours = duration.toHours();
		long toDays = duration.toDays();
		log.info("toHours: {}, toDays: {}", toHours, toDays);

		long toHours1 = Duration.between(d1.toLocalTime(), d2).toHours();
		long toHours2 = Duration.between(d1, d2.toLocalTime()).toHours();

	}
}
