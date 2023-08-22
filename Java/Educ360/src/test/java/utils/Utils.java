package utils;

 


import org.junit.After;

import org.junit.Assert;

import org.junit.Before;

import org.junit.Test;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;



public class Utils {

    

    WebDriver driver;

    @Before

    public void abreBrowser() {

        System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.get("https://companye.academy/");

    

    }

    

    @Test

    public void testConfereConfigProjetoOK() throws InterruptedException{

        Assert.assertEquals("https://companye.academy/", driver.getCurrentUrl());

            

    }

    @After

    public void fechaBrowser() {

        driver.quit();

    }
}