package com.hepexta.monitoring.zipkinplainjava.tracer;

public interface LocalTracer {
    void start();
    LocalSpan startChild();
    void close();
}
