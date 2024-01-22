package com.example.demo;

import be.bonamis.transport.api.PlacesApi;
import be.bonamis.transport.model.Place;
import java.time.LocalDate;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlacesController implements PlacesApi {
  @Override
  public ResponseEntity<List<Place>> findPlaces() {
    Place place = new Place();
    place.setId(99L);
    place.setName("dummy name 3.2.2");
    place.setPostedDate(LocalDate.of(2023, 11, 15));
    return ResponseEntity.ok(List.of(place));
  }
}
