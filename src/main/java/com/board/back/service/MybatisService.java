package com.board.back.service;

import com.board.back.mapper.MybatisMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class MybatisService {

    @Autowired
    MybatisMapper mybatisMapper;

    public ArrayList<HashMap<String, Object>> findAll() {
        return mybatisMapper.findAll();
    }
}