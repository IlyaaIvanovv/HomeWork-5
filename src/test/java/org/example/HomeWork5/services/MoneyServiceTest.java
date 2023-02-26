package org.example.HomeWork5.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class MoneyServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/data.csv")
    public void MonthsRest (int expected, int income, int expenses, int threshold) {
        MoneyService service = new MoneyService();
        //int income = 10_000;
        //int expenses = 3_000;
        //int threshold = 20_000;
        //int expected = 3;
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    public void MonthsRest2 () {
//        MoneyService service = new MoneyService();
//        int income = 100_000;
//        int expenses = 60_000;
//        int threshold = 150_000;
//        int expected = 2;
//        int actual = service.calculate(100_000, 60_000, 150_000);

//    Assertions.assertEquals(expected, actual);
    }
