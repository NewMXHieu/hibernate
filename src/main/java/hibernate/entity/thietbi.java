/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hibernate.entity;

import javax.persistence.*;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "thietbi")
@Data
@Setter
@Getter
public class thietbi {
    @Id
    @Column(name = "MaTB")
    private int MaTB;

    @Column(name = "TenTB")
    private String TenTB;

    @Column(name = "MoTaTB")
    private String MoTaTB;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "thietbi")
    private List<thongtinsd> thongtinsd;

    public thietbi(int maTB, String TenTB, String MoTaTB) {
        this.MaTB = maTB;
        this.TenTB = TenTB;
        this.MoTaTB = MoTaTB;
    }

    public thietbi() {

    }

    public int getMaTB() {
        return MaTB;
    }

    public void setMaTB(int maTB) {
        MaTB = maTB;
    }

    public String getTenTB() {
        return TenTB;
    }

    public void setTenTB(String tenTB) {
        TenTB = tenTB;
    }

    public String getMoTaTB() {
        return MoTaTB;
    }

    public void setMoTaTB(String moTaTB) {
        MoTaTB = moTaTB;
    }

    @Override
    public String toString() {
        return "thietbi{" +
                "MaTB=" + MaTB +
                ", TenTB='" + TenTB + '\'' +
                ", MoTaTB='" + MoTaTB + '\'' +
                '}';
    }
    
}