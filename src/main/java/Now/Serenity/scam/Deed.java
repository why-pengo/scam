package Now.Serenity.scam;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Deed {
    private @Id @GeneratedValue long id;
    private String camera;
    private String filename;
    private String type;  // image or video
    private Timestamp created;

    public Deed() { }

    public Deed(String camera, String filename, String type, Timestamp created) {
        this.camera = camera;
        this.filename = filename;
        this.type = type;
        this.created = created;
    }

    public long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getCamera() {
        return camera;
    }
    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getFilename() {
        return filename;
    }
    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public Timestamp getCreated() {
        return created;
    }
    public void setCreated(Timestamp created) {
        this.created = created;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "id=" + id +
                ", camera='" + camera + '\'' +
                ", filename='" + filename + '\'' +
                ", type='" + type + '\'' +
                ", created=" + created +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Deed deed1 = (Deed) o;
        return id == deed1.id && camera.equals(deed1.camera)
                && filename.equals(deed1.filename) && type.equals(deed1.type)
                && created.equals(deed1.created);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, camera, filename, type, created);
    }
}
