package cn.adbyte.log;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SpringBootLogDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootLogDemoApplication.class, args);
        for (int i = 0; i < 1_000; i++) {
            log.trace("trace: {}", i);
            log.debug("debug: {}", i);
            log.info("info: {}", i);
            log.warn("warn: {}", i);
            log.error("error: {}", i);
        }
    }

}
