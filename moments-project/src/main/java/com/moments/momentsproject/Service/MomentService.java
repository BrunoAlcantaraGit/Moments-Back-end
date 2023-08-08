package com.moments.momentsproject.Service;

import com.moments.momentsproject.Model.Moment;
import com.moments.momentsproject.Repository.MomentRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
@Data
public class MomentService {
MomentRepository momentRepository;
public Moment salvarMomento(Moment moment) throws Exception{
     return momentRepository.save(moment);
}

}
