package edu.hm.cs.swt2ss18.wmtipp.service.mitspieler;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MitspielerRepository extends JpaRepository<Mitspieler, String> {
  // https://docs.spring.io/spring-data/jpa/docs/1.5.0.RELEASE/reference/html/jpa.repositories.html
  List<Mitspieler> findByIsAdmin(boolean b);

}
