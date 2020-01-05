package io.techleadacademy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mavenPractice {
    public static void main(String[] args) {

       TestData test = new TestData();
        System.out.println(test.getRandomFirstName());
        System.out.println(test.getRandomLastName());
        System.out.println(test.getRandomPhoneNumber());
        System.out.println(test.getRandomAddress());

    }
}
