package com.rcb.repository;

import com.rcb.model.AdjunctFermentable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface AdjunctFermentableRepository extends JpaRepository<AdjunctFermentable, Long> {


    @Query("SELECT adjunctFermentable FROM AdjunctFermentable adjunctFermentable WHERE adjunctFermentable.name = ?1")
    Optional<AdjunctFermentable> findAdjunctFermentableByName(String name);

    @Transactional
    @Modifying
    @Query("DELETE FROM AdjunctFermentable adjunctFermentable WHERE adjunctFermentable.name = ?1")
    void deleteByName(String name);
}
