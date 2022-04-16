package com.vektorel.java130ilkspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * Bir sınıfın controller olduğunu belirtmek için,
 * spring uygulamasına entegre etmek için,
 * @Controller annottions eklenir. *
 * Controller -> son kullanıcı yani istemci yani Pc ile
 * iletişime geçen kısımdır.
 * Genel de rest işlemleri için @RestController kullanılır.
 * SORU: Peki soru şu, bu sınıfı erişmek isteyen bir kullanıcı bu sınıfa nasıl
 * gelecek ???
 * CEVAP: Bu sınıfa ulaşılabilecek bir url tanımlamak zorundayım
 * SORU: peki bu url nasıl tanımlanır?
 * CEVAP:
 *  - Sunucudan bir şey talep etmeye REQUEST-Istek
 *  - istek URL ile yapılır. url nin alınması işlemine MAPPING denir
 *  - @RequestMapping gelen url isteğini yakalar
 *  Artık bu sınıfa erişmek isteyen kişi-kullanıcı
 *  localhost:9090/musteri -> şeklinde erişim sağlayacaktır.
 */
@RestController
@RequestMapping("/musteri")
public class MusteriController {

    /**
     * Eğer bir method u erişime açmak istiyor iseniz. erişim şeklini
     * ve adresini(url) belirtmelsiniz.
     * Bu işlem için
     * @GetMapping, @PostMapping, @PutMapping, şeklinde ihtiyaca göre
     * kullanım yapmalısınız.
     * DİKKAT: biz burada dışarıdan her hangi bir bilgiye ihtiyaç durmadığımız
     * için ve sadece gelen isteğe cevap döneceğimiz için
     * @GetMapping annotations kullanacağız.
     * get isteği temel browser url isteğidir.
     * @return
     */

    @GetMapping("/menu")
    public String Menu(){
        return "[" +
                "{" +
                "id: 0001," +
                "adres: 'Ankara'," +
                "ad: 'Muhammet'," +
                "soyad: 'Hoca'}]";
    }

    /**
     * Bu Method a dışarıdan bir kullanıcının erişim sağlayıp
     * veri gönderebilmesi için @PostMapping annotation kullanılır.
     * kullanıcı post isteği atarak, ad,soyad,adres bilgisini bu method a
     * iletebilir.
     * @param ad
     * @param soyad
     * @param adres
     * @return
     *
     * http://localhost:9090/musteri/saveuser
    */
    @PostMapping("/saveuser")
    public String saveuser(String ad, String soyad, String adres){
        String uuid = UUID.randomUUID().toString();
        System.out.println("Kullanıcı kayıt edildi.");
        System.out.println("id....: "+ uuid);
        System.out.println("Ad....: "+ ad);
        System.out.println("Soyad.: "+ soyad);
        System.out.println("Adres.: "+ adres);

        return uuid;
    }


}
