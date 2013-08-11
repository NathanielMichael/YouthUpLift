package org.battlehack.youthuplift.controller;

import org.battlehack.youthuplift.model.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@Controller
public class ProfileController
{
    @RequestMapping("/api/profile")
    public @ResponseBody ArrayList<Profile> list(HttpServletResponse response) throws IOException
    {
        ArrayList<Profile> profiles = new ArrayList<Profile>();
        Profile profile1 = new Profile();
        profile1.setName("Bryan");
        Profile profile2 = new Profile();
        profile2.setName("Kira");
        Profile profile3 = new Profile();
        profile3.setName("Nate");
        Profile profile4 = new Profile();
        profile4.setName("Katie");

        profiles.add(profile1);
        profiles.add(profile2);
        profiles.add(profile3);
        profiles.add(profile4);

        return profiles;
    }
}
