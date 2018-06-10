package pl.kobietydokodu.bazakotow.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public interface KotDao extends CrudRepository<Kot, Long> {
    public List<Kot> findBykotId(Long kotId);
}
