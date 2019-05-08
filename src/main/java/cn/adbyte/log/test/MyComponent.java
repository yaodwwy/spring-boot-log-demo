package cn.adbyte.log.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author Adam
 */
@Component
@Slf4j
public class MyComponent {
    public MyComponent() {
        for (int i = 0; i < 1_000; i++) {
            log.trace("MyComponent trace: {}", i);
            log.debug("MyComponent debug: {}", i);
            log.info("MyComponent info: {}", i);
            log.warn("MyComponent warn: {}", i);
            log.error("MyComponent error: {}", i);
        }
    }
}
