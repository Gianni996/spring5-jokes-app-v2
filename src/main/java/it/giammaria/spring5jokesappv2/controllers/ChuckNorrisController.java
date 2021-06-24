package it.giammaria.spring5jokesappv2.controllers;

import it.giammaria.spring5jokesappv2.service.ChuckNorrisService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChuckNorrisController {


    private ChuckNorrisService chuckNorrisService;

    public ChuckNorrisController(@Qualifier("chuckNorrisServiceImpl") ChuckNorrisService chuckNorrisService) {
        this.chuckNorrisService = chuckNorrisService;
    }

    @RequestMapping("/")
    public String getJoke(Model model){
        model.addAttribute("jokes",this.chuckNorrisService.getJoke());
        return "index";
    }


}
