package com.example.car_renovation.document;

import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class DocumentService {

    private final DocumentRepository documentRepository;

    public DocumentService(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }

    public List<Document> getDocument() {
        return documentRepository.findAll();
    }
    public List<Document> getDocumentByName(String name) {
        return documentRepository.findDocumentByName(name);
    }
//    public List<Document> getDocumentByType(String type) {
//        return documentRepository.findDocumentByType(type);
//    }
    public List<Document> getDocumentByClient(String client) {
        return documentRepository.findDocumentByClient(client);
    }
    public  Document saveDocument(Document document) {
        return documentRepository.save(document);
    }
}

