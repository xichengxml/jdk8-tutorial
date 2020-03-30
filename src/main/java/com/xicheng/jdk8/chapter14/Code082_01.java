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
 * @date 2020-03-30 11:06:58
 */
@Slf4j
public class Code082_01 {

	public static void main(String[] args) {
		LocalDate parse = LocalDate.parse("2020-03-30");
		TemporalAdjuster nextWorkingDay = temporal -> {
			LocalDate localDate = (LocalDate) temporal;
			DayOfWeek dayOfWeek = localDate.getDayOfWeek();
			if (DayOfWeek.FRIDAY.equals(dayOfWeek) || DayOfWeek.SATURDAY.equals(dayOfWeek)) {
				return localDate.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
			} else {
				return localDate.plusDays(1);
			}
		};
		log.info("nextWorkingDay: {}", parse.with(nextWorkingDay));
	}
}
