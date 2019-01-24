/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.jpa1;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author tangfanghua
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "crm_user")
@ToString
@NamedQueries({
    @NamedQuery(name = "User.findAll", query = "SELECT u FROM User u")})
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;

    @Size(max = 100)
    @Column(name = "wx_union_id")
    private String wxUnionId;


    //not work @OneToOne(mappedBy="user")
    @OneToOne
    @JoinColumn(name = "wx_union_id", referencedColumnName = "wx_union_id", insertable = false, updatable = false, unique = true)
    private WXPublicUser pu;

}
