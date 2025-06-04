import org.example.model.Message;
import org.example.repository.MessageRepository;
import org.example.service.MessageService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MessageServicetest {

    @Test
    public void savetest(){
        MessageRepository mockmessage=mock(MessageRepository.class);
        Message mensaje = new Message(423L, "Hola");
        when(mockmessage.save(mensaje)).thenReturn(mensaje);

        MessageService messageService = new MessageService(mockmessage);
        Message resultadoMensaje = messageService.createMessage(mensaje);
        assertEquals(mensaje, resultadoMensaje);
    }
    @Test
    public void getMessagebyIdTest(){
        MessageRepository mockmessage=mock(MessageRepository.class);
        Message mensaje = new Message(423L, "Hola");
        when(mockmessage.findById(423L)).thenReturn(Optional.of(mensaje));

        MessageService messageService = new MessageService(mockmessage);
        Optional<Message> resultadoId = messageService.getMessageById(423L);
        assertEquals(Optional.of(mensaje), resultadoId);
    }
}
