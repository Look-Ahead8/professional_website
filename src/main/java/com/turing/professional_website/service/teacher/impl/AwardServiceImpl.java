package com.turing.professional_website.service.teacher.impl;

import com.turing.professional_website.dao.AwardMapper;
import com.turing.professional_website.entity.Award;
import com.turing.professional_website.entity.AwardExample;
import com.turing.professional_website.service.teacher.AwardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Jack
 * @date 2019-06-27-21:52
 */
@Service
public class AwardServiceImpl implements AwardService {

    @Autowired
    AwardMapper awardMapper;

    @Override
    public boolean addAward(Award award) {
        int row = awardMapper.insert(award);
        return (row != 0);
    }

    @Override
    public boolean delAward(Integer awardId) {

        AwardExample awardExample = new AwardExample();
        awardExample.createCriteria().andAwardsIdEqualTo(awardId);
        int row = awardMapper.deleteByExample(awardExample);
        return (row != 0);

    }
}
