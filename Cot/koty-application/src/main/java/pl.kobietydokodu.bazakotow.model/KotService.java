package pl.kobietydokodu.bazakotow.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface KotService extends CrudRepository<Kot, Long> {
    public List<Kot> findBymyId(int myId);
}
