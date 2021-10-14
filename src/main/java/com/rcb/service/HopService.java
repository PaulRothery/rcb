package com.rcb.service;

import com.rcb.model.Hop;
import com.rcb.repository.HopRepository;
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
public class HopService {

    private final HopRepository hopRepository;

    public HopService(HopRepository hopRepository) {
        this.hopRepository = hopRepository;
    }


    public List<Hop> findAll() {

            return hopRepository.findAll();
    }

    public Hop findHop(String name) {

        Optional<Hop> hop;
        if (NumberUtils.isCreatable(name)) {
            hop = hopRepository.findById(Long.valueOf(name));
        } else {
            hop = hopRepository.findHopByName(name);
        }

        return hop.get();
    }

    public Hop createHop(Hop hop) {
        if (hop.getDate() == null) {
            hop.setDate(Date.from(Instant.now()));
        }
        hop = hopRepository.save(hop);
        return hop;
    }

    public Hop updateHop(String id, Hop hop) {

        if (hopRepository.existsById(Long.valueOf(id))) {
            Optional<Hop> oldHop;
            oldHop = hopRepository.findById(Long.valueOf(id));
            hop.setId(oldHop.get().getId());
            hop.setDate(Date.from(Instant.now()));
            hopRepository.save(hop);
        }
        return hop;
    }

    public void deleteHop(String name) {

        if (NumberUtils.isCreatable(name)) {
            hopRepository.deleteById(Long.valueOf(name));
        } else {
            hopRepository.deleteByName(name);
        }

    }
}
