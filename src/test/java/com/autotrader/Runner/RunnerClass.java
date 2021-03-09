package com.autotrader.Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/autotrader/stepDefinitions",
        dryRun =true,  //true: testleri run etmeden dry sekilde run eder ----methodlari calistirir ve creates the snipppets====true methodlarin var olup olmadigina bakar
        tags = "@smoke_test or @unit_test",
        plugin = {"html:target/default-cucumber-reports",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"        //rerun: fail olan testleri cucumber buraya store ediyor,hangileri fail hangi satirda detaylari ile
                                                //failed runner a gidip feauture in icine koyuyoruz
        }
)


//cucumber junitle calisiyor
//testng de entegre edip testng.xml dosyasi olusturup parelel testing bunun uzerinden yapilabilir
//testng ve junit birlikte calisabilir

    public class RunnerClass {
}
