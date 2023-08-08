package com.moments.momentsproject.Controller;

import com.moments.momentsproject.Model.Moment;
import com.moments.momentsproject.Service.MomentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/moment")
public class MomentController {
    MomentService momentService;

    @PostMapping("/salvarMoment")
    public ResponseEntity<Moment> Salvar(@RequestBody Moment moment) throws Exception {
        return new ResponseEntity<>(momentService.salvarMomento(moment), HttpStatus.CREATED);
        /*try {
            return new ResponseEntity<>(momentService.salvarMomento(moment), HttpStatus.CREATED);

        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);}

    }*/
    }
}