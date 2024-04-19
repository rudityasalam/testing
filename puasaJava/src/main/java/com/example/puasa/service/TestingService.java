package com.example.puasa.service;

import com.example.puasa.Entity.TestingEntity;
import com.example.puasa.Utils.MessageModel;
import com.example.puasa.repository.TestingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class TestingService {

    @Autowired
    private TestingRepository testingRepository;

    public ResponseEntity<MessageModel> getAll(TestingEntity testingEntity) {
        MessageModel msg = new MessageModel();
        try {
            Map<String, Object> result = new HashMap<>();
            List<TestingEntity> data = testingRepository.findAll();
            if (data.isEmpty()) {
                msg.setStatus(true);
                msg.setMsg("Data Tidak Ditemukan");
                msg.setData(null);
                return ResponseEntity.ok().body(msg);
            } else {
                msg.setStatus(true);
                msg.setMsg("Success");
                result.put("Data", data);
                msg.setData(null);
                return ResponseEntity.ok().body(msg);
            }
        }catch (Exception e){
            msg.setStatus(false);
            msg.setMsg(e.getMessage());
            return ResponseEntity.ok().body(msg);
        }
    }


}