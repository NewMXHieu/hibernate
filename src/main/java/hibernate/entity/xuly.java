/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hibernate.entity;

import javax.persistence.*;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "xuly")
@Data
@Getter
@Setter
public class xuly {
    @Id
    @Column(name = "MaXL")
    private int MaXL;

    @Column (name = "MaTV")
    private int MaTV;

    @Column (name = "HinhThucXL")
    private String HinhThucXL;

    @Column (name = "SoTien")
    private Integer  SoTien;

    @Column (name = "NgayXL")
    private Date NgayXL;

    @Column (name = "TrangThaiXL")
    private int TrangThaiXL;

    public xuly(int thanhvien, String HinhThucXL, Integer SoTien, Date NgayXL, int TrangThaiXL) {
        this.MaTV = thanhvien;
        this.HinhThucXL = HinhThucXL;
        this.SoTien = SoTien;
        this.NgayXL = NgayXL;
        this.TrangThaiXL = TrangThaiXL;
    }

    public xuly() {

    }

    public int getMaXL() {
        return MaXL;
    }

    public void setMaXL(int maXL) {
        MaXL = maXL;
    }

    public int getMaTV() {
        return MaTV;
    }

    public void setMaTV(int maTV) {
        MaTV = maTV;
    }

    public String getHinhThucXL() {
        return HinhThucXL;
    }

    public void setHinhThucXL(String hinhThucXL) {
        HinhThucXL = hinhThucXL;
    }

    public Integer getSoTien() {
        return SoTien;
    }

    public void setSoTien(Integer soTien) {
        SoTien = soTien;
    }

    public Date getNgayXL() {
        return NgayXL;
    }

    public void setNgayXL(Date ngayXL) {
        NgayXL = ngayXL;
    }

    public int getTrangThaiXL() {
        return TrangThaiXL;
    }

    public void setTrangThaiXL(int trangThaiXL) {
        TrangThaiXL = trangThaiXL;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MaTV", referencedColumnName = "MaTV", insertable = false, updatable = false, foreignKey = @ForeignKey(name = "fk_thanhvien_handle"))
    private thanhvien thanhvien;

}

