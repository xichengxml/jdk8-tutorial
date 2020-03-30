package com.xicheng.jdk8.chapter14;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * description
 *
 * @author liubin52
 * @date 2020-03-30 09:41:02
 */
@Slf4j
public class Code079_02 {

	public static void main(String[] args) {
		LocalDate date01 = LocalDate.parse("2018-03-25");
		LocalDate date02 = LocalDate.parse("2020-03-30");

		Period between = Period.between(date01, date02);
		int days = between.getDays();
		int months = between.getMonths();
		int years = between.getYears();

		log.info("{}年零{}个月零{}天", years, months, days);

		long until = date01.until(date02, ChronoUnit.DAYS);
		log.info("共{}天", until);
	}
}
