package com.xicheng.jdk8.chapter14;

import lombok.extern.slf4j.Slf4j;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/**
 * description
 *
 * @author liubin52
 * @date 2020-03-30 10:57:18
 */
@Slf4j
public class Code081_03 {

	public static void main(String[] args) {
		LocalDate parse = LocalDate.parse("2020-03-30");
		log.info("firstInMonth: {}", parse.with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY)));
		log.info("lastInMonth: {}", parse.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY)));
	}
}
