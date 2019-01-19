package com.hepexta.monitoring.zipkinplainjava.code;

public class DummyAggregator {

    public String execute(String str) {
        if (DummyValidator.validate(str)){
            return DummyParser.parse(str);
        }
        return null;
    }
}
