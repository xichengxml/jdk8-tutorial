package com.xicheng.jdk8.chapter14;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

/**
 * description LocalDateTime
 *
 * @author xichengxml
 * @date 2020-01-16 11:25:57
 */
@Slf4j
public class Code077_03 {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime parse = LocalDateTime.parse("2020-01-06T11:30:31");

		int week = parse.get(ChronoField.ALIGNED_WEEK_OF_YEAR);
		LocalDate localDate = now.toLocalDate();
		LocalTime localTime = now.toLocalTime();
		log.info("week: {}, localDate: {}, localTime: {}", week, localDate, localTime);
	}
}
