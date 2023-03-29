package com.restapi.server;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.restapi.server.model.server;

import com.restapi.server.repository.serverRepository;



@RequestMapping("/server")
@RestController
public class ServerController {
    @Autowired
    serverRepository repo;

  

@GetMapping("/all")
public List<server> getallServers() {
    
        List<server> servers = repo.findAll();
        if (servers.isEmpty()) {
            return null;
        }
        else
        return servers;
     
    
}


@GetMapping("/getby/{id}")
public ResponseEntity<Object> getServer(@PathVariable String id) {
    Optional<server> server = repo.findById(id);
    if (server.isPresent()) {
        return ResponseEntity.ok(server.get());
    } else {
        String message = "Server not found with ID: " + id;
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
    }
}




    @PostMapping("/post")
    public String addServer(@RequestBody server Server)
    {
       repo.save(Server);
       return "Server is added suscessfully";
    }
    @DeleteMapping("/delete/{id}")
    public String deleteServer(@PathVariable String id){
        repo.deleteById(id);
        return "Server " + id  + "is deleted suscessfully";
    }
    @PutMapping("/putserver/{id}")
    server getUser (@PathVariable String id,@RequestBody server server ){
        server oldserver = repo.findById(id).orElse(null);
        oldserver.setName(server.getName ());
        oldserver.setLang(server.getLang ());
        oldserver.setFramework(server.getFramework());
        return repo.save(oldserver);
    }

    @GetMapping("/searchby/{name}")
    public ResponseEntity<List<server>> getServerByName(@PathVariable String name) {
        Optional<List<server>> server = repo.findByNameIgnoreCase(name);
        if (server.isPresent()) {
            return ResponseEntity.ok(server.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }
    

}
