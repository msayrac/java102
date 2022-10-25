public class LabAsistani extends Asistan{


    public LabAsistani(String adSoyad, String telefon, String eposta, String bolum, String unvan, String officeSaati) {
        super(adSoyad, telefon, eposta, bolum, unvan, officeSaati);
    }

    public void lablaraGir(){

        System.out.println(this.getAdSoyad() + " lab a girdi !!!");
    }

}
