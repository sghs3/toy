package com.project.toy.biz.sample.mapper;

import com.project.toy.biz.sample.domain.SampleVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SampleMapper {
    SampleVO getSampleInfo ();
}
