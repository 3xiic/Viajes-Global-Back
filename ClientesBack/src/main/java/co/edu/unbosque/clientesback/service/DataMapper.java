package co.edu.unbosque.clientesback.service;

import co.edu.unbosque.clientesback.model.ClientDTO;
import co.edu.unbosque.clientesback.model.ClientEntity;

public class DataMapper {
    public static ClientDTO clientEntitytoDTO(ClientEntity entity) {
        return new ClientDTO(
                entity.getId_client(),
                entity.getEmail(),
                entity.getUsername(),
                entity.getTelephone(),
                entity.getPassword(),
                entity.getBookingIds(),
                entity.getNotificationChoiceId()
        );
    }

    public static ClientEntity clientDTOtoEntity(ClientDTO dto) {
        return new ClientEntity(
                dto.getId_client(),
                dto.getEmail(),
                dto.getUsername(),
                dto.getTelephone(),
                dto.getPassword(),
                dto.getBookingIds(),
                dto.getNotificationChoiceId()
        );
    }
}
