package com.mayank.spring5jokesappv2.JokesController;

import com.mayank.spring5jokesappv2.Services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JController {

    private final JokeService jokeService;

    public JController(JokeService jokeService) {
        this.jokeService = jokeService;  }

        @RequestMapping("/Showjokes")
        public String showJokes(Model model)
        {
           model.addAttribute("jks", jokeService.getJokes());

            return "myjokes";
        }
    }
