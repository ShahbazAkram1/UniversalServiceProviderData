/**
 * Author: Shahbaz Ali
 * Email: shahbazkhaniq@gmail.com
 * Date: 9/11/2023$
 * Time: 11:35 PM$
 * Project Name: UniversalServiceProviderData$
 */


package com.uspd.UniversalServiceProviderData.controller;

import com.uspd.UniversalServiceProviderData.entity.USPDataEntity;
import com.uspd.UniversalServiceProviderData.service.USPDataService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class USPDataController {

    private final USPDataService uspDataService;

    public USPDataController(USPDataService uspDataService) {
        this.uspDataService = uspDataService;
    }

    @PostMapping("/universal-service-provider-data")
    public USPDataEntity createUniversalServiceProviderData(@RequestBody USPDataEntity universalServiceProviderData) {
        return uspDataService.createUniversalServiceProviderData(universalServiceProviderData);
    }


}
