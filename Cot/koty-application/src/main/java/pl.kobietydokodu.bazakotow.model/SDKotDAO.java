package pl.kobietydokodu.bazakotow.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SDKotDAO {
    @Autowired
    protected KotService kotService;
}
