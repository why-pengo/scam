package Now.Serenity.scam;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.Collection;

@Service
public class DeedService {
    private static final Logger logger = LoggerFactory.getLogger(DeedService.class);

    @Value("${base-dir}")
    private String baseDir;

    public Collection<File> listFiles() {
        File listDir = new File(baseDir);
        Collection<File> files = FileUtils.listFiles(listDir, new String[]{"jpg", "mp4"}, true);
        files.forEach((file -> logger.info(file.toString())));

        return files;
    }
}
