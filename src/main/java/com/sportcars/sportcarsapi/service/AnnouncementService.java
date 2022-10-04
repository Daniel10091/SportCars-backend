package com.sportcars.sportcarsapi.service;

import com.sportcars.sportcarsapi.exception.AnnouncementNotFoundException;
import com.sportcars.sportcarsapi.model.Announcement;
import com.sportcars.sportcarsapi.repo.AnnouncementRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class AnnouncementService {
    private final AnnouncementRepo announcementRepo;

    @Autowired
    public AnnouncementService(AnnouncementRepo announcementRepo) {
        this.announcementRepo = announcementRepo;
    }

    public Announcement addAnnouncement(Announcement announcement) {
        announcement.setAnnouncementCode(UUID.randomUUID().toString());
        return announcementRepo.save(announcement);
    }

    public List<Announcement> findAllAnnouncement() {
        return announcementRepo.findAll();
    }

    public Announcement updateAnnouncement(Announcement announcement) {
        return announcementRepo.save(announcement);
    }

    public Announcement findAnnouncementById(Long id) {
        return announcementRepo.findAnnouncementById(id)
                .orElseThrow(() -> new AnnouncementNotFoundException("Announcement by id " + id + " was not found"));
    }

    public void deleteAnnouncement(Long id) {
        announcementRepo.deleteAnnouncementById(id);
    }
}
