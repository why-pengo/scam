package Now.Serenity.scam;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DeedServiceTest {

    @Autowired
    DeedService deedService;

    @Test
    void listFiles() {
        Collection<File> files = deedService.listFiles();

        assertNotNull(files);
    }
}