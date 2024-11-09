package com.rickmorty.Repository;

import com.rickmorty.Models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {
    Optional<UserModel> findByEmail(String email);
    boolean existsByEmail(String email);

    @Query("SELECT u FROM UserModel u WHERE u.id = :id AND u.active = :active")
    Optional<UserModel> findByIdAndActive(@Param("id") Long id, @Param("active") Integer active);
}
