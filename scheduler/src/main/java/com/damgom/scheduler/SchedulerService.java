package com.damgom.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class SchedulerService {

    /**
     * Spring Bean 으로 등록된 클래스만 가능
     * Parameter 사용 불가, return Type 은 void
     *
     * @ScheduleFixedDelay
     * fixedDelay 는 milliseconds 단위, 이전 Task 종료 시점부터 정의된 시간만큼 지난 후 Task 를 실행한다.
     */
    @Scheduled(fixedDelay = 1000)
    public void scheduleFixedDelayTask() {
        System.out.println(
                "Fixed delay task - " + System.currentTimeMillis() / 1000);
    }

    /**
     * @ScheduleFixedRate
     * 이전 task 시작 시점부터 정의된 시간만큼 지난 후 task 를 실행.
     */
    @Scheduled(fixedRate = 1000)
    public void scheduleFixedRate() {
        System.out.println(
                "Fixed rate task : " + System.currentTimeMillis() / 1000);
    }

    /**
     * @ScheduleInitialDelay
     * 초기지연시간을 설정한다. ex. initialDelay 가 5000인 경우 메소드가 등록되고 5초 후 정해진 시간마다 메소드 실행
     */
    @Scheduled(fixedDelay = 3000, initialDelay = 5000)
    public void scheduleInitialDelay() {
        System.out.println(
                "InitialDelay : " + System.currentTimeMillis() / 1000);
    }

    /**
     * cron 표현식을 이용해 작업을 예약
     * ex.(cron = "* * * * * *")
     * 초, 분, 시, 일, 월, 요일 순으로 예약 가능하다
     * 다음은 매일 23시 59분 59초에 실행하는 것을 의미
     */
    @Scheduled(cron = "59 59 23 * * *")
    public void scheduleCron() {
        System.out.println(
                "cron : " + System.currentTimeMillis() / 1000);
    }
}
