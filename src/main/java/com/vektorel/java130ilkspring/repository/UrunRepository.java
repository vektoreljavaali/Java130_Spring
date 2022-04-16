package com.vektorel.java130ilkspring.repository;

import com.vektorel.java130ilkspring.repository.entity.Urun;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Bir interface nini respository olarak kullanılması için
 * @Repository annotation kullanılır.
 * Ayrıca bu repo ya hangi yapının entegre edileceğinin
 * bildirilmesi için Jpa kullanılır ve miras alınır.
 */
@Repository
public interface UrunRepository extends JpaRepository<Urun, Long> {
}
