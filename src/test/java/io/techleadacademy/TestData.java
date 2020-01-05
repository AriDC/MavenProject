package io.techleadacademy;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestData {
    Faker data = new Faker();
    public String getRandomFirstName() {
        return data.name().firstName();
    }
    public String getRandomLastName() {
        return data.name().lastName();
    }

    public String getRandomPhoneNumber() {
        String num = data.phoneNumber().cellPhone();
        return num;
    }
    public String getRandomAddress() {
        return data.address().fullAddress();
    }
}