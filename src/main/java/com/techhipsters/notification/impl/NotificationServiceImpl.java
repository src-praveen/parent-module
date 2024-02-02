package com.techhipsters.notification.impl;

import com.techhipsters.AddUserEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.modulith.events.ApplicationModuleListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationServiceImpl {

    private static final Logger log = LoggerFactory.getLogger(NotificationServiceImpl.class);

    @ApplicationModuleListener
    public void onAddUserEventListener(AddUserEvent addUserEvent){
        log.info("Event received {} ", addUserEvent.getName());
    }


}
