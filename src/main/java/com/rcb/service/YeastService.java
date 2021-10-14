package com.rcb.service;

import com.rcb.model.Yeast;
import com.rcb.repository.YeastRepository;
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
public class YeastService {

    private final YeastRepository yeastRepository;

    public YeastService(YeastRepository yeastRepository) {
        this.yeastRepository = yeastRepository;
    }


    public List<Yeast> findAll() {

        return yeastRepository.findAll();
    }

    public Yeast findYeast(String name) {

        Optional<Yeast> yeast;
        if (NumberUtils.isCreatable(name)) {
            yeast = yeastRepository.findById(Long.valueOf(name));
        } else {
            yeast = yeastRepository.findYeastByName(name);
        }

        return yeast.get();
    }

    public Yeast createYeast(Yeast yeast) {
        if (yeast.getDate() == null) {
            yeast.setDate(Date.from(Instant.now()));
        }
        yeast = yeastRepository.save(yeast);
        return yeast;
    }

    public Yeast updateYeast(String id, Yeast yeast) {

        if (yeastRepository.existsById(Long.valueOf(id))) {
            Optional<Yeast> oldYeast;
            oldYeast = yeastRepository.findById(Long.valueOf(id));
            yeast.setId(oldYeast.get().getId());
            yeastRepository.save(yeast);
        }
        return yeast;
    }

    public void deleteYeast(String name) {

        if (NumberUtils.isCreatable(name)) {
            yeastRepository.deleteById(Long.valueOf(name));
        } else {
            yeastRepository.deleteByName(name);
        }

    }
}
