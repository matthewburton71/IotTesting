/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resource;

import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author matthew
 */
public class WebThing {

    public WebThing() {
        createdAt = currentTime();
        updatedAt = currentTime();
        description = System.getProperty("os.name") + " " +
                System.getProperty("os.version") + " " +
                System.getProperty("os.arch") + " " +
                System.getProperty("java.vm.name") + " " +
                System.getProperty("java.version");
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        updatedAt = currentTime();
        return updatedAt;
    }
    
    private String id = "myPi2";
    String name = "My Rastperry Pi";
    String description = "This is my Rastpery Pt rev2";
    String createdAt = "";
    String updatedAt = "";
//    String updatedAt = "";
    
    
    /// helper meathods
    private String currentTime () {
        String thisMoment = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mmX")
                              .withZone(ZoneOffset.UTC)
                              .format(Instant.now());
        return thisMoment;
    }
}
