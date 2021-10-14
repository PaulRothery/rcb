package com.rcb.dao;

import com.rcb.model.AdjunctFermentable;
import com.rcb.repository.AdjunctFermentableRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
@Transactional
@Slf4j
public class AdjunctFermentableDAO {

    private final AdjunctFermentableRepository adjunctFermentableRepository;

    public AdjunctFermentableDAO(AdjunctFermentableRepository adjunctFermentableRepository) {
        this.adjunctFermentableRepository = adjunctFermentableRepository;
    }

    public AdjunctFermentable findById(long id) {


        String errMsg;

        Optional<AdjunctFermentable> adjunctFermentable = adjunctFermentableRepository.findById(id);

        if (adjunctFermentable.isPresent()) {
            return adjunctFermentable.get();
        } else {
            errMsg = String.format("AdjunctFermentable not found :%s", id);
            log.error(errMsg);

        }
        return null;
    }


}
