package in.strikes.springcruddemo.service;

import org.springframework.stereotype.Component;

import in.strikes.springcruddemo.Entity.student;
import in.strikes.springcruddemo.Repo.studentRepo;

@Component
public class studentService {
    private studentRepo studentRepos;
    public studentService(studentRepo studentRepo) {
        this.studentRepos = studentRepo;
    }

    public student creaStudent(student studentreq){
        return null;
    }
}
