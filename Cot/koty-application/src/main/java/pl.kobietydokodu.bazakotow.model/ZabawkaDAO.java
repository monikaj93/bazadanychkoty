package pl.kobietydokodu.bazakotow.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ZabawkaDAO extends CrudRepository<Zabawka, Long> {
        public List<Zabawka> findByzid(int zid);
    }
