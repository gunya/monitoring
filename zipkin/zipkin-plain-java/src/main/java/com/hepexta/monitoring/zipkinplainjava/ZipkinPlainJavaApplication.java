package com.hepexta.monitoring.zipkinplainjava;

import com.hepexta.monitoring.zipkinplainjava.code.DummyAggregator;

public class ZipkinPlainJavaApplication {

    public static void main(String[] args) {
        new DummyAggregator().execute(args[0]);
    }

}

