package pl.idzikdev.oauth2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.idzikdev.oauth2.models.UserInfo;
@Repository
@Transactional
public interface UserRepository implements JpaRepository<UserInfo,Integer> {

}
