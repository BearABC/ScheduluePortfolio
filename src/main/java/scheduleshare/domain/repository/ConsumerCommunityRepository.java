package scheduleshare.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import scheduleshare.domain.model.ConsumerCommunity;

@Repository
public interface ConsumerCommunityRepository extends JpaRepository<ConsumerCommunity, Integer> {

}
