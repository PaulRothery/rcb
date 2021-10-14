package com.rcb.service;

import com.rcb.model.AdjunctFermentable;
import com.rcb.repository.AdjunctFermentableRepository;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.Instant;
import java.util.List;
import java.util.Optional;

@Service
@Data
@Slf4j
public class AdjunctFermentableService {

    private final AdjunctFermentableRepository adjunctFermentableRepository;

    public AdjunctFermentableService(AdjunctFermentableRepository adjunctFermentableRepository) {
        this.adjunctFermentableRepository = adjunctFermentableRepository;
    }


    public List<AdjunctFermentable> findAll() {

        return adjunctFermentableRepository.findAll();
    }

    public AdjunctFermentable findAdjunctFermentable(String name) {

        Optional<AdjunctFermentable> adjunctFermentable;
        if (NumberUtils.isCreatable(name)) {
            adjunctFermentable = adjunctFermentableRepository.findById(Long.valueOf(name));
        } else {
            adjunctFermentable = adjunctFermentableRepository.findAdjunctFermentableByName(name);
        }

        return adjunctFermentable.get();
    }

    public AdjunctFermentable createAdjunctFermentable(AdjunctFermentable adjunctFermentable) {
        if (adjunctFermentable.getDate() == null) {
            adjunctFermentable.setDate(Date.from(Instant.now()));
        }
        adjunctFermentable = adjunctFermentableRepository.save(adjunctFermentable);
        return adjunctFermentable;
    }

    public AdjunctFermentable updateAdjunctFermentable(String id, AdjunctFermentable adjunctFermentable) {

        if (adjunctFermentableRepository.existsById(Long.valueOf(id))) {
            Optional<AdjunctFermentable> oldAdjunctFermentable;
            oldAdjunctFermentable = adjunctFermentableRepository.findById(Long.valueOf(id));
            adjunctFermentable.setId(oldAdjunctFermentable.get().getId());
            adjunctFermentableRepository.save(adjunctFermentable);
        }
        return adjunctFermentable;
    }

    public void deleteAdjunctFermentable(String name) {

        if (NumberUtils.isCreatable(name)) {
            adjunctFermentableRepository.deleteById(Long.valueOf(name));
        } else {
            adjunctFermentableRepository.deleteByName(name);
        }

    }
}
