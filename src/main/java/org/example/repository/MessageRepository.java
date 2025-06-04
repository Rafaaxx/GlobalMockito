

package org.example.repository;



import org.example.model.Message;

import java.util.Optional;



public interface MessageRepository {

    Optional findById(Long id);

    Message save(Message message);

} 