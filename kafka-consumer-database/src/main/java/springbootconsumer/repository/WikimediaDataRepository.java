package springbootconsumer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springbootconsumer.model.WikimediaData;

public interface WikimediaDataRepository extends JpaRepository<WikimediaData, Long> {



}
