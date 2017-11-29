package org.launchcode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

/**
 * Created by LaunchCode
 */
@Controller
public class HomeController {

    @RequestMapping(value = "")
    public String index(Model model) {

        HashMap<String, String> actionChoices = new HashMap<>();

        //Add key/value to hashmap
        actionChoices.put("search", "Search");
        actionChoices.put("list", "List");


        //Add search and list to index page
        //In index template use for loop to pull out value from hashmap
        model.addAttribute("actions", actionChoices);

        return "index";
    }

}
