package com.board.back.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;

@Mapper
@Repository
public interface MybatisMapper {

    ArrayList<HashMap<String, Object>> findAll();
}