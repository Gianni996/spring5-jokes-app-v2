package it.giammaria.spring5jokesappv2.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisServiceImpl implements ChuckNorrisService{
    @Override
    public String getJoke() {
        return (new ChuckNorrisQuotes()).getRandomQuote();
    }
}
