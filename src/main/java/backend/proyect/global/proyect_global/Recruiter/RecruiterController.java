package backend.proyect.global.proyect_global.Recruiter;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/recruiters")
public class RecruiterController {
 
    @Autowired
    private RecruiterService serviceRt;

    @GetMapping
    public List<Recruiter> ListAll() {
        return serviceRt.getAllRecruiters();
    }

    @PostMapping
    public Recruiter create(@RequestBody Recruiter recruiter){
        return serviceRt.createRecruit(recruiter);
    }

    @PostMapping("edit/{id}")
    public Recruiter update(@RequestBody Recruiter recruiter, @PathVariable Long id){
        recruiter.setIdRecruiter(id);
        return serviceRt.createRecruit(recruiter);
    }

    @DeleteMapping("eliminate/{id}")
    public void eliminate(@PathVariable Long id){
        serviceRt.deleteRecruit(id);
}



}
