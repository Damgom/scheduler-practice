package com.damgom.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class SchedulerService {

    /**
     * Spring Bean 으로 등록된 클래스만 가능
     * Parameter 사용 불가, return Type 은 void
     * fixedDelay 는 milliseconds 단위, 이전 Task 종료 시점부터 정의된 시간만큼 지난 후 Task 를 실행한다.
     */
    @Scheduled(fixedDelay = 1000)
    public void scheduleFixedDelayTask() {
        System.out.println(
                "Fixed delay task - " + System.currentTimeMillis() / 1000);
    }

    
}
