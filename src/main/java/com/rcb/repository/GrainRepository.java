package com.rcb.repository;

import com.rcb.model.Grain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface GrainRepository extends JpaRepository<Grain, Long> {


    @Query("SELECT grain FROM Grain grain WHERE grain.name = ?1")
    Optional<Grain> findGrainByName(String name);

    @Transactional
    @Modifying
    @Query("DELETE FROM Grain grain WHERE grain.name = ?1")
    void deleteByName(String name);
}
