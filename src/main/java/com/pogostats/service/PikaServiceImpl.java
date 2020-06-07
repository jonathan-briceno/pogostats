package com.pogostats.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class PikaServiceImpl implements PikaService {

    @Override
    public String getPika(int pikaTimes) {
        StringBuffer pikas = new StringBuffer();
        for (int i = 0; i < pikaTimes ; i++) {
            pikas.append("Pika ");
        }
        pikas.append("Chu");

        return pikas.toString();
    }
}
