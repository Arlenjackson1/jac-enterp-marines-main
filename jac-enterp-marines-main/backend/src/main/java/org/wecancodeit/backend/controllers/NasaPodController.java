package org.wecancodeit.backend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wecancodeit.backend.models.NasaPodModel;
import org.wecancodeit.backend.services.NasaPodService;

@RestController
public class NasaPodController {

    private final NasaPodService nasaPodService;

    public NasaPodController(NasaPodService nasaPodService) {
        this.nasaPodService = nasaPodService;
    }

    @GetMapping("/nasaPodData")
    public NasaPodModel getNasaPodData() {

        NasaPodModel nasaPodModel = nasaPodService.fetchNasaPodData();

        NasaPodModel nasaPodResponse = new NasaPodModel();
        nasaPodResponse.setUrl(nasaPodModel.getUrl());
        nasaPodResponse.setTitle(nasaPodModel.getTitle());
        nasaPodResponse.setDate(nasaPodModel.getDate());
        nasaPodResponse.setExplanation(nasaPodModel.getExplanation());

        return nasaPodResponse;
    }
}
