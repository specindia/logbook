// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package logbook.server.domain;

import java.util.List;
import logbook.server.domain.SkilAcquired;
import logbook.server.domain.SkilAcquiredDataOnDemand;
import logbook.server.domain.SkilAcquiredIntegrationTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

privileged aspect SkilAcquiredIntegrationTest_Roo_IntegrationTest {
    
    declare @type: SkilAcquiredIntegrationTest: @RunWith(SpringJUnit4ClassRunner.class);
    
    declare @type: SkilAcquiredIntegrationTest: @ContextConfiguration(locations = "classpath:/META-INF/spring/applicationContext*.xml");
    
    declare @type: SkilAcquiredIntegrationTest: @Transactional;
    
    @Autowired
    private SkilAcquiredDataOnDemand SkilAcquiredIntegrationTest.dod;
    
    @Test
    public void SkilAcquiredIntegrationTest.testCountSkilAcquireds() {
        Assert.assertNotNull("Data on demand for 'SkilAcquired' failed to initialize correctly", dod.getRandomSkilAcquired());
        long count = SkilAcquired.countSkilAcquireds();
        Assert.assertTrue("Counter for 'SkilAcquired' incorrectly reported there were no entries", count > 0);
    }
    
    @Test
    public void SkilAcquiredIntegrationTest.testFindSkilAcquired() {
        SkilAcquired obj = dod.getRandomSkilAcquired();
        Assert.assertNotNull("Data on demand for 'SkilAcquired' failed to initialize correctly", obj);
        Long id = obj.getId();
        Assert.assertNotNull("Data on demand for 'SkilAcquired' failed to provide an identifier", id);
        obj = SkilAcquired.findSkilAcquired(id);
        Assert.assertNotNull("Find method for 'SkilAcquired' illegally returned null for id '" + id + "'", obj);
        Assert.assertEquals("Find method for 'SkilAcquired' returned the incorrect identifier", id, obj.getId());
    }
    
    @Test
    public void SkilAcquiredIntegrationTest.testFindAllSkilAcquireds() {
        Assert.assertNotNull("Data on demand for 'SkilAcquired' failed to initialize correctly", dod.getRandomSkilAcquired());
        long count = SkilAcquired.countSkilAcquireds();
        Assert.assertTrue("Too expensive to perform a find all test for 'SkilAcquired', as there are " + count + " entries; set the findAllMaximum to exceed this value or set findAll=false on the integration test annotation to disable the test", count < 250);
        List<SkilAcquired> result = SkilAcquired.findAllSkilAcquireds();
        Assert.assertNotNull("Find all method for 'SkilAcquired' illegally returned null", result);
        Assert.assertTrue("Find all method for 'SkilAcquired' failed to return any data", result.size() > 0);
    }
    
    @Test
    public void SkilAcquiredIntegrationTest.testFindSkilAcquiredEntries() {
        Assert.assertNotNull("Data on demand for 'SkilAcquired' failed to initialize correctly", dod.getRandomSkilAcquired());
        long count = SkilAcquired.countSkilAcquireds();
        if (count > 20) count = 20;
        int firstResult = 0;
        int maxResults = (int) count;
        List<SkilAcquired> result = SkilAcquired.findSkilAcquiredEntries(firstResult, maxResults);
        Assert.assertNotNull("Find entries method for 'SkilAcquired' illegally returned null", result);
        Assert.assertEquals("Find entries method for 'SkilAcquired' returned an incorrect number of entries", count, result.size());
    }
    
    @Test
    public void SkilAcquiredIntegrationTest.testFlush() {
        SkilAcquired obj = dod.getRandomSkilAcquired();
        Assert.assertNotNull("Data on demand for 'SkilAcquired' failed to initialize correctly", obj);
        Long id = obj.getId();
        Assert.assertNotNull("Data on demand for 'SkilAcquired' failed to provide an identifier", id);
        obj = SkilAcquired.findSkilAcquired(id);
        Assert.assertNotNull("Find method for 'SkilAcquired' illegally returned null for id '" + id + "'", obj);
        boolean modified =  dod.modifySkilAcquired(obj);
        Integer currentVersion = obj.getVersion();
        obj.flush();
        Assert.assertTrue("Version for 'SkilAcquired' failed to increment on flush directive", (currentVersion != null && obj.getVersion() > currentVersion) || !modified);
    }
    
    @Test
    public void SkilAcquiredIntegrationTest.testMergeUpdate() {
        SkilAcquired obj = dod.getRandomSkilAcquired();
        Assert.assertNotNull("Data on demand for 'SkilAcquired' failed to initialize correctly", obj);
        Long id = obj.getId();
        Assert.assertNotNull("Data on demand for 'SkilAcquired' failed to provide an identifier", id);
        obj = SkilAcquired.findSkilAcquired(id);
        boolean modified =  dod.modifySkilAcquired(obj);
        Integer currentVersion = obj.getVersion();
        SkilAcquired merged = obj.merge();
        obj.flush();
        Assert.assertEquals("Identifier of merged object not the same as identifier of original object", merged.getId(), id);
        Assert.assertTrue("Version for 'SkilAcquired' failed to increment on merge and flush directive", (currentVersion != null && obj.getVersion() > currentVersion) || !modified);
    }
    
    @Test
    public void SkilAcquiredIntegrationTest.testPersist() {
        Assert.assertNotNull("Data on demand for 'SkilAcquired' failed to initialize correctly", dod.getRandomSkilAcquired());
        SkilAcquired obj = dod.getNewTransientSkilAcquired(Integer.MAX_VALUE);
        Assert.assertNotNull("Data on demand for 'SkilAcquired' failed to provide a new transient entity", obj);
        Assert.assertNull("Expected 'SkilAcquired' identifier to be null", obj.getId());
        obj.persist();
        obj.flush();
        Assert.assertNotNull("Expected 'SkilAcquired' identifier to no longer be null", obj.getId());
    }
    
    @Test
    public void SkilAcquiredIntegrationTest.testRemove() {
        SkilAcquired obj = dod.getRandomSkilAcquired();
        Assert.assertNotNull("Data on demand for 'SkilAcquired' failed to initialize correctly", obj);
        Long id = obj.getId();
        Assert.assertNotNull("Data on demand for 'SkilAcquired' failed to provide an identifier", id);
        obj = SkilAcquired.findSkilAcquired(id);
        obj.remove();
        obj.flush();
        Assert.assertNull("Failed to remove 'SkilAcquired' with identifier '" + id + "'", SkilAcquired.findSkilAcquired(id));
    }
    
}
