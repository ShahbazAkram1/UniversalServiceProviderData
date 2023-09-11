/**
 * Author: Shahbaz Ali
 * Email: shahbazkhaniq@gmail.com
 * Date: 9/11/2023$
 * Time: 11:12 PM$
 * Project Name: UniversalServiceProviderData$
 */


package com.uspd.UniversalServiceProviderData.repository;

import com.uspd.UniversalServiceProviderData.entity.USPDataEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface USPDataRepository extends JpaRepository<USPDataEntity, Long> {

}
