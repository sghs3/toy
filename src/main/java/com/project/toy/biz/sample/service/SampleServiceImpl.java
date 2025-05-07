package com.project.toy.biz.sample.service;

import com.project.toy.biz.sample.domain.SampleVO;
import com.project.toy.biz.sample.mapper.SampleMapper;
import lombok.*;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class SampleServiceImpl implements SampleService{
    private final SampleMapper sampleMapper;
    @Override
    public SampleVO getSampleInfo () {
        return sampleMapper.getSampleInfo();
    }
    @Override
    public String printSampleInfo () {
        SampleVO sampleVO = getSampleInfo();
        if (sampleVO == null) return "no Data";
        return "name : " + sampleVO.getSampleName() + ", code : " + sampleVO.getSampleCode();
    }
}
