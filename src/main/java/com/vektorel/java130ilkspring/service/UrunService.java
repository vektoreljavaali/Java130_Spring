package com.vektorel.java130ilkspring.service;

import com.vektorel.java130ilkspring.repository.UrunRepository;
import com.vektorel.java130ilkspring.repository.entity.Urun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Spring  bir sınıfın service olduğunu
 * @Service annotation ile anlar
 */
@Service
public class UrunService {
    /**
     * DİKKAT!!! Interface ler sınıflar gibi new anahtarı
     * ile nesne oluşturmaz.
     * Spring aslındea AOP kullanarak yapıları
     * soyutladığı için new işlemini çalışma zamanında
     * kendisi yapmaktadır.
     * Otomatik nesne oluşturmayı spring e devretmek
     * için, ya constructor da siz kurgulama yaparsınız
     * ya da @Autowired ile spring e devredersiniz.
     *
     */
     @Autowired
     UrunRepository repository;

    public void save(Urun urun){
        repository.save(urun);
    }
    public void update(Urun urun){
        repository.save(urun);
    }
    public void delete(long id){
        repository.deleteById(id);
    }
    public List<Urun> findall(){
       return repository.findAll();
    }


}
