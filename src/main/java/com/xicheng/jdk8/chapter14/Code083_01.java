package com.xicheng.jdk8.chapter14;

import lombok.extern.slf4j.Slf4j;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Set;

/**
 * description
 *
 * @author liubin52
 * @date 2020-04-08 12:07:12
 */
@Slf4j
public class Code083_01 {

	public static void main(String[] args) {
		ZoneId zoneId = ZoneId.of("Asia/Kolkata");
		log.info("zoneId: {}", zoneId);
		ZoneOffset zoneOffset = ZoneOffset.of("+08:00");
		log.info("zoneOffset: {}", zoneOffset);
		Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
		log.info("availableZoneIds: {}", availableZoneIds);
	}
}
