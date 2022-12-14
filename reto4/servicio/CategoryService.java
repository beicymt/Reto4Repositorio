package com.ciclo3.reto.reto4.servicio;

import com.ciclo3.reto.reto4.entidad.Category;
import com.ciclo3.reto.reto4.repositorio.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CategoryService {
    @Autowired
    private CategoryRepository repository;

    /** Peticion GET Mostrar datos
     */
    public List<Category> getCategories(){
        return repository.findAll();
    }

    public Category getCategory(long id){
        return repository.findById(id).orElse(null);
    }

    /** Peticion POST Guardar datos
     */
    public Category saveCategory(Category category){
        return repository.save(category);
    }

    //PUT = UPDATE
    public Category updateCategory(Category categoryUpd){
        Category categoryOld = getCategory(categoryUpd.getId());
        categoryOld.setName(categoryUpd.getName());
        categoryOld.setDescription(categoryUpd.getDescription());
        return repository.save(categoryOld);
    }

    //DELETE
    public void deleteCategory(long id){
        repository.deleteById(id);
    }

}

