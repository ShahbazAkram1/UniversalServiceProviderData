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
