package com.sportcars.sportcarsapi.resources;

import com.sportcars.sportcarsapi.model.Announcement;
import com.sportcars.sportcarsapi.service.AnnouncementService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("sportcarsapi")
public class AnnouncementResource {
    private final AnnouncementService announcementService;

    public AnnouncementResource(AnnouncementService announcementService) {
        this.announcementService = announcementService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Announcement>> getAllAnnouncements() {
        List<Announcement> announcements = announcementService.findAllAnnouncement();
        return new ResponseEntity<>(announcements, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Announcement> getAnnouncementById(@PathVariable("id") Long id) {
        Announcement announcement = announcementService.findAnnouncementById(id);
        return new ResponseEntity<>(announcement, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Announcement> addAnnouncement(@RequestBody Announcement announcement) {
        Announcement newAnnouncement = announcementService.addAnnouncement(announcement);
        return new ResponseEntity<>(newAnnouncement, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Announcement> updateAnnouncement(@RequestBody Announcement announcement) {
        Announcement announcements = announcementService.updateAnnouncement(announcement);
        return new ResponseEntity<>(announcements, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteAnnouncement(@PathVariable("id") Long id) {
        announcementService.deleteAnnouncement(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
