package Now.Serenity.scam;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class DeedService {
    private static final Logger logger = LoggerFactory.getLogger(DeedService.class);

    @Value("${base-dir}")
    private String baseDir;

    public Collection<File> readFileSystem() {
        File listDir = new File(baseDir);
        Collection<File> files = FileUtils.listFiles(listDir, new String[]{"jpg", "mp4"}, true);
        files.forEach((file -> logger.info(file.toString())));

        return files;
    }

    public List<Deed> parseFileSystemToDeeds(Collection<File> files) {
        List<Deed> deeds = new ArrayList<>();
        //0 = {File@9729} "/Users/jmorgan/scam_tmp/videos/backyard2/Backyard2_01_20201228003956.jpg"
        //1 = {File@9730} "/Users/jmorgan/scam_tmp/videos/backyard2/Backyard2_01_20201227064433.jpg"
        //2 = {File@9731} "/Users/jmorgan/scam_tmp/videos/backyard2/Backyard2_01_20201227061100.jpg"
        //3 = {File@9732} "/Users/jmorgan/scam_tmp/videos/backyard2/Backyard2_01_20201228022521.jpg"

        files.forEach( file -> {
            Deed deed = new Deed();
            String[] buf = file.toString().substring(baseDir.length() + 1).split("/");
            // camera
            deed.setCamera(buf[0]);
            // filename
            deed.setFilename(buf[1]);
            // file type
            if (file.toString().endsWith(".jpg")) {
                deed.setType("image");
            } else {
                deed.setType("video");
            }
            // File Reference Object
            deed.setFileRef(file);

            deeds.add(deed);
            }
        );

        return deeds;
    }
}
