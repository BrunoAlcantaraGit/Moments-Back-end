package com.moments.momentsproject.Repository;

import com.moments.momentsproject.Model.Coment;
import com.moments.momentsproject.Model.Moment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComentRepository extends JpaRepository<Coment,Long> {
}
