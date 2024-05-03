package com.example.assessment;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;

@Mapper
public interface AssessmentMapper {
    @Select("SELECT * FROM assessments WHERE name LIKE CONCAT(#{prefix}, '%' )")
    List<Assessment> findByNameStartingWith(String prefix);


    @Select("SELECT * FROM assessments WHERE id = #{id}")
    Optional<Assessment> findByIdSearch(int id);
}
