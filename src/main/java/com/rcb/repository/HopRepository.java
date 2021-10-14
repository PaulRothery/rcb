package com.rcb.repository;

import com.rcb.model.Hop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface HopRepository extends JpaRepository<Hop, Long> {


    @Query("SELECT hop FROM Hop hop WHERE hop.name = ?1")
    Optional<Hop> findHopByName(String name);

    @Transactional
    @Modifying
    @Query("DELETE FROM Hop hop WHERE hop.name = ?1")
    void deleteByName(String name);
}
