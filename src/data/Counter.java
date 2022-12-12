package data;

import java.util.concurrent.atomic.AtomicLong;

public class Counter {
    private static final AtomicLong atomicLongId = new AtomicLong();
    private final Long id;

    public Counter() {
        this.id = atomicLongId.incrementAndGet();
    }

    public Long getId() {
        return id;
    }
}
