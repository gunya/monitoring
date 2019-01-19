package com.hepexta.monitoring.zipkinplainjava.tracer;

public interface LocalSpan {
    void annotate(String value);
    void finish();
}
