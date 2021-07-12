package Now.Serenity.scam.controllers;

import Now.Serenity.scam.services.DeedService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping(value = "/login")
    @CrossOrigin(origins = "https://localhost:8443/")
    public String login() {
        logger.info("login called.");
        return "login";
    }
}
