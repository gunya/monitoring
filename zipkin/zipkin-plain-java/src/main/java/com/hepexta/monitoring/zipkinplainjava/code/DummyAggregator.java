package com.hepexta.monitoring.zipkinplainjava.code;

import com.hepexta.monitoring.zipkinplainjava.tracer.LocalTracerImpl;

public class DummyAggregator {

    public String execute(String str) {
        LocalTracerImpl tracer = startLocalTracer();
        String result = null;
        if (DummyValidator.validate(str)){
            result = DummyParser.parse(str);
        }
        tracer.close();
        return result;
    }

    private LocalTracerImpl startLocalTracer() {
        LocalTracerImpl tracer = LocalTracerImpl.getInstance();
        tracer.start();
        return tracer;
    }
}
