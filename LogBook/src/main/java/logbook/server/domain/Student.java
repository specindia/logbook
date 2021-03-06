package logbook.server.domain;

import static logbook.shared.scaffold.LogBookConstant.ADMIN;
import static logbook.shared.scaffold.LogBookConstant.CURRENT_USER;
import static logbook.shared.scaffold.LogBookConstant.STUDENT;
import static logbook.shared.scaffold.LogBookConstant.UNIQUE_ID;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.servlet.http.HttpSession;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import logbook.shared.Gender;
import logbook.shared.StudentStatus;
import logbook.shared.StudyYears;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

import com.allen_sauer.gwt.log.client.Log;
import com.google.web.bindery.requestfactory.server.RequestFactoryServlet;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(finders = { "findStudentsByEmailEquals" })
public class Student {

    @Size(max = 255)
    private String studentId;

    @Size(max = 255)
    private String shib_id;

    @Pattern(regexp = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}$")
    @Size(max = 255)   
    private String email;

    @Enumerated
    private Gender gender;

    @NotNull
    @Size(max = 255)
    private String name;

    @NotNull
    @Size(max = 255)
    private String preName;

    @Enumerated
    private StudentStatus studentStatus;

    @Enumerated
    private StudyYears studyYear;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "student")
    private Set<SkillAcquired> skillAcquired = new HashSet<SkillAcquired>();
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "student")
    private Set<SkillComment> skillComments = new HashSet<SkillComment>();
    
    public static logbook.server.domain.Student findStudentFromSession() 
    {
        HttpSession session = RequestFactoryServlet.getThreadLocalRequest().getSession();
        String shibId = (String) session.getAttribute(UNIQUE_ID);
        Log.info("shib id: " + shibId);
        Student student=Student.findStudentUsingShibId(shibId);
        return student;
    }
    
    public static Student findStudentUsingShibId(String shibId) {
    	
    	CriteriaBuilder criteriaBuilder = entityManager().getCriteriaBuilder();
		CriteriaQuery<Student> criteriaQuery = criteriaBuilder.createQuery(Student.class);
		Root<Student> from = criteriaQuery.from(Student.class);
					
		Predicate shibIdPredicate = criteriaBuilder.equal(from.get("shib_id"), shibId);
		criteriaQuery.where(shibIdPredicate);
		
		TypedQuery<Student> q = entityManager().createQuery(criteriaQuery);
		
		//Log.info("Query : " + q.unwrap(Query.class).getQueryString());
		List<Student> students = q.getResultList();
		if(students.size() > 0) {
			return students.get(0); 
		}else {
			return null;	
		}   
	}

	public static Boolean isCurrentUserStudent() {
    	HttpSession session = RequestFactoryServlet.getThreadLocalRequest().getSession();
    	if(STUDENT.equals(session.getAttribute(CURRENT_USER))) {
    		return true;
    	}else if(ADMIN.equals(session.getAttribute(CURRENT_USER))) {
    		return false;
    	}
    	else {
    		return null;
    	}
    }
}
