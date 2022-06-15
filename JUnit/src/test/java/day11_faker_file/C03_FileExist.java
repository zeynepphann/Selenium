package day11_faker_file;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C03_FileExist {
    @Test
    public void test01(){

        System.out.println(System.getProperty("user.dir"));
        // bana icinde oldugun projenin dosya yolunu(path) verir

        System.out.println(System.getProperty("user.home"));
        // benim bilgisayarimin bana ozel kismini verdi

        // C:\Users\Asus\Desktop\Ders notlari\Html
        //sag click properties den baglanti yolu alinabilir
        // homePath + "/Downloads"

        // Masa ustunuzdeki text dosyasinin varligini test edin
        String dosyaYolu=System.getProperty("user.home")+"\\Desktop\\text.txt";
        System.out.println(dosyaYolu);
        /*
        Bilgisayarimizdaki bir dosyanin varligini test etmek icin once o dosyaya
        ulasmamiz gerekir
        java da dosyaya erisim icin dosya yoluna ihtiyac vardir
        her bilgisayarin kullanici adi farkli olacagindan
        masaustu dosya yolu da birbririnden farkli olacaktir
        testlerimizin tum bilgisayarlarda calismasi icin dosya yolunu dinamik yapmamiz gerekir



        Bunun icin her bilgisayarin birbirinden farkli olan yolunu bulmak isin

         */

        String farkliKisim=System.getProperty("user.name");

        //  herkesin bilgisayarinda ortak olan kisim ise
        String ortakKisim="\\Desktop\\text.txt";

        String dosyaYolu2=farkliKisim+ortakKisim;
        System.out.println(Files.exists(Paths.get(dosyaYolu2)));

        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu2)));
        }

    }

