package hibernate.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="thongtinsd")
@Data
@Getter
@Setter
public class thongtinsd {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaTT")
    private int MaTT;

    @Column(name = "MaTV")
    private int thanhvien;

    @Column(name = "MaTB")
    private Integer thietbi;

    @Column(name = "TGVao")
    private Date TGVao;

    @Column(name = "TGMuon")
    private Date TGMuon;

    @Column(name = "TGTra")
    private Date TGTra;

    public thongtinsd(int thanhvien, Integer thietbi, Date TGVao, Date TGMuon, Date TGTra) {
        this.thanhvien = thanhvien;
        this.thietbi = thietbi;
        this.TGVao = TGVao;
        this.TGMuon = TGMuon;
        this.TGTra = TGTra;
    }

    public thongtinsd() {

    }

    public int getMaTT() {
        return MaTT;
    }

    public void setMaTT(int maTT) {
        MaTT = maTT;
    }

    public int getMaTV() {
        return thanhvien;
    }

    public void setMaTV(int thanhvien) {
        this.thanhvien = thanhvien;
    }

    public Integer getMaTB() {
        return thietbi;
    }

    public void setMaTB(Integer thietbi) {
        this.thietbi = thietbi;
    }

    public Date getTGVao() {
        return TGVao;
    }

    public void setTGVao(Date TGVao) {
        this.TGVao = TGVao;
    }

    public Date getTGMuon() {
        return TGMuon;
    }

    public void setTGMuon(Date TGMuon) {
        this.TGMuon = TGMuon;
    }

    public Date getTGTra() {
        return TGTra;
    }

    public void setTGTra(Date TGTra) {
        this.TGTra = TGTra;
    }

    @Override
    public String toString() {
        return "thongtinsd{" +
                "MaTT=" + MaTT +
                ", thanhvien=" + thanhvien +
                ", thietbi=" + thietbi +
                ", TGVao=" + TGVao +
                ", TGMuon=" + TGMuon +
                ", TGTra=" + TGTra +
                '}';
    }

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "MaTB", insertable = false, updatable = false, foreignKey = @ForeignKey(name = "fk_thongtinsd_device"))
    private thietbi device;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MaTV", referencedColumnName = "MaTV", insertable = false, updatable = false, foreignKey = @ForeignKey(name = "fk_thanhvien_thongtinsd"))
    private thanhvien member;
}