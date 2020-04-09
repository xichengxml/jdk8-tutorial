package com.xicheng.jdk8.chapter14;

import lombok.extern.slf4j.Slf4j;

import java.time.ZoneId;
import java.time.zone.ZoneRules;
import java.time.zone.ZoneRulesProvider;
import java.util.HashSet;
import java.util.NavigableMap;
import java.util.Set;

/**
 * description
 *
 * @author liubin52
 * @date 2020-04-08 12:14:37
 */
@Slf4j
public class Code083_02 {

	public static void main(String[] args) {
		ZoneRulesProvider.registerProvider(new MyZoneRulesProvider());
		Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
		log.info("availableZoneIds: {}", availableZoneIds);
	}
}

class MyZoneRulesProvider extends ZoneRulesProvider {
	@Override
	protected Set<String> provideZoneIds() {
		Set<String> set = new HashSet<>();
		set.add("China/Beijing");
		set.add("China/Shanghai");
		set.add("China/Guangzhou");
		return set;
	}

	@Override
	protected ZoneRules provideRules(String zoneId, boolean forCaching) {
		return null;
	}

	@Override
	protected NavigableMap<String, ZoneRules> provideVersions(String zoneId) {
		return null;
	}
}
