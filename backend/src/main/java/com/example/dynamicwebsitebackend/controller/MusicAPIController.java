package com.example.dynamicwebsitebackend.controller;

import com.example.dynamicwebsitebackend.service.MusicAPIService;
import com.example.dynamicwebsitebackend.model.MusicAPIInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/music-apis") // Optional: Base path for all methods in this controller
public class MusicAPIController {

    private final MusicAPIService musicAPIService;

    // Spring injects the service automatically
    public MusicAPIController(MusicAPIService musicAPIService) {
        this.musicAPIService = musicAPIService;
    }

    @GetMapping
    public List<MusicAPIInfo> getSupportedAPIs() {
        return musicAPIService.getSupportedAPIs();
    }
}
