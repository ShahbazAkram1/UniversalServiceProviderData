/**
 * Author: Shahbaz Ali
 * Email: shahbazkhaniq@gmail.com
 * Date: 9/11/2023$
 * Time: 11:44 PM$
 * Project Name: UniversalServiceProviderData$
 */


package com.uspd.UniversalServiceProviderData.service.impl;

import com.uspd.UniversalServiceProviderData.entity.USPDataEntity;
import com.uspd.UniversalServiceProviderData.exception.CustomJsonSerializationException;
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

    @Override
    public USPDataEntity getUniversalServiceProviderDataById(Long id) {
        USPDataEntity uspData = uspDataRepository.findById(id).orElse(null);
        if (uspData==null){
            throw new CustomJsonSerializationException("Universal service provider data not found",new Exception());
        }
        return uspData;

    }

    @Override
    public USPDataEntity updateUniversalServiceProviderData(Long id, USPDataEntity universalServiceProviderData) {
        USPDataEntity existingUniversalServiceProviderData = getUniversalServiceProviderDataById(id);
        if (existingUniversalServiceProviderData == null) {
            throw new CustomJsonSerializationException("Universal service provider data not found",new Exception());
        }
        if (existingUniversalServiceProviderData != null) {
            existingUniversalServiceProviderData.setName(universalServiceProviderData.getName());
            existingUniversalServiceProviderData.setAddress(universalServiceProviderData.getAddress());
            existingUniversalServiceProviderData.setPhoneNumber(universalServiceProviderData.getPhoneNumber());
            existingUniversalServiceProviderData.setWebsite(universalServiceProviderData.getWebsite());

            return uspDataRepository.save(existingUniversalServiceProviderData);
        } else {
            return null;
        }
    }

    @Override
    public void deleteUniversalServiceProviderData(Long id) {
        uspDataRepository.deleteById(id);
    }
}
