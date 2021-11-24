package com.rcb.dao;

import com.rcb.model.Brewer;
import com.rcb.repository.BrewerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
@Transactional
@Slf4j
public class BrewerDAO {

    private final BrewerRepository brewerRepository;

    public BrewerDAO(BrewerRepository brewerRepository) {
        this.brewerRepository = brewerRepository;
    }

    public Brewer findById(long id) {


        String errMsg;

        Optional<Brewer> brewer = brewerRepository.findById(id);

        if (brewer.isPresent()) {
            return brewer.get();
        } else {
            errMsg = String.format("Brewer not found :%s", id);
            log.error(errMsg);

        }
        return null;
    }


}
