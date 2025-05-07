package com.project.toy.biz.sample.service;

import com.project.toy.biz.sample.domain.SampleVO;
import lombok.*;


public interface SampleService {
    public SampleVO getSampleInfo ();
    public String printSampleInfo ();
}
