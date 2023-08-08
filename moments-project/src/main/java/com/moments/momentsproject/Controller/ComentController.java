package com.moments.momentsproject.Controller;

import com.moments.momentsproject.Model.Moment;
import com.moments.momentsproject.Service.ComentService;
import com.moments.momentsproject.Service.MomentService;
import jakarta.persistence.EntityManager;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/coment")
public class ComentController {
ComentService comentService;

}
