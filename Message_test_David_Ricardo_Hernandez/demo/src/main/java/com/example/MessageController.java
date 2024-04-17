package com.example;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.Document;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/message")
@RequiredArgsConstructor
public class MessageController {

   /* @RequestMapping(value = "/message/", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity postMessage(@RequestBody Map<String, List<Map<String, Object>>> json){
        return new ResponseEntity(servicioLiberia.guardarLibro(json));
    }

    @GetMapping
    public ResponseEntity getMessage(){
        return new ResponseEntity(servicioLiberia.obtenerLibros(), HttpStatus.OK);
    }
    */



}
