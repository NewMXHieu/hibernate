package hibernate.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "thanhvien")
@Data
public class thanhvien {
    @Id
    @Column(name = "MaTV")
    private int MaTV;
    @Column(name = "HoTen")
    private String HoTen;

    @Column(name = "Khoa")
    private String Khoa;

    @Column(name = "Nganh")
    private String Nganh;

    @Column(name = "SDT")
    private String SDT;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "thanhvien")
    private List<xuly> xuly;

    public thanhvien(int maTV, String hoTen, String khoa, String nganh, String sdt,String password, String email) {
        this.MaTV = maTV;
        this.HoTen = hoTen;
        this.Khoa = khoa;
        this.Nganh = nganh;
        this.SDT = sdt;

    }

    public thanhvien() {

    }

    public int getMaTV() {
        return MaTV;
    }

    public void setMaTV(int maTV) {
        this.MaTV = maTV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        this.HoTen = hoTen;
    }

    public String getKhoa() {
        return Khoa;
    }

    public void setKhoa(String khoa) {
        this.Khoa = khoa;
    }

    public String getNganh() {
        return Nganh;
    }

    public void setNganh(String nganh) {
        this.Nganh = nganh;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String sdt) {
        this.SDT = sdt;
    }

    public List<xuly> getXuly() {
        return xuly;
    }

    public void setXuly(List<xuly> xuly) {
        this.xuly = xuly;
    }

    @Override
    public String toString() {
        return this.HoTen;
    }





}