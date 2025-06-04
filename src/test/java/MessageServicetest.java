import org.example.model.Message;
import org.example.repository.MessageRepository;
import org.example.service.MessageService;
import org.mockito.Mock;

import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MessageServicetest {
    @Mock
        private MessageService messageService;
        MessageService mockmessage=mock(MessageService.class);
        Message mensaje=new Message(423L,"Hola");
        // crear objeto Mensaje sin definir

        Optional op;

        @BeforeEach
        void setUp(){
            MockitoAnnotations.openMocks(this);
            MessageService mockmessage=mock(MessageService.class);
        }
        @Test
        public void savetest(){
            MessageRepository mockmessage=mock(MessageRepository.class);
            when(mockmessage.save(mensaje)).thenReturn(mensaje);

            MessageService messageService= new MessageService(mockmessage);
            Message resultadomensaje=messageService.createMessage(mensaje);
            assertEquals(resultadomensaje,mensaje);
        }
    @Test
    public void getMessagebyIdTest(){
        MessageRepository mockmessage=mock(MessageRepository.class);
        when(mockmessage.findById(423L)).thenReturn(mensaje);
        MessageService messageService1= new MessageService(mockmessage);
        Optional resultadoid=messageService1.getMessageById(423L);
        assertEquals(resultadoid,423L);

    }

}
