package com.hepexta.monitoring.zipkinplainjava;

import com.hepexta.monitoring.zipkinplainjava.code.DummyAggregator;
import org.junit.Assert;
import org.junit.Test;

public class ZipkinPlainJavaApplicationTests {

    @Test
    public void testApplication() {
        String world = "world";
        String result = new DummyAggregator().execute(world);
        Assert.assertEquals("Hello, world", result);
    }
}

