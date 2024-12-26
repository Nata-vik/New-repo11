package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;


public class HolidaysServiceTest {

  @ParameterizedTest
  @CsvFileSource(files="src/test/resources/file.scv")

  public void HolidayDays(int income, int expenses, int treshold, int expected) {
      HolidaysService service = new HolidaysService();

      //int income = 10000;
      //int expenses = 3000;
      //int treshold = 20000;
      //int expected = 3;

      int countHolidays = HolidaysService.calculate(income, expenses, treshold);;
      Assertions.assertEquals(expected, HolidaysService.calculate(income, expenses, treshold));

  }

  //  @Test
  //  public void HolidayDays2() {
  //      HolidaysService service = new HolidaysService();

  //        int income = 100000;
  //      int expenses = 60000;
  //        int treshold = 150000;
  //        int expected = 2;

  //        int countHolidays = HolidaysService.calculate(income, expenses, treshold);
  //        Assertions.assertEquals(expected, HolidaysService.calculate(income, expenses, treshold));

  //  }
}


