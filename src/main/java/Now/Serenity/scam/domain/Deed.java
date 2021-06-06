package Now.Serenity.scam.domain;

import lombok.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@ToString
@Entity
public class Deed {
    private @Id @GeneratedValue long id;
    private String camera;
    private String filename;
    private String type;  // image or video
    private String path;

    public Deed(String camera, String filename, String type, String path) {
        this.camera = camera;
        this.filename = filename;
        this.type = type;
        this.path = path;
    }

    public Deed() {
    }
}
