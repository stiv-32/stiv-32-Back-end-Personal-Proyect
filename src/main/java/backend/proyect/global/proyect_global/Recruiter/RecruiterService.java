package backend.proyect.global.proyect_global.Recruiter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@SuppressWarnings("null")
@Service
public class RecruiterService {
    
    @Autowired
     private RecruiterRepository recruiterRepository;

    // mostrar
    public List<Recruiter> getAllRecruiters() {
        return recruiterRepository.findAll();
    }

    public Recruiter createRecruit(Recruiter recruiter) {
        return recruiterRepository.save(recruiter);
    }

    public Recruiter updaterecruit(Recruiter recruiter) {
        return recruiterRepository.save(recruiter);
    }

    
    public void deleteRecruit(Long id) {
        recruiterRepository.deleteById(id);
    }
}

