package hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "thietbi")
@Data
public class thietbi {
    @Id
    private int MaTB;
    @Column
    private String TenTB;
    @Column
    private String MoTaTB;

}
