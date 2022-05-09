package com.api.ems.repository;

import com.api.ems.entity.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur,Long> {
    @Query(" select u from Utilisateur u " +
            " where u.username = ?1")
    Optional<Utilisateur> findUtilisateurWithName(String username);

}
