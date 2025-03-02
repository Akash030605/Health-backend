package healthy.healthy.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import healthy.healthy.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
    
}
