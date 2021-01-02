package Now.Serenity.scam;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
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
    void readFileSystemTest() {
        // TODO: needs mocks
        Collection<File> files = deedService.readFileSystem();

        assertNotNull(files);
    }

    @Test
    void parseFileSystemToDeedsTest() {
        // TODO: needs mocks
        Collection<File> files = deedService.readFileSystem();
        List<Deed> deeds = deedService.parseFileSystemToDeeds(files);

        assertNotNull(deeds);
    }
}