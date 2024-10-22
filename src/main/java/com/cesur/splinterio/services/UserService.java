package com.cesur.splinterio.services;

import com.cesur.splinterio.models.dtos.UserDTO;

public interface UserService {
    UserDTO getUserByEmail(String email);
    void updateUser(UserDTO user);//Se usa DTO en vez de User asecas para hacer de clase intermediaria. Es más seguro.
    void deleteUser(Long id);//No tendría sentido enviar el objeto al completo, pues la entrada en la BDD se suele borrar mediante ID.
    void storeUser(UserDTO user);//Aquí queremos almacenar el usuario completo y, por lo tanto, es casi lo mismo que updateUser().
}