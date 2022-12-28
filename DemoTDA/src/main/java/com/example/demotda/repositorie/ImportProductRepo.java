package com.example.demotda.repositorie;

import com.example.demotda.model.ImportProduct;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImportProductRepo extends JpaRepository<ImportProduct,Long> {

}
