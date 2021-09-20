package ru.netology.data;

import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DataHelper {
    private DataHelper(){}
    private static final Faker faker = new Faker(new Locale("ru"));

    public static String getCity(){
        return faker.address().cityName().replace("Новокузнецк", "Курск").replace("Сочи", "Тула");
    }

    public static String getPhone(){
        return faker.phoneNumber().phoneNumber();
    }

    public static String getShiftedDate(int daysToShift){
        return LocalDate.now().plusDays(daysToShift).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }

    public static String getName(){
        return faker.name().lastName().replace("ё", "е") + " " + faker.name().firstName().replace("ё", "е");
    }
}
