package com.hepexta.monitoring.zipkinplainjava.tracer;

import brave.Span;
import brave.Tracing;
import zipkin2.reporter.AsyncReporter;
import zipkin2.reporter.okhttp3.OkHttpSender;

public class LocalTracerImpl implements LocalTracer {

    private static LocalTracerImpl instance;
    private AsyncReporter reporter;
    private Tracing tracing;
    private Span parentSpan;

    public static LocalTracerImpl getInstance() {
        if (instance == null){
            instance = new LocalTracerImpl();
        }
        return instance;
    }

    private LocalTracerImpl() {
        reporter = AsyncReporter.create(OkHttpSender.create("http://localhost:9411/api/v2/spans"));
        tracing = Tracing.newBuilder()
                .localServiceName("zipkin-plain-java")
                .spanReporter(reporter)
                .build();
    }

    public void start() {
        parentSpan = tracing.tracer().newTrace().name("simpleSpan").start();
    }

    public LocalSpan startChild() {
        Span start = tracing.tracer().newChild(parentSpan.context()).start();
        return new LocalSpanImpl(start);
    }

    public void close() {
        reportSpan();
        tracing.close();
        reporter.close();
    }

    private void reportSpan() {
        try {
            parentSpan.finish();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
