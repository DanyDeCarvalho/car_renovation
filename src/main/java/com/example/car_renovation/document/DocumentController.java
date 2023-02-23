package com.example.car_renovation.document;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/document")
public class DocumentController {

    private final DocumentService documentService;
    @Autowired
    public DocumentController(DocumentService documentService) {
        this.documentService = documentService;
    }

    @GetMapping(value = "/getAll")
    public List<Document> getDocument() {
        return documentService.getDocument();
    }
    @GetMapping(value = "/{name}")
    public List<Document> getDocumentByName(@PathVariable String name) {
        return documentService.getDocumentByName(name);
    }
//    @GetMapping(value = "/{type}")
//    public List<Document> getDocumentByType(@PathVariable String type) {
//        return documentService.getDocumentByType(type);
//    }
    @GetMapping(value = "/{client}")
    public List<Document> getDocumentByClient(@PathVariable String client) {
        return documentService.getDocumentByClient(client);
    }
    @PostMapping(value = "/creation")
    public Document saveDocument(@RequestBody Document document) {
        return documentService.saveDocument(document);
    }
}
