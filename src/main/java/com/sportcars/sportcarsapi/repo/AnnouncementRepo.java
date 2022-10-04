package com.sportcars.sportcarsapi.repo;

import com.sportcars.sportcarsapi.model.Announcement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AnnouncementRepo extends JpaRepository<Announcement, Long > {

    void deleteAnnouncementById(Long id);

    Optional<Announcement> findAnnouncementById(Long id);
}
