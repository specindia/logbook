package logbook.server.domain;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.EntityManager;
import javax.persistence.OneToMany;
import javax.persistence.TypedQuery;

import org.mortbay.log.Log;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class SkillLevel {

    private Integer levelNumber;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "skillLevel")
    private Set<Skill> skills = new HashSet<Skill>();
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "skillLevel")
    private Set<SkillAcquired> skillAcquired = new HashSet<SkillAcquired>();
    
    public static SkillLevel findSkillByLevelNumber(Integer levelNumber)
    {
    	Log.info("Inside findSkillByLevelNumber with levelno " +levelNumber );
    	EntityManager em = entityManager();
    	
    	String query = "SELECT sl from SkillLevel as sl where sl.levelNumber="+levelNumber ;
    	Log.info("Query is :" + query);
    	TypedQuery<SkillLevel> result = em.createQuery(query, SkillLevel.class);
    	
    	return result.getSingleResult();
    }
}
