package com.xadmin.demo.respository;

import com.xadmin.demo.bean.Subject;
import org.springframework.data.repository.CrudRepository;

public interface SubjectRepository extends CrudRepository<Subject,String> {

}
