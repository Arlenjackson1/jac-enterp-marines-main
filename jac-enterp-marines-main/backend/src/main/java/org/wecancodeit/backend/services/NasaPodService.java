package org.wecancodeit.backend.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.wecancodeit.backend.models.NasaPodModel;

@Service
public class NasaPodService {
    private final String apiUrl = "https://api.nasa.gov";

    private final RestTemplate restTemplate;

    public NasaPodService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public NasaPodModel fetchNasaPodData() {
        return restTemplate.getForObject(apiUrl + "/planetary/apod?api_key=DEMO_KEY", NasaPodModel.class);
    }
}
