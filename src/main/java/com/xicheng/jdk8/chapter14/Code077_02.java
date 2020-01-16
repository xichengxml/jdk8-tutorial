package com.xicheng.jdk8.chapter14;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoField;

/**
 * description LocalTime
 *
 * @author xichengxml
 * @date 2020-01-16 11:10:28
 */
@Slf4j
public class Code077_02 {

	public static void main(String[] args) {
		LocalTime of = LocalTime.of(11, 13, 15);
		LocalTime parse = LocalTime.parse("11:13:15.111315");
		LocalTime now = LocalTime.now();
		LocalTime now1 = LocalTime.now(ZoneId.of("America/Chicago"));
		log.info("of: {}, parse: {}, now: {}, now1: {}", of, parse, now, now1);

		int hour = now.getHour();
		int minute = now.getMinute();
		int second = now.get(ChronoField.SECOND_OF_MINUTE);
		log.info("hour: {}, minute: {}, second: {}", hour, minute, second);
	}
}
