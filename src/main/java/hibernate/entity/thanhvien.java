package hibernate.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "thanhvien")
@Data
public class thanhvien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int MaTV;
    @Column
    private String HoTen;
    @Column
    private String Khoa;
    @Column
    private String Nganh;
    @Column
    private String SDT;


}
