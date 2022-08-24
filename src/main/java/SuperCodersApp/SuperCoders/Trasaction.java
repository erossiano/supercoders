package SuperCodersApp.SuperCoders;

import java.util.Date;

public class Trasaction {

    private Long id;
    private String cancept;
    private Float amout;
    private Profile user;
    private Enterprise enterprise;
    private Date createdAt;
    private Date updatedAt;

    public Trasaction(Long id, String cancept, Float amout, Profile user, Enterprise enterprise, Date createdAt, Date updatedAt) {
        this.id = id;
        this.cancept = cancept;
        this.amout = amout;
        this.user = user;
        this.enterprise = enterprise;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCancept() {
        return cancept;

    }

    public void setCancept(String cancept) {
        this.cancept = cancept;
    }

    public Float getAmout() {
        return amout;

    }

    public void setAmout(Float amout) {
        this.amout = amout;
    }

    public Profile getUser() {
        return user;
    }

    public void setUser(Profile user) {
        this.user = user;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }



}
