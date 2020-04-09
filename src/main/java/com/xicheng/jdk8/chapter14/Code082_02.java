package com.xicheng.jdk8.chapter14;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * description
 *
 * @author liubin52
 * @date 2020-04-08 11:49:03
 */
@Slf4j
public class Code082_02 {

	public static void main(String[] args) {
		DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		log.info("date: {}", dateTimeFormatter1.format(LocalDate.of(2020, 4, 8)));

		// for localization
		DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("dd-MMM-yyyy", Locale.FRENCH);
		log.info("french date: {}", dateTimeFormatter2.format(LocalDate.of(2020, 4, 8)));
	}
}
