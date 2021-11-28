package com.rcb.service;

import com.rcb.model.Yeast;
import com.rcb.repository.YeastRepository;
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
public class YeastService {

    private final YeastRepository yeastRepository;

    public YeastService(YeastRepository yeastRepository) {
        this.yeastRepository = yeastRepository;
    }


    public List<Yeast> findAll() {

        return yeastRepository.findAll();
    }

    public Yeast findYeast(String strain) {

        Optional<Yeast> yeast;
        if (NumberUtils.isCreatable(strain)) {
            yeast = yeastRepository.findById(Long.valueOf(strain));
        } else {
            yeast = yeastRepository.findYeastByName(strain);
        }

        return yeast.get();
    }

    public Yeast createYeast(Yeast yeast) {
        if (yeast.getDate() == null) {
            yeast.setDate(LocalDate.now());
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

    public void deleteYeast(String strain) {

        if (NumberUtils.isCreatable(strain)) {
            yeastRepository.deleteById(Long.valueOf(strain));
        } else {
            yeastRepository.deleteByName(strain);
        }

    }
}
