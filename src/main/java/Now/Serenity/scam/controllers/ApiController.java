package Now.Serenity.scam.controllers;

import Now.Serenity.scam.services.DeedService;
import Now.Serenity.scam.domain.Deed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.File;
import java.util.Collection;
import java.util.List;

@Controller
@RequestMapping(value = "/api")
public class ApiController {

    @Autowired
    DeedService deedService;

    @RequestMapping(value = "/listDeeds")
    public List<Deed> listDeeds() {
        Collection<File> files = deedService.readFileSystem();
        return deedService.parseFileSystemToDeeds(files);
    }
}
