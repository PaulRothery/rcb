package com.rcb.repository;

import com.rcb.model.Adjunct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface AdjunctRepository extends JpaRepository<Adjunct, Long> {


    @Query("SELECT adjunctFermentable FROM Adjunct adjunctFermentable WHERE adjunctFermentable.name = ?1")
    Optional<Adjunct> findAdjunctFermentableByName(String name);

    @Transactional
    @Modifying
    @Query("DELETE FROM Adjunct adjunctFermentable WHERE adjunctFermentable.name = ?1")
    void deleteByName(String name);
}
