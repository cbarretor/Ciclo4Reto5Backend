/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usa.ElMercader5.repositorios;

import usa.ElMercader5.modelo.User;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import usa.ElMercader5.repositorios.crud.CrudUserRepository;

/**
 *
 * @author DELL
 */
@Repository
public class UserRepository {
    /**
     * Metodo para llamar el repositorio CRUD
     */
    @Autowired
    private CrudUserRepository repo;
    
    /**
     * Metodo para buscar todos los usuarios
     * @return Una lista con todos los usuarios registrados
     */
    public List<User> getAll() {
        return repo.findAll();
    }

    /**
     * Metodo para buscar un usuario por Id
     * @param id con el que busca al usuario
     * @return el usuario registrado con ese Id
     */
    public Optional<User> getById(Integer id) {
        return repo.getById(id);
    }
    
    /**
     * Metodo para guardar un usuario en la BD
     * @param usuario campo donde se guardara al usuario
     * @return usuario guardado en la BD
     */
    public User save(User usuario) {
        return repo.save(usuario);
    }
    
    /**
     * Metodo para eliminar un usuario de la BD
     * @param usuario a eliminar
     */
    public void delete(User usuario){
        repo.delete(usuario);
    }
    
    /**
     * Metodo para buscar por un Email en especifico
     * @param email 
     * @return datos relacionados con ese Email buscado
     */
    public Optional<User> getByEmail(String email){
        return repo.findByEmail(email);
    }       

    /**
     * Metodo para consulta de combinacion email-password
     * @param email del usuario 
     * @param password del usuario  
     * @return datos relacionados con ese Email y Contraseña registrada 
     */
    public Optional<User> getByEmailAndPassword(String email, String password){
        return repo.findByEmailandPassword(email, password);
    } 
    
    /**
     * Metodo para consulta de usuario por mes de cumpleaños
     * @param monthBirthtDay 
     * @return Una lista con los usuarios que tengan ese mes de cumpleaños
     */
    public List<User> getByMonthBirthtDay(String monthBirthtDay){
        return repo.findByMonthBirthtDay(monthBirthtDay);
    }
    
}
