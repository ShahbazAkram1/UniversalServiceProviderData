package com.uspd.UniversalServiceProviderData.service;

import com.uspd.UniversalServiceProviderData.entity.USPDataEntity;

import java.util.List;

/**
 * Author: Shahbaz Ali
 * Email: shahbazkhaniq@gmail.com
 * Date: 9/11/2023$
 * Time: 11:15 PM$
 * Project Name: UniversalServiceProviderData$
 */

public interface USPDataService {

    USPDataEntity createUniversalServiceProviderData(USPDataEntity universalServiceProviderData);

    List<USPDataEntity> getAllUniversalServiceProviderData();

    USPDataEntity getUniversalServiceProviderDataById(Long id);

    USPDataEntity updateUniversalServiceProviderData(Long id, USPDataEntity universalServiceProviderData);

}
