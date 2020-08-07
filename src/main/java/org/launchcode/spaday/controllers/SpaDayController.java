package org.launchcode.spaday.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.launchcode.spaday.models.Client;


@Controller
public class SpaDayController {

    @GetMapping
    public String customerForm () {
        return "serviceSelection";
    }

    @PostMapping
    public String spaMenu(@RequestParam String skintype, @RequestParam String manipedi, Model model) {

        Client newClient = new Client(skintype, manipedi);
        newClient.setAppropriateFacials(skintype);
        model.addAttribute("client" , newClient);

        return "menu";
    }

}
