// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package logbook.server.domain;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import logbook.server.domain.Student;
import logbook.server.domain.StudentDataOnDemand;
import logbook.shared.Gender;
import logbook.shared.StudentStatus;
import logbook.shared.StudyYears;
import org.springframework.stereotype.Component;

privileged aspect StudentDataOnDemand_Roo_DataOnDemand {
    
    declare @type: StudentDataOnDemand: @Component;
    
    private Random StudentDataOnDemand.rnd = new SecureRandom();
    
    private List<Student> StudentDataOnDemand.data;
    
    public Student StudentDataOnDemand.getNewTransientStudent(int index) {
        Student obj = new Student();
        setEmail(obj, index);
        setGender(obj, index);
        setName(obj, index);
        setPreName(obj, index);
        setShib_id(obj, index);
        setStudentId(obj, index);
        setStudentStatus(obj, index);
        setStudyYear(obj, index);
        return obj;
    }
    
    public void StudentDataOnDemand.setEmail(Student obj, int index) {
        String email = "foo" + index + "@bar.com";
        if (email.length() > 40) {
            email = email.substring(0, 40);
        }
        obj.setEmail(email);
    }
    
    public void StudentDataOnDemand.setGender(Student obj, int index) {
        Gender gender = Gender.class.getEnumConstants()[0];
        obj.setGender(gender);
    }
    
    public void StudentDataOnDemand.setName(Student obj, int index) {
        String name = "name_" + index;
        if (name.length() > 40) {
            name = name.substring(0, 40);
        }
        obj.setName(name);
    }
    
    public void StudentDataOnDemand.setPreName(Student obj, int index) {
        String preName = "preName_" + index;
        if (preName.length() > 40) {
            preName = preName.substring(0, 40);
        }
        obj.setPreName(preName);
    }
    
    public void StudentDataOnDemand.setShib_id(Student obj, int index) {
        String shib_id = "shib_id_" + index;
        if (shib_id.length() > 50) {
            shib_id = shib_id.substring(0, 50);
        }
        obj.setShib_id(shib_id);
    }
    
    public void StudentDataOnDemand.setStudentId(Student obj, int index) {
        String studentId = "studentId_" + index;
        if (studentId.length() > 45) {
            studentId = studentId.substring(0, 45);
        }
        obj.setStudentId(studentId);
    }
    
    public void StudentDataOnDemand.setStudentStatus(Student obj, int index) {
        StudentStatus studentStatus = StudentStatus.class.getEnumConstants()[0];
        obj.setStudentStatus(studentStatus);
    }
    
    public void StudentDataOnDemand.setStudyYear(Student obj, int index) {
        StudyYears studyYear = StudyYears.class.getEnumConstants()[0];
        obj.setStudyYear(studyYear);
    }
    
    public Student StudentDataOnDemand.getSpecificStudent(int index) {
        init();
        if (index < 0) {
            index = 0;
        }
        if (index > (data.size() - 1)) {
            index = data.size() - 1;
        }
        Student obj = data.get(index);
        Long id = obj.getId();
        return Student.findStudent(id);
    }
    
    public Student StudentDataOnDemand.getRandomStudent() {
        init();
        Student obj = data.get(rnd.nextInt(data.size()));
        Long id = obj.getId();
        return Student.findStudent(id);
    }
    
    public boolean StudentDataOnDemand.modifyStudent(Student obj) {
        return false;
    }
    
    public void StudentDataOnDemand.init() {
        int from = 0;
        int to = 10;
        data = Student.findStudentEntries(from, to);
        if (data == null) {
            throw new IllegalStateException("Find entries implementation for 'Student' illegally returned null");
        }
        if (!data.isEmpty()) {
            return;
        }
        
        data = new ArrayList<Student>();
        for (int i = 0; i < 10; i++) {
            Student obj = getNewTransientStudent(i);
            try {
                obj.persist();
            } catch (ConstraintViolationException e) {
                StringBuilder msg = new StringBuilder();
                for (Iterator<ConstraintViolation<?>> iter = e.getConstraintViolations().iterator(); iter.hasNext();) {
                    ConstraintViolation<?> cv = iter.next();
                    msg.append("[").append(cv.getConstraintDescriptor()).append(":").append(cv.getMessage()).append("=").append(cv.getInvalidValue()).append("]");
                }
                throw new RuntimeException(msg.toString(), e);
            }
            obj.flush();
            data.add(obj);
        }
    }
    
}
