package SuperCodersApp.SuperCoders.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Profile")
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)    private String id;
    private String image;
    private String phone;
    private String user;
    private LocalDate createdAt;
    private LocalDate updatedAt;

    public Profile(String id, String image, String phone, String user) {
        this.id = id;
        this.image = image;
        this.phone = phone;
        this.user = user;
        this.createdAt = LocalDate.now();
        this.updatedAt = LocalDate.now();

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;

    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt.now();
    }

    @Override
    public String toString() {
        return "Profile{" +
                "id='" + id + '\'' +
                ", image='" + image + '\'' +
                ", phone='" + phone + '\'' +
                ", user='" + user + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
