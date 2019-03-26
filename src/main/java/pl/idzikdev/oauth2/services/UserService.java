package pl.idzikdev.oauth2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.idzikdev.oauth2.models.UserInfo;
import pl.idzikdev.oauth2.repositories.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public UserInfo getUserInfoByUsername(String username){
        return repository.findByUsername(username);
    }

}
