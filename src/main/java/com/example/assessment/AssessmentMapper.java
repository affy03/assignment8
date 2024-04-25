package com.example.assessment;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AssessmentMapper {
    @Select("SELECT * FROM assessments WHERE name LIKE CONCAT(#{prefix}, '%' )")
    List<Assessment> findByNameStartingWith(String prefix);
}
