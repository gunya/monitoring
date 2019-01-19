package com.hepexta.monitoring.zipkinplainjava.code;

import com.hepexta.monitoring.zipkinplainjava.tracer.LocalSpan;
import com.hepexta.monitoring.zipkinplainjava.tracer.LocalTracerImpl;

public class DummyValidator {
    public static boolean validate(String str) {
        LocalSpan span = LocalTracerImpl.getInstance().startChild();
        span.annotate("DummyValidator");
        span.finish();
        return str != null;
    }
}
