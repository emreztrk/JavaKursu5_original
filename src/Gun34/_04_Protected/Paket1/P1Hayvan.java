package Gun34._04_Protected.Paket1;

public class P1Hayvan {
    public String ad; // her paketten, her yerden ulaşılabiliyor
    int yas; // sadece bulundugu paketten ulaşılabilir
    protected String cinsi; // default gibi, ancak değer paketlerden erişimle ilgili bir secenegi var.
    private String renk; // sadece bulundugu class dan erişilebilir.
}
