public class Patika {


    public static void main(String[] args) {

        Calisan c1 = new Calisan("Mustafa Cetindag", "234567898765","info@info.com");

        Akademisyen a1 = new Akademisyen("Patika Dev","12345","patika@dev","CENG","DOCENT");

        Memur m1 = new Memur("ALi","123456","www@www","office","9-5");

        OgretimGorevlisi o1 = new OgretimGorevlisi("Ayse","2345","o@o","CENG","DOCENT","110");

       Calisan a2 = new Akademisyen("Mustafa Cetindag", "234567898765","info@info.com","sdfdf","prof");



        Calisan[] loginUser = {c1,a1,m1,o1};

        Calisan.girisYapanlar(loginUser);






    }
}