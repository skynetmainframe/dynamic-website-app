package com.example.dynamicwebsitebackend.service;

import com.example.dynamicwebsitebackend.model.MusicAPIInfo;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
public class MusicAPIService {

    public List<MusicAPIInfo> getSupportedAPIs() {
        // This could be from a database, a config file, or hardcoded for now.
        return Arrays.asList(
            new MusicAPIInfo("Discogs", "The world's largest database of music."),
            new MusicAPIInfo("Spotify", "Music streaming service."),
            new MusicAPIInfo("Beatport", "Source for electronic music.")
        );
    }
}
