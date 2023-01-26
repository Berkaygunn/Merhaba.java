package Gun34._03_Ornek;

public class Ogrenci {
    private final int ID;
    private String isim;
    private OgrTip tipi;


    public Ogrenci(String isim, OgrTip tipi,int id) {
      setIsim(isim);
      setTipi(tipi);
      this.ID=id;
    }

    public int getID() {
        return ID;
    }



    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public OgrTip getTipi() {
        return tipi;
    }

    public void setTipi(OgrTip tipi) {
        this.tipi = tipi;
    }


    @Override
    public String toString() {
        return "Ogrenci{" +
                "ID=" + ID +
                ", isim='" + isim + '\'' +
                ", tipi=" + tipi +
                '}';
    }
}
