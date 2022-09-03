package SuperCodersApp.SuperCoders;

import java.time.LocalDate;
public class Trasaction {

    private String id;
    private String concept;
    private Float amout;
    private String user;
    private Enterprise enterprise;
    private LocalDate createdAt;
    private LocalDate updatedAt;

   protected Trasaction(){

   }
    public Trasaction(String id, String concept, Float amout, String user, Enterprise enterprise) {
        this.id = id;
        this.concept = concept;
        this.amout = amout;
        this.user = user;
        this.enterprise = enterprise;
        this.createdAt = LocalDate.now();
        this.updatedAt = LocalDate.now();
    }

    public String getId() {
        return id;
    }

    public void setId(String  id) {
        this.id = id;
    }

    public String getConcept() {
        return concept;

    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public Float getAmout() {
        return amout;

    }

    public void setAmout(Float amout) {
        this.amout = amout;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Trasaction{" +
                "id='" + id + '\'' +
                ", concept='" + concept + '\'' +
                ", amout=" + amout +
                ", user='" + user + '\'' +
                ", enterprise=" + enterprise +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }


}
