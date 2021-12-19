/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usa.ElMercader5.repositorios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import usa.ElMercader5.modelo.Gadget;
import java.util.List;
import java.util.Optional;
import usa.ElMercader5.repositorios.crud.CrudGadgetRepository;

/**
 *
 * @author DELL
 */
@Repository
public class GadgetRepository {
    
    @Autowired
    private CrudGadgetRepository repo;
    
    public List<Gadget> getAll(){
        return repo.findAll();
    }
    
    public Optional<Gadget> getById(Integer id){
        return repo.getById(id);
    }
    
    public Gadget save(Gadget producto){
        return repo.save(producto);
    }
    
    public void delete(Gadget producto){
        repo.delete(producto);
    }
    
    public List<Gadget> getByPrice(double price){
        return repo.findByPriceLessThanEqual(price);
    }
    
    public List<Gadget> getByDescriptionContains(String description){
        return repo.findByDescriptionContainingIgnoreCase(description);
    }
}
