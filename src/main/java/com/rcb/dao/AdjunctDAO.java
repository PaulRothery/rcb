package com.rcb.dao;

import com.rcb.model.Adjunct;
import com.rcb.repository.AdjunctRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
@Transactional
@Slf4j
public class AdjunctDAO {

    private final AdjunctRepository adjunctRepository;

    public AdjunctDAO(AdjunctRepository adjunctRepository) {
        this.adjunctRepository = adjunctRepository;
    }

    public Adjunct findById(long id) {


        String errMsg;

        Optional<Adjunct> adjunct = adjunctRepository.findById(id);

        if (adjunct.isPresent()) {
            return adjunct.get();
        } else {
            errMsg = String.format("Adjunct not found :%s", id);
            log.error(errMsg);

        }
        return null;
    }


}
