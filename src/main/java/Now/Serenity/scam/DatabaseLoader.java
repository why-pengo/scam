package Now.Serenity.scam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;

@Component
public class DatabaseLoader implements CommandLineRunner {
    private final CameraRepository repository;

    @Autowired
    public DatabaseLoader(CameraRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Deed("Frontdoor", "filename1.jpg",
                "image", new Timestamp(System.currentTimeMillis())));
        this.repository.save(new Deed("Driveway", "filename2.jpg",
                "image", new Timestamp(System.currentTimeMillis() - 1)));
        this.repository.save(new Deed("Backyard", "filename3.jpg",
                "image", new Timestamp(System.currentTimeMillis() + 1)));
    }
}
