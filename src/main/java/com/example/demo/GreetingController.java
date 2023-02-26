package com.example.demo;

import be.bonamis.transport.api.PlacesApi;
import be.bonamis.transport.model.Place;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
public class GreetingController implements PlacesApi {

    @Override
    public ResponseEntity<List<Place>> placesGet() {
        Place place = new Place();
        place.setId(99L);
        place.setPostedDate(LocalDate.of(2023,11,15));
        return ResponseEntity.ok(List.of(place));
    }

    @Override
    public ResponseEntity<Place> placesPlaceIdGet(String placeId) {
        return null;
    }

    @Override
    public ResponseEntity<Void> placesPost() {
        return null;
    }
}
