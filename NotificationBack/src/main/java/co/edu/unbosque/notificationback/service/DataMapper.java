package co.edu.unbosque.notificationback.service;

import co.edu.unbosque.notificationback.model.NotificationChoiceDTO;
import co.edu.unbosque.notificationback.model.NotificationChoiceEntity;

public class DataMapper {
    public static NotificationChoiceDTO notificationChoiceEntityToDTO(NotificationChoiceEntity entity) {
        return new NotificationChoiceDTO(
                entity.getId_client(),
                entity.isChoice_push(),
                entity.isChoice_sms(),
                entity.isChoice_email()
        );
    }

    public static NotificationChoiceEntity notificationChoiceDTOtoEntity(NotificationChoiceDTO dto) {
        return new NotificationChoiceEntity(
                dto.getId_client(),
                dto.isChoice_push(),
                dto.isChoice_sms(),
                dto.isChoice_email()
        );
    }
}
