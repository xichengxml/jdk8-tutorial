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
 * @date 2020-03-30 09:57:58
 */
@Slf4j
public class Code081_01 {

	public static void main(String[] args) {
		LocalDate parse = LocalDate.parse("2018-03-25");
		// 4th monday in the month (2014-03-24)
		TemporalAdjuster temporalAdjuster01 = TemporalAdjusters.dayOfWeekInMonth(4, DayOfWeek.MONDAY);
		LocalDate date01 = parse.with(temporalAdjuster01);
		log.info("date: {}", date01);

		// 2nd Sunday in the month
		TemporalAdjuster temporalAdjuster02 = TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.SUNDAY);
		log.info("date: {}", parse.with(temporalAdjuster02));

		// 8th Friday in the month
		TemporalAdjuster temporalAdjuster03 = TemporalAdjusters.dayOfWeekInMonth(8, DayOfWeek.FRIDAY);
		log.info("date: {}", parse.with(temporalAdjuster03));
	}
}
