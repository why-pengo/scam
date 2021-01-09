package Now.Serenity.scam.controllers;

import Now.Serenity.scam.services.DeedService;
import Now.Serenity.scam.domain.Deed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("api")
public class ApiController {

    @Autowired
    DeedService deedService;

    @GetMapping(value = "/listDeeds")
    public List<Deed> listDeeds() {
        Collection<File> files = deedService.readFileSystem();
        return deedService.parseFileSystemToDeeds(files);
    }
}
