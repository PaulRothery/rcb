package com.rcb.service;

import com.rcb.model.Adjunct;
import com.rcb.repository.AdjunctRepository;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
@Data
@Slf4j
public class AdjunctService {

    private final AdjunctRepository adjunctRepository;

    public AdjunctService(AdjunctRepository adjunctRepository) {
        this.adjunctRepository = adjunctRepository;
    }


    public List<Adjunct> findAll() {

        return adjunctRepository.findAll();
    }

    public Adjunct findAdjunctFermentable(String name) {

        Optional<Adjunct> adjunctFermentable;
        if (NumberUtils.isCreatable(name)) {
            adjunctFermentable = adjunctRepository.findById(Long.valueOf(name));
        } else {
            adjunctFermentable = adjunctRepository.findAdjunctFermentableByName(name);
        }

        return adjunctFermentable.get();
    }

    public Adjunct createAdjunctFermentable(Adjunct adjunct) {
        if (adjunct.getDate() == null) {
            adjunct.setDate(LocalDate.now());
        }
        adjunct = adjunctRepository.save(adjunct);
        return adjunct;
    }

    public Adjunct updateAdjunctFermentable(String id, Adjunct adjunct) {

        if (adjunctRepository.existsById(Long.valueOf(id))) {
            Optional<Adjunct> oldAdjunctFermentable;
            oldAdjunctFermentable = adjunctRepository.findById(Long.valueOf(id));
            adjunct.setId(oldAdjunctFermentable.get().getId());
            adjunctRepository.save(adjunct);
        }
        return adjunct;
    }

    public void deleteAdjunctFermentable(String name) {

        if (NumberUtils.isCreatable(name)) {
            adjunctRepository.deleteById(Long.valueOf(name));
        } else {
            adjunctRepository.deleteByName(name);
        }

    }
}
