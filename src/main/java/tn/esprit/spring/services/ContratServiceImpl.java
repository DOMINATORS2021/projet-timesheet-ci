package tn.esprit.spring.services;

import java.util.List;

import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entities.Contrat;
import tn.esprit.spring.entities.User;
import tn.esprit.spring.repository.ContratRepository;

@Service
public class ContratServiceImpl implements IContratService {

    @Autowired
    ContratRepository contratRepository;

    private static final Logger l = LogManager.getLogger(ContratServiceImpl.class);

    @Override
    public List<Contrat> retrieveAllContrats() {
        List<Contrat> contrats = null;
        try {

            l.info("In retrieveAllUsers() : ");
            contrats = (List<Contrat>) contratRepository.findAll();
            for (Contrat contrat : contrats) {
                l.debug("contrat +++ : " + contrats);
            }
            l.info("Out of retrieveAllContrats() : ");
        } catch (Exception e) {
            l.error("Error in retrieveAllContrats() : " + e);
        }

        return contrats;
    }

    @Override
    public Contrat addContrat(Contrat c) {
        return contratRepository.save(c);
    }


    @Override
    public Contrat updateContrat(Contrat c) {
        return contratRepository.save(c);
    }
    @Override
    public void deleteContrat(String reference) {
        contratRepository.deleteById(Integer.parseInt(reference));
    }

    @Override
    public Contrat retrieveContrat(String reference) {
        l.info("in  retrieveContrat reference = " + reference);
        //User u =  contratRepository.findById(Long.parseLong(id)).orElse(null);
        //int i = 1/0;
        Contrat c =  contratRepository.findById(Integer.parseInt(reference)).orElse(null);
        l.info("contrat returned : " + c);
        return c;
    }
}