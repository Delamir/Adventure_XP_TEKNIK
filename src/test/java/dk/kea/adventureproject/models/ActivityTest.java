package dk.kea.adventureproject.models;

import dk.kea.adventureproject.models.Activity;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ActivityTest {

    @Test
    void Activity() {

        Activity activity = new Activity();

        activity.setAgeLimit(18);
        activity.setHeightLimit(140);
        activity.setActivityID(1);
        activity.setActivityName("Sumo");
        activity.setTimeLimit(2);
        activity.setDescription("Test");
        assertEquals(18, activity.getAgeLimit());
        assertEquals(140, activity.getHeightLimit());
        assertEquals(1, activity.getActivityID());
        assertEquals("Sumo", activity.getActivityName());
        assertEquals(2, activity.getTimeLimit());
        assertEquals("Test", activity.getDescription());
    }
}