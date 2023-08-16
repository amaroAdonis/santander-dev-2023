package dio.santander.santanderdev2023.service;

import dio.santander.santanderdev2023.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
