package Now.Serenity.scam;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.Collection;

@Service
public class DeedService {
    private static final Logger logger = LoggerFactory.getLogger(DeedService.class);

    public Collection<File> listFiles() {
        File baseDir = new File("/home/cams/videos");
        Collection<File> files = FileUtils.listFiles(baseDir, new String[]{"jpg", "mp4"}, true);
        files.stream().forEach((file -> logger.info(file.toString())));

        return files;
    }
}
