package SuperCodersApp.SuperCoders;

import java.time.LocalDate;
import java.util.Date;

public class Profile {

    private String id;
    private String image;
    private String phone;
    private String user;
    private LocalDate createdAt;
    private LocalDate updatedAt;

    public Profile(String id, String image, String phone, String user, Date createdAt, Date updatedAt) {
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
        this.user = user;}

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }








}
