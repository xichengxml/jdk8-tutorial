package com.xicheng.jdk8.chapter14;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.ChronoField;

/**
 * description LocalDate
 *
 * @author xichengxml
 * @date 2020-01-16 10:58:38
 */
@Slf4j
public class Code077_01 {

	public static void main(String[] args) {
		LocalDate of = LocalDate.of(2020, 1, 16);
		LocalDate parse = LocalDate.parse("2020-01-16");
		LocalDate now = LocalDate.now();
		LocalDate now1 = LocalDate.now(ZoneId.of("America/Chicago"));
		log.info("of: {}, parse: {}, now: {}, now1: {}", of, parse, now, now1);

		Month month = now.getMonth();
		int dayOfYear = now.getDayOfYear();
		int year = now.get(ChronoField.YEAR);
		log.info("year: {}, month: {}, date: {}", year, month, dayOfYear);
	}
}
