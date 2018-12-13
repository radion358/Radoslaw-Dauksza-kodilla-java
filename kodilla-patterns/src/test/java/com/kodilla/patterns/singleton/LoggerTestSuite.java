package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void getLastLog() {
        //Given
        //When
        Logger.getInstance().log("Something");
        String lastLog = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("Something", lastLog);
    }
}
