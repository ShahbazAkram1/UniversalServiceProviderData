/**
 * Author: Shahbaz Ali
 * Email: shahbazkhaniq@gmail.com
 * Date: 9/11/2023$
 * Time: 11:35 PM$
 * Project Name: UniversalServiceProviderData$
 */


package com.uspd.UniversalServiceProviderData.controller;

import com.uspd.UniversalServiceProviderData.entity.USPDataEntity;
import com.uspd.UniversalServiceProviderData.exception.InvalidateFormatException;
import com.uspd.UniversalServiceProviderData.exception.RequiredFieldValidationException;
import com.uspd.UniversalServiceProviderData.service.USPDataService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class USPDataController {

    private final USPDataService uspDataService;

    public USPDataController(USPDataService uspDataService) {
        this.uspDataService = uspDataService;
    }

    @PostMapping("/universal-service-provider-data")
    public USPDataEntity createUniversalServiceProviderData(@RequestBody USPDataEntity universalServiceProviderData) {

        if (StringUtils.isNotBlank(universalServiceProviderData.getName())) {
            throw new RequiredFieldValidationException("Universal service provider data: name is required", new Exception());
        }
        if (StringUtils.isBlank(universalServiceProviderData.getAddress())) {
            throw new RequiredFieldValidationException("Universal service provider data: address is required", new Exception());
        }

        if (StringUtils.isBlank(universalServiceProviderData.getPhoneNumber())) {
            throw new RequiredFieldValidationException("Universal service provider data: phone number is required", new Exception());
        }

        if (StringUtils.isBlank(universalServiceProviderData.getWebsite())) {
            throw new RequiredFieldValidationException("Universal service provider data: website is required", new Exception());
        }

        if (StringUtils.isBlank(universalServiceProviderData.getDate())) {
            throw new InvalidateFormatException("Universal service provider data: date is required", new Exception());
        }

        return uspDataService.createUniversalServiceProviderData(universalServiceProviderData);
    }

    @GetMapping("/universal-service-provider-data")
    public List<USPDataEntity> getAllUniversalServiceProviderData() {
        return uspDataService.getAllUniversalServiceProviderData();
    }

    @GetMapping("/universal-service-provider-data/{id}")
    public USPDataEntity getUniversalServiceProviderDataById(@PathVariable Long id) {
        return uspDataService.getUniversalServiceProviderDataById(id);
    }

    @PutMapping("/universal-service-provider-data/{id}")
    public USPDataEntity updateUniversalServiceProviderData(@PathVariable Long id, @RequestBody USPDataEntity uspDataEntity) {
        return uspDataService.updateUniversalServiceProviderData(id, uspDataEntity);
    }

    @DeleteMapping("/universal-service-provider-data/{id}")
    public void deleteUniversalServiceProviderData(@PathVariable Long id) {
        uspDataService.deleteUniversalServiceProviderData(id);
    }

}
