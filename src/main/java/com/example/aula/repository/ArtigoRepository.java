package com.example.aula.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.aula.domain.onetomany.Artigo;

@Repository
public interface ArtigoRepository extends JpaRepository<Artigo, Integer>{

}
