package Now.Serenity.scam;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ActiveProfiles;

import java.io.File;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("dev")
class DeedServiceTest {

    @Autowired
    DeedService deedService;

    @Test
    void listFiles() {
        // TODO: needs mocks
        Collection<File> files = deedService.listFiles();

        assertNotNull(files);
    }

    @Test
    void parseDeeds() {
        // TODO: needs mocks
        Collection<File> files = deedService.listFiles();
        List<Deed> deeds = deedService.parseDeeds(files);

        assertNotNull(deeds);
    }
}