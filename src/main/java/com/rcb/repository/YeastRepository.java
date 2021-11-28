package com.rcb.repository;

import com.rcb.model.Yeast;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface YeastRepository extends JpaRepository<Yeast, Long> {


    @Query("SELECT yeast FROM Yeast yeast WHERE yeast.strain = ?1")
    Optional<Yeast> findYeastByName(String strain);

    @Transactional
    @Modifying
    @Query("DELETE FROM Yeast yeast WHERE yeast.strain = ?1")
    void deleteByName(String strain);
}
