package us.bojie.android_uts.utils;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static us.bojie.android_uts.utils.DateUtil.GET_MONTH_ERROR;
import static us.bojie.android_uts.utils.DateUtil.getMonthFromNumber;
import static us.bojie.android_uts.utils.DateUtil.monthNumbers;
import static us.bojie.android_uts.utils.DateUtil.months;

class DateUtilTest {
    private static final String today = "12-2019";

    @Test
    public void testGetCurrentTimestamp_returnedTimestamp() {
        assertDoesNotThrow(new Executable() {
            @Override
            public void execute() throws Throwable {
                assertEquals(today, DateUtil.getCurrentTimeStamp());
                System.out.println("Timestamp is generated correctly");
            }
        });
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11})
    public void getMonthFromNumber_returnSuccess(int monthNumber, TestInfo testInfo, TestReporter testReporter) {
        assertEquals(months[monthNumber], getMonthFromNumber(monthNumbers[monthNumber]));
        System.out.println(monthNumbers[monthNumber] + " : " + months[monthNumber]);
    }


    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11})
    public void testGetMonthFromNumber_returnError(int monthNumber, TestInfo testInfo, TestReporter testReporter) {
        int randomInt = new Random().nextInt(90) + 13;
        assertEquals(getMonthFromNumber(String.valueOf(monthNumber * randomInt)), GET_MONTH_ERROR);
        System.out.println(monthNumbers[monthNumber] + " : " + GET_MONTH_ERROR);
    }
}
