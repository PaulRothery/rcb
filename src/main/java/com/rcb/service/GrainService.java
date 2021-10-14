package com.rcb.service;

import com.rcb.model.Grain;
import com.rcb.repository.GrainRepository;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Data
@Slf4j
public class GrainService {

    private final GrainRepository grainRepository;

    public GrainService(GrainRepository grainRepository) {
        this.grainRepository = grainRepository;
    }


    public List<Grain> findAll() {

        return grainRepository.findAll();
    }

    public Grain findGrain(String name) {

        Optional<Grain> grain;
        if (NumberUtils.isCreatable(name)) {
            grain = grainRepository.findById(Long.valueOf(name));
        } else {
            grain = grainRepository.findGrainByName(name);
        }

        return grain.get();
    }

    public Grain createGrain(Grain grain) {
        grain = grainRepository.save(grain);
        return grain;
    }

    public Grain updateGrain(String id, Grain grain) {

        if (grainRepository.existsById(Long.valueOf(id))) {
            Optional<Grain> oldGrain;
            oldGrain = grainRepository.findById(Long.valueOf(id));
            grain.setId(oldGrain.get().getId());
            grainRepository.save(grain);
        }
        return grain;
    }

    public void deleteGrain(String name) {

        if (NumberUtils.isCreatable(name)) {
            grainRepository.deleteById(Long.valueOf(name));
        } else {
            grainRepository.deleteByName(name);
        }

    }
}
