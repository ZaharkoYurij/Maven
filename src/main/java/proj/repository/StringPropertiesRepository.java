package proj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proj.entity.StringProperties;

/**
 * Created by SC on 10.08.2016.
 */
public interface StringPropertiesRepository extends JpaRepository<StringProperties, Integer> {
}