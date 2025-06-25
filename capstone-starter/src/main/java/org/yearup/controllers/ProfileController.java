package org.yearup.controllers;

import org.springframework.web.bind.annotation.*;
import org.yearup.data.ProfileDao;
import org.yearup.models.Profile;

@RestController
@RequestMapping("/profile")
@CrossOrigin
public class ProfileController {

    private final ProfileDao profileDao;

    public ProfileController(ProfileDao profileDao) {
        this.profileDao = profileDao;
    }


    @GetMapping("/{userId}")
    public Profile getProfile(@PathVariable int userId) {
        return profileDao.getByUserId(userId);
    }


    @PostMapping
    public Profile createProfile(@RequestBody Profile profile) {
        return profileDao.create(profile);
    }


    @PutMapping("/{userId}")
    public void updateProfile(@PathVariable int userId, @RequestBody Profile profile) {
        profile.setUserId(userId);
        profileDao.update(profile);
    }
}
