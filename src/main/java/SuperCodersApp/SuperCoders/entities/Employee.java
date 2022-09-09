package SuperCodersApp.SuperCoders.entities;

import javax.persistence.*;

@Entity
@Table(name = "Employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    @ManyToOne
    @JoinColumn(name="enterprise")
    private Enterprise enterprise;

    @Column(name = "role")
    @Enumerated(EnumType.ORDINAL)
    private Role role;

    public Employee() {
    }
    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
        this.role = Role.Operator;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    /*public String getEnterpriseName() {
        return enterprise.getName();
    }*/

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public Role getRole() {
        return role;
    }
    public void setRole(Role role) {
        this.role = role;
    }


    /*@Override
    public String toString() {
        return "Employee{" +
                "name='" + this.name + '\'' +
                ", email='" + this.email + '\'' +
                ", enterprise=" + getEnterpriseName() +
                ", role=" + getRoleName() +
                '}';
    }*/
}












