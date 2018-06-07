package pl.kobietydokodu.bazakotow.model;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ZabawkaDAO extends CrudRepository<Zabawka, Long> {
        public List<Zabawka> findByzid(int zid);
    }
