// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package logbook.client.managed.request;

import logbook.shared.scaffold.ScaffoldRequestFactory;
import logbook.shared.scaffold.SkillNonRooRequest;

public interface ApplicationRequestFactory extends ScaffoldRequestFactory {

    AdministratorRequest administratorRequest();

    ClassificationTopicRequest classificationTopicRequest();

    KeywordRequest keywordRequest();

    MainClassificationRequest mainClassificationRequest();

    SkilAcquiredRequest skilAcquiredRequest();

    SkillAcquiredRequest skillAcquiredRequest();

    SkillLevelRequest skillLevelRequest();

    SkillNonRooRequest skillRequest();

    StudentRequest studentRequest();

    TopicRequest topicRequest();
}
