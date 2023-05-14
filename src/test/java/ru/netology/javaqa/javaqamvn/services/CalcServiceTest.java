package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalcServiceTest {

    @ParameterizedTest
    @CsvSource({
            "10_000, 3_000, 20_000",
            "100_000, 60_000, 150_000"
    })

    public void testIsThereEnoughMoney(int income, int expense, int threshold){
        CalcService service = new CalcService();

        int actual = service.calculate(income, expense, threshold);

        Assertions.assertEquals(money, actual);


    }
}
