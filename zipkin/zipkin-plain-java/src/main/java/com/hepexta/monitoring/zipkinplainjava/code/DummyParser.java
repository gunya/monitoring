package com.hepexta.monitoring.zipkinplainjava.code;

import com.hepexta.monitoring.zipkinplainjava.tracer.LocalSpan;
import com.hepexta.monitoring.zipkinplainjava.tracer.LocalTracerImpl;

public class DummyParser {
    public static String parse(String str) {
        LocalSpan span = LocalTracerImpl.getInstance().startChild();
        span.annotate("DummyParser");
        span.finish();
        return String.format("Hello, %s", str);
    }
}
