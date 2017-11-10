package com.sda.planer.planer.Services;

import com.sda.planer.planer.repository.MeetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MeetingService {

    private MeetingService meetingService;

    public MeetingService(MeetingRepository meetingRepository) {
        this.meetingR = meetingRepository;
    }
}
