package com.xicheng.jdk8.chapter14;

import lombok.extern.slf4j.Slf4j;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/**
 * description
 *
 * @author liubin52
 * @date 2020-03-30 09:50:12
 */
@Slf4j
public class Code080 {

	public static void main(String[] args) {
		// Suppose to find out the next sunday after the java 8 release date.
		LocalDate parse = LocalDate.parse("2018-03-18");
		TemporalAdjuster temporalAdjuster = TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY);
		log.info("date: {}", parse.with(temporalAdjuster));
	}
}
