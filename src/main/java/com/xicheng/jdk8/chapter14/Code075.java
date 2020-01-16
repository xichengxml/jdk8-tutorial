package com.xicheng.jdk8.chapter14;

import lombok.extern.slf4j.Slf4j;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * description simpleDateFormat在并发时结果可能不一致
 *
 * @author xichengxml
 * @date 2020-01-15 17:36:08
 */
@Slf4j
public class Code075 {

	/**
	 * 运行结果
	 * 10:50:38.063 [pool-1-thread-3] INFO com.xicheng.jdk8.chapter14.DateFormatBug - Thu Aug 16 00:00:00 CST 1509
	 * 10:50:38.063 [pool-1-thread-4] INFO com.xicheng.jdk8.chapter14.DateFormatBug - Thu Aug 16 00:00:00 CST 1509
	 * 10:50:38.063 [pool-1-thread-5] INFO com.xicheng.jdk8.chapter14.DateFormatBug - Thu Aug 16 00:00:00 CST 1509
	 * 10:50:38.063 [pool-1-thread-2] INFO com.xicheng.jdk8.chapter14.DateFormatBug - Thu Aug 16 00:00:00 CST 1509
	 * 10:50:38.063 [pool-1-thread-1] INFO com.xicheng.jdk8.chapter14.DateFormatBug - Thu Aug 16 00:00:00 CST 1509
	 * 10:50:38.076 [pool-1-thread-5] INFO com.xicheng.jdk8.chapter14.DateFormatBug - Mon Aug 16 00:00:00 CST 4748
	 * 10:50:38.076 [pool-1-thread-4] INFO com.xicheng.jdk8.chapter14.DateFormatBug - Wed Nov 28 00:00:00 CST 1520
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 10; i++) {
			executorService.submit(() -> {
				try {
					log.info(simpleDateFormat.parse("15081947").toString());
				} catch (ParseException e) {
					e.printStackTrace();
				}
			});
		}

		TimeUnit.SECONDS.sleep(5);
		executorService.shutdown();
	}
}
