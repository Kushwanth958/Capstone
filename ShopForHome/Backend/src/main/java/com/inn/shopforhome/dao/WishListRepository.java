package com.inn.shopforhome.dao;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inn.shopforhome.model.WishList;


@Repository
public interface WishListRepository extends JpaRepository<WishList, Integer> {

    Page<WishList> findAllByUserId(Long id, Pageable pageable);

	
    


}
