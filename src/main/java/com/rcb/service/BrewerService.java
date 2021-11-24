package com.rcb.service;

import com.rcb.model.Brewer;
import com.rcb.repository.BrewerRepository;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Data
@Slf4j
public class BrewerService {

    private final BrewerRepository brewerRepository;

    public BrewerService(BrewerRepository brewerRepository) {
        this.brewerRepository = brewerRepository;
    }


    public List<Brewer> findAll() {

        return brewerRepository.findAll();
    }

    public Brewer findBrewer(String name) {

        Optional<Brewer> brewer;
        if (NumberUtils.isCreatable(name)) {
            brewer = brewerRepository.findById(Long.valueOf(name));
        } else {
            brewer = brewerRepository.findBrewerByName(name);
        }

        return brewer.get();
    }

    public Brewer createBrewer(Brewer brewer) {
        brewer = brewerRepository.save(brewer);
        return brewer;
    }

    public Brewer updateBrewer(String id, Brewer brewer) {

        if (brewerRepository.existsById(Long.valueOf(id))) {
            Optional<Brewer> oldBrewer;
            oldBrewer = brewerRepository.findById(Long.valueOf(id));
            brewer.setId(oldBrewer.get().getId());
            brewerRepository.save(brewer);
        }
        return brewer;
    }

    public void deleteBrewer(String name) {

        if (NumberUtils.isCreatable(name)) {
            brewerRepository.deleteById(Long.valueOf(name));
        } else {
            brewerRepository.deleteByName(name);
        }

    }
}
