package com.xicheng.jdk8.chapter14;

import lombok.extern.slf4j.Slf4j;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/**
 * description
 *
 * @author liubin52
 * @date 2020-03-30 10:59:27
 */
@Slf4j
public class Code081_04 {

	public static void main(String[] args) {
		LocalDate parse = LocalDate.parse("2020-03-30");
		log.info("next: {}", parse.with(TemporalAdjusters.next(DayOfWeek.MONDAY)));
		log.info("nextOrSame: {}", parse.with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY)));
		log.info("previous: {}", parse.with(TemporalAdjusters.previous(DayOfWeek.MONDAY)));
		log.info("previousOrSame: {}", parse.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY)));
	}
}
