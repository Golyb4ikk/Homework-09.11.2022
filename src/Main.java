public class Main {
    public static void main(String[] args) {
      int krisNow=76230;
      int denisNow=83690;
      int mashaNow=67760;
      int krisYear=krisNow*12;
      int denisYear=denisNow*12;
      int MashaYear=mashaNow*12;
        int krisNext=krisNow/100*10+krisNow;
        int denisNext=denisNow/100*10+denisNow;
        int mashaNext=krisNow/100*10+mashaNow;
        int krisNextYear=krisNext*12;
        int denisNextYear=denisNext*12;
        int mashaNextYear=mashaNext*12;
        int krisDifference=krisNextYear-krisYear;
        int denisDifference=denisNextYear-denisYear;
        int mashaDifference=mashaNextYear-MashaYear;

        System.out.println(krisNext+"."+denisNext+","+mashaNext+","+krisDifference+","+denisDifference+","+mashaDifference);







    }
}