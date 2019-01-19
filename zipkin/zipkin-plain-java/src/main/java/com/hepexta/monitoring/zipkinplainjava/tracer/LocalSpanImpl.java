package com.hepexta.monitoring.zipkinplainjava.tracer;

import brave.Span;

public class LocalSpanImpl implements LocalSpan{

    private Span span;
    public LocalSpanImpl(Span span) {
        this.span = span;
    }

    public void annotate(String value) {
        span.annotate(value);
    }

    public void finish() {
        span.finish();
    }
}
