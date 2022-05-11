package models.services;

import models.dao.CientificosDao;
import models.dto.CientificosDto;

public class CientificoService {

	//el service es el intermediario entre base de datos, controlador y el modelo
	public void validarCreate(CientificosDto cientificosDto) {
		
		//Instanciamos el DAO.
		CientificosDao clienteDao;
		
		//Aquí podríamos poner una condición.
		
		//? ClienteDao clienteDao = new ClienteDao();
		clienteDao = new CientificosDao();
		//Creamos al cliente.
		clienteDao.createCientifico(cientificosDto);
		
	}
}
