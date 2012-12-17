// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package logbook.server.domain;

import java.util.Set;
import logbook.server.domain.ClassificationTopic;
import logbook.server.domain.Skill;
import logbook.server.domain.Topic;

privileged aspect Topic_Roo_JavaBean {
    
    public String Topic.getTopicDescription() {
        return this.topicDescription;
    }
    
    public void Topic.setTopicDescription(String topicDescription) {
        this.topicDescription = topicDescription;
    }
    
    public Set<Skill> Topic.getSkills() {
        return this.skills;
    }
    
    public void Topic.setSkills(Set<Skill> skills) {
        this.skills = skills;
    }
    
    public ClassificationTopic Topic.getClassificationTopic() {
        return this.classificationTopic;
    }
    
    public void Topic.setClassificationTopic(ClassificationTopic classificationTopic) {
        this.classificationTopic = classificationTopic;
    }
    
}
