package com.tedapplication.basicfeaturesbackend.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tedapplication.basicfeaturesbackend.model.ArtPiece;
import com.tedapplication.basicfeaturesbackend.repository.ArtRepository;

@RestController
@RequestMapping("/art")
public class ArtController {

    private final ArtRepository artRepository;

    // controller contructor
    public ArtController(ArtRepository artRepository) {
        this.artRepository = artRepository;
    }

    // gets all art pieces stored in repository
    @GetMapping
    public List<ArtPiece> getArt() {
        return artRepository.findAll();
    }

    // gets specific art piece by id
    @GetMapping("/{id}")
    public ArtPiece getArtPiece(@PathVariable Long id) {
        return artRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    // creates art piece object and stores it within artRepository
    @PostMapping
    public ResponseEntity createArtPiece(@RequestBody ArtPiece artPiece) throws URISyntaxException {
        ArtPiece savedArt = artRepository.save(artPiece);
        return ResponseEntity.created(new URI("/artPieces/" + savedArt.getId())).body(savedArt);
    }

    // updates the attributes of the art piece with the specified id to the input values
    @PutMapping("/{id}")
    public ResponseEntity updateArtPiece(@PathVariable Long id, @RequestBody ArtPiece artPiece) {
        ArtPiece currentArtPiece = artRepository.findById(id).orElseThrow(RuntimeException::new);
        currentArtPiece.setName(artPiece.getName());
        currentArtPiece.setType(artPiece.getType());
        currentArtPiece.setArtist(artPiece.getArtist());
        currentArtPiece.setEstimatedValue(artPiece.getEstimatedValue());
        currentArtPiece.setStartingPrice(artPiece.getStartingPrice());

        return ResponseEntity.ok(currentArtPiece);
    }

    // deletes the art piece with the specified id from artRepository
    @DeleteMapping("/{id}")
    public ResponseEntity deleteArtPiece(@PathVariable Long id) {
        artRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
