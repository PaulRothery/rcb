package com.rcb.repository;

import com.rcb.model.Brewer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface BrewerRepository extends JpaRepository<Brewer, Long> {


    @Query("SELECT brewer FROM Brewer brewer WHERE brewer.name = ?1")
    Optional<Brewer> findBrewerByName(String name);

    @Transactional
    @Modifying
    @Query("DELETE FROM Brewer brewer WHERE brewer.name = ?1")
    void deleteByName(String name);
}
