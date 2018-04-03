package com.example.vuchung.cauthu;

/**
 * Created by VuChung on 3/7/2018.
 */

public class CauThu {
    private String Ten;
    private String Mota;
    private int Hinh;

    public CauThu(String ten, String mota, int hinh){
        Ten = ten;
        Mota= mota;
        Hinh = hinh;

    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        this.Ten = ten;
    }

    public String getMota() {
        return Mota;
    }

    public void setMota(String mota) {
        this.Mota = mota;
    }

    public int getHinh() {
        return Hinh;
    }

    public void setHinh(int hinh) {
        this.Hinh = hinh;
    }
}
