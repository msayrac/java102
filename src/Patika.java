public class Patika {


    public static void main(String[] args) {

        Calisan c1 = new Calisan("Mustafa Cetindag", "234567898765","info@info.com");

        Akademisyen a1 = new Akademisyen("Patika Dev","12345","patika@dev","CENG","DOCENT");

        Memur m1 = new Memur("ALi","123456","www@www","office","9-5");

        OgretimGorevlisi o1 = new OgretimGorevlisi("Ayse","2345","o@o","CENG","DOCENT","110");

        Asistan as1 = new Asistan("Mahmut","1234","QQQ","MAt","dr","4-8");

        LabAsistani l1 = new LabAsistani("asistan ahmet ","2345","posta","mat","asistan","8-5");

        BilgiIslem b1 = new BilgiIslem("bilgi Mehmet","23456","qwert","bilgisayar","8-5","bilgisayar");

        GuvenlikGorevlisi g1 = new GuvenlikGorevlisi("Guvenlik memo","234","2ewre","guvenlik","8-6","guvenlik belgesi sagladi ");

        g1.nobet();




    }
}