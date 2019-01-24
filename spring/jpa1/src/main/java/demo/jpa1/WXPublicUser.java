package demo.jpa1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "crm_wx_public_user")
public class WXPublicUser implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;

    @Size(max = 100)
    @Column(name = "wx_union_id")
    private String wxUnionId;

    @OneToOne(targetEntity = User.class)
    @JoinColumn(name = "wx_union_id", referencedColumnName = "wx_union_id", insertable = false, updatable = false, unique = true
            //,foreignKey = @ForeignKey(name = "none", value = ConstraintMode.NO_CONSTRAINT)
    //foreignKey = @ForeignKey(name = "null")
    )
    private User user;
}
