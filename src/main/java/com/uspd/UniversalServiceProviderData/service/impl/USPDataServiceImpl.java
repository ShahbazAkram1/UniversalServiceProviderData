/**
 * Author: Shahbaz Ali
 * Email: shahbazkhaniq@gmail.com
 * Date: 9/11/2023$
 * Time: 11:44 PM$
 * Project Name: UniversalServiceProviderData$
 */


package com.uspd.UniversalServiceProviderData.service.impl;

import com.uspd.UniversalServiceProviderData.entity.USPDataEntity;
import com.uspd.UniversalServiceProviderData.repository.USPDataRepository;
import com.uspd.UniversalServiceProviderData.service.USPDataService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class USPDataServiceImpl implements USPDataService {

    private final USPDataRepository uspDataRepository;

    public USPDataServiceImpl(USPDataRepository uspDataRepository) {
        this.uspDataRepository = uspDataRepository;
    }

    @Override
    public USPDataEntity createUniversalServiceProviderData(USPDataEntity universalServiceProviderData) {
        return uspDataRepository.save(universalServiceProviderData);
    }

    @Override
    public List<USPDataEntity> getAllUniversalServiceProviderData() {
        return uspDataRepository.findAll();
    }
}
