public class Asistan extends Akademisyen{

    private String officeSaati;

    public Asistan(String adSoyad, String telefon, String eposta, String bolum, String unvan, String officeSaati) {
        super(adSoyad, telefon, eposta, bolum, unvan);
        this.officeSaati = officeSaati;
    }

    public void quizYapti(){
        System.out.println(this.getAdSoyad() + " quiz yapti !!");
    }
}
