package co.edu.unbosque.viajes_global_back.controller;

import co.edu.unbosque.viajes_global_back.model.ClientDTO;
import co.edu.unbosque.viajes_global_back.model.ClientEntity;
import co.edu.unbosque.viajes_global_back.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;

@RestController
@RequestMapping("/client")

public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping("/register")
    public ClientDTO registerClient(@RequestBody ClientDTO clientDTO){
        return clientService.registerClient(clientDTO);
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(
            @RequestParam String user,
            @RequestParam String password) {

        ClientEntity clientEntity = clientService.findByUser(user);

        if (clientEntity != null && clientService.validatePassword(password, clientEntity.getPassword())) {
            return ResponseEntity.status(HttpStatus.ACCEPTED).body("Login con éxito");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Cliente o detalles no existen");
        }
    }
}
