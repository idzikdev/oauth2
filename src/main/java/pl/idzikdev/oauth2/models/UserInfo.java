package pl.idzikdev.oauth2.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name = "username", length = 15,nullable = false)
    private String username;
    @Column(name = "password", length = 255,nullable = false)
    private String password;
    @Column(name = "role", length = 20)
    private String role;
    @Column(name = "enabled")
    private int enabled;
}
