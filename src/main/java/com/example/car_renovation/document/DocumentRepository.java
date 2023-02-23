package com.example.car_renovation.document;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DocumentRepository extends JpaRepository<Document,Long> {
    List<Document> findAll();
    List<Document> findDocumentByName(String name);
//    List<Document> findDocumentByType(String type);

    List<Document> findDocumentByClient(String client);
}
