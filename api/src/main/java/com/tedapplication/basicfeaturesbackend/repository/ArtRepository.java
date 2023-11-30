package com.tedapplication.basicfeaturesbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tedapplication.basicfeaturesbackend.model.ArtPiece;

public interface ArtRepository extends JpaRepository<ArtPiece, Long> {
}
