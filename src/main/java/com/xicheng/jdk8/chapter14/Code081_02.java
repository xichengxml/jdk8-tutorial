package com.xicheng.jdk8.chapter14;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/**
 * description
 *
 * @author liubin52
 * @date 2020-03-30 10:49:33
 */
@Slf4j
public class Code081_02 {

	public static void main(String[] args) {
		LocalDate parse = LocalDate.parse("2018-03-25");
		log.info("firstDayOfYear: {}", parse.with(TemporalAdjusters.firstDayOfYear()));
		log.info("firstDayOfNextYear: {}", parse.with(TemporalAdjusters.firstDayOfNextYear()));
		log.info("firstDayOfMonth: {}", parse.with(TemporalAdjusters.firstDayOfMonth()));
		log.info("firstDayOfNextMonth: {}", parse.with(TemporalAdjusters.firstDayOfNextMonth()));
		log.info("lastDayOfMonth: {}", parse.with(TemporalAdjusters.lastDayOfMonth()));
		log.info("lastDayOfYear: {}", parse.with(TemporalAdjusters.lastDayOfYear()));
	}
}
