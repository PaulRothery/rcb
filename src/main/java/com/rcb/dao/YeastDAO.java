package com.rcb.dao;

import com.rcb.model.Yeast;
import com.rcb.repository.YeastRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
@Transactional
@Slf4j
public class YeastDAO {

    private final YeastRepository yeastRepository;

    public YeastDAO(YeastRepository yeastRepository) {
        this.yeastRepository = yeastRepository;
    }

    public Yeast findById(long id) {


        String errMsg;

        Optional<Yeast> yeast = yeastRepository.findById(id);

        if (yeast.isPresent()) {
            return yeast.get();
        } else {
            errMsg = String.format("Yeast not found :%s", id);
            log.error(errMsg);

        }
        return null;
    }


}
