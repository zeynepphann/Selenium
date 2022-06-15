package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin={"html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"
        },
             features = "src/test/resources/features",
             glue = "stepDefinitions",
             tags = "@odev" ,
             dryRun = false

)

public class TestRunner {

    /*
    Bir framework de bir tek Runnrt class'i yeterli olabilir
    Runner classinda class body'sinde hicbir sey olmaz
    Runner classimizi onemli yapan 2 adet annotion vardir
    @RunWith(Cucumber.class) notasyonu Runner classina calisma ozelligi katar
    bu notasyon oldugu icin Cucumber framework'umuzde JUnit kullanmayi tercih ediyoruz

   feature : Runner dosyasinin feature dosyalarini nereden bulacagini tarif eder
   glue: step definations dosyalarini nerede bulacagimizi gosterir
   tags: o an hangi tag'i calistirmak istiyorsak onu belli eder
   dryRun: iki secenek var

   dryRun=true ; yazdigimizda testimizi calistirmadan sadece eksik adimlari bize verir



     */
}
