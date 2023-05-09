package dev.Al.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> allmovie(){
        System.out.println(movieRepository.findAll().toString());
          return movieRepository.findAll();

    }
}
